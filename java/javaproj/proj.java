import java.io.*;

class proj extends seat {

        public static void main(String args[])throws IOException{
                int i,j;
                String[]  mov={"Joker","War","Hustlers","The Lion King","The Sky Is Pink","Chichore"};
                
                BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );


                System.out .println("*******************************************************");
                System.out .println();
                System.out .println("~                Welcome to BookmyTicket              ~");
                System.out .println("*******************************************************");
                System.out .println();
                System.out.println("                   Please enter your name");   
                String name=br.readLine();    
                System.out.println("HELLO "+name);
                System.out .println("                 Please select your city ");
                System.out .println("          1.Mumbai   2.Kolkata  3.Chennai  4.Delhi");
                String choice=br.readLine();
                System.out.println("~~~~~~~Please select movie ~~~~~~~");
                for(i=0;i<mov.length;i++)
                {System.out .println(mov[i]);
                System.out .println("-------------------------------------------------------------------");
                }
                System.out.println("~~~~~~~Please enter the movie name ~~~~~~~");
                String movie=br.readLine();
                System.out.println("~~~~~~~Please enter the theatre number ~~~~~~~");
                proj p=new proj();
                int[] mumbai={100,70,150,200};
                int[] chennai={100,80,90,200};
                int[] kolkata={200,100,450,300};
                int[] delhi={100,400,330,200};
                int[] cseat=new int[10];
        
                String place="",th;
                int amt=0,x;
                switch (choice)
                {
                        case "1" :
                        place="mumbai";
                        System.out.println("~~~~~~~1.Raghulela mall 2.orbit mall 3.inorbit mall 4.oberoi mall ~~~~~~~");
                        System.out.println("~~~~~~~      100 Rs         70Rs         150Rs          200Rs     ~~~~~~~");
                        System.out.println("~~~~~~~                    Enter 1-4                              ~~~~~~~");
                        th=br.readLine(); 
                         x= Integer.parseInt ( th );
                         cseat=p.booking();
                        amt=p.finalamt(mumbai[x]);
                        break;
                        case "2" :
                        place="kolkata";
                        System.out.println("~~~~~~~1.Branga mall  2.V mall  3.LULU mall  4.oberon mall ~~~~~~~");
                        System.out.println("~~~~~~~     100 Rs      80Rs      90Rs           200Rs    ~~~~~~~");
                        System.out.println("~~~~~~~                    Enter 1-4                     ~~~~~~~");
                        th=br.readLine(); 
                        x= Integer.parseInt ( th );
                        cseat=p.booking();
                        amt=p.finalamt(kolkata[x]);
                        break;
                        case "3" :
                        place="chennai";
                        System.out.println("~~~~~~~1.Raghu mall   2.askon mall  3.rolo mall     4.B mall ~~~~~~~");
                        System.out.println("~~~~~~~     100 Rs         70Rs       450Rs           300Rs  ~~~~~~~");
                        System.out.println("~~~~~~~                    Enter 1-4                         ~~~~~~~");
                        th=br.readLine(); 
                        x= Integer.parseInt ( th );
                        cseat=p.booking();
                        amt=p.finalamt(chennai[x]);
                        break;
                        case "4" :
                        place="delhi";
                        System.out.println("~~~~~~~1.Runteh mall  2.hoye mall  3.viviyana mall    4.kudo mall  ~~~~~~~");
                        System.out.println("~~~~~~~      100 Rs       400Rs           330Rs             200Rs  ~~~~~~~");
                        System.out.println("~~~~~~~                    Enter 1-4                              ~~~~~~~");
                        th=br.readLine(); 
                        x= Integer.parseInt ( th );
                        cseat=p.booking();
                        amt=p.finalamt(delhi[x]);
                        break;
                        default:
                        System.out.println("invalid choice");
                        break;
                }
        System.out.println("Name:"+name);
        System.out.println("movie:"+movie+"\t"+"  Place  "+place);
        System.out.println("seat no:");
        for(int r=0;r<cseat.length;r++) {
                if(cseat[r]!=0)
                System.out.print(cseat[r]+"  ");}
        System.out.println("Total amount:"+amt);
        System.out.println("Thank You Visiting");



        }
}