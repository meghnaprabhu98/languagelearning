import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn import preprocessing
import matplotlib.pyplot as plt
def sigmoid(z):
    return 1 / (1 + np.exp(-z))
    
def linreg(x,y,x_val,y_val,lr,epoch):
    j=0
    x= np.array(x)
    x_val= np.array(x_val)
    y=np.asarray(y)
    y=np.resize(74,1)
    y_val=np.resize(74,1)
    w= np.array([[0.1],
                [0.2],
                [0.3],
                [0.4]])
    ct=[]
    b=1
    m=75
    
    for i in range(1,epoch+1):
        xtrained=forwardprop(w,x,b)
        Traincost=cost_func(xtrained,y)
        dw,db=back_prop(x,y,xtrained)
        w,b=update(w,b,dw,db,lr)
        if i%10==0:
            ct.append(Traincost)
        TrainMAE=(1/m)*(np.sum(np.abs(xtrained-y)))
        #validataion
        xtest=forwardprop(w,x_val,b)
        Testcost=cost_func(xtest,y_val)
        TestMAE=(1/m)*(np.sum(np.abs(xtest-y_val)))
        if i%10==0:
            print('epoch no  '+str(i)+' testcost  '+str(Testcost)+' traincost  '+str(Traincost)+' testMAE '+str(TestMAE)+' trainMAE  '+str(TrainMAE))

    plt.plot(ct)
    plt.xlabel('iteration')
    plt.ylabel('Training cost')
    plt.title('learning  rate'+str(lr))
    plt.show()



def forwardprop(w,x,b):

    h=sigmoid(b+x.dot(w))
    return h
        
def cost_func(h,y):
    m=75
    J=(1/(2*m))*np.sum(np.square(h-y))
    return J
def back_prop(x,y,h):
    m=75
    dh=(1/m)*(h-y)
    k=x.transpose()
    dw=np.dot(k,dh)
    db=np.sum(dh)
    return dw,db
def update(w,b,dw,db,lr):
    w=w-lr*dw
    b=b-lr*db
    return w,b     

def model(location):
    lr=[0.00075,0.00009,0.0001,0.0001,0.0004,0.0008]
    for i in lr:
        epoch=100
        iris = pd.read_csv(location)
        print("Dataframeupd : ")
        print(iris)
        Y=iris.iloc[:,-1]
        X=iris.iloc[:,0:4]
        label_encoder = preprocessing.LabelEncoder() 
        Y= label_encoder.fit_transform(Y) 
        X_train,X_test,Y_train,Y_test=train_test_split(X,Y,test_size=0.5,train_size=0.5,random_state=123)
        linreg(X_train,Y_train,X_test,Y_test,i,epoch)

model('iris.data')