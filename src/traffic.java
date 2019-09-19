import java.io.*;
import java.lang.*;
class traffic
{
    public static void main(String[]args)throws IOException
    {
        int c1=0;int c2=0;int c3=0;
        int a[]=new int[4];
        int b=0;
        InputStreamReader ob=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ob);
        do
        {
            System.out.println("Enter the No. of Cars in :");
            for(int i=0;i<4;i++)
            {
                System.out.print("R"+(i+1)+":");
                a[i]=Integer.parseInt(br.readLine());

            }
            String road[]={"R1","R2","R3","R4"};
            int temp=0;
            String temp1="";
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<3-i;j++)
                {
                    while(a[j+1]>a[j])
                    {
                        temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                        temp1=road[j];
                        road[j]=road[j+1];
                        road[j+1]=temp1;
                    }
                }
            }
            //a[3] are the minimum number of carS
            for(int i=a[0];i>a[3];i--)
            {
                c1++;//excess number of cars in road[0]
            }
            for(int i=a[1];i>a[3];i--)
            {
                c2++;//excess number of cars in road[1]
            }
            for(int i=a[2];i>a[3];i--)
            {
                c3++;//excess number of cars in road[2]
            }
            if(a[3]<50 && a[3]>=40)
            {
                int w4=(((a[3]-40)/2)+1)*3;
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       0|"+(c1*2)+"\t      "+(2*c1)+"|0\t      "+(2*(c1+c2))+"|0\t      "+(2*(c1+c2+c3))+"|0");
                System.out.println("RIGHT >        0|"+(c1*2)+"\t      "+(2*c1)+"|0\t      "+(2*(c1+c2))+"|0\t      "+(30+(2*(c1+c2+c3)))+"|0");
                System.out.println("");
                try {
                    Thread.sleep(c1*2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[1]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(c2*2+c3*2)+"|0\t       0|"+(c2*2)+"\t      "+(2*c2)+"|0\t      "+(2*(c2+c3))+"|0");
                System.out.println("RIGHT >       "+(c2*2+c3*2+60)+"|0\t       0|"+(c2*2)+"\t      "+(2*c2)+"|0\t      "+(2*(c2+c3)+30)+"|0");
                System.out.println("");
                try {
                    Thread.sleep(c2*2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[1]+ " AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+(c3*2)+"|0\t      "+(90+(2*c3))+"|0\t       0|"+(c3*2)+"\t       "+(2*c3)+"|0");
                System.out.println("RIGHT >       "+(c3*2+60)+"|0\t      "+(120+2*c3)+"|0\t       0|"+(c3*2)+"\t      "+((2*c3)+30)+"|0");
                System.out.println("");
                try {
                    Thread.sleep(c3*2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[2] +" AND "+ road[3]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[0] and road[3] Straight
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      0|"+30+"\t       "+90+"|0\t      90|0\t      "+(0)+"|30");
                System.out.println("RIGHT >       "+60+"|0\t       "+120+"|0\t      150|0\t      "+30+"|0");
                System.out.println("");
                try {
                    Thread.sleep(30000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[3]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[3] Straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+30+"|0\t      "+60+"|0\t      60|"+0+"\t       "+0+"|30");
                System.out.println("RIGHT >       "+30+"|0\t      "+90+"|0\t     120|"+0+"\t       "+0+"|30");
                System.out.println("");
                try {
                    Thread.sleep(30000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[3]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for ROAD[0] Straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+0+"|30\t      "+30+"|0\t      30|"+0+"\t     "+120+"|0");
                System.out.println("RIGHT >        "+0+"|30\t      "+60+"|0\t      90|"+0+"\t     "+150+"|0");
                System.out.println("");
                try {
                    Thread.sleep(30000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[1] +" AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[1] and road[2] straight
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+90+"|0\t       "+0+"|30\t       0|"+30+"\t      "+90+"|0");
                System.out.println("RIGHT >      "+(120+w4)+"|0\t      "+30+"|0\t      60|"+0+"\t     "+120+"|0");
                System.out.println("");
                try {
                    Thread.sleep(30000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[1]+ " AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road [1] straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+60+"|0\t       "+0+"|30\t      30|"+0+"\t      "+60+"|0");
                System.out.println("RIGHT >       "+(90+w4)+"|0\t       "+0+"|30\t      30|"+0+"\t      "+90+"|0");
                System.out.println("");
                try {
                    Thread.sleep(30000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[1]+ " AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[2] straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+30+"|0\t      "+(60+2*w4)+"|0\t       0|"+30+"\t      "+30+"|0");
                System.out.println("RIGHT >       "+(60+w4)+"|0\t     "+(90+2*w4)+"|0\t       0|"+30+"\t      "+60+"|0");
                System.out.println("");
                try {
                    Thread.sleep(30000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[2]+" AND "+road[3]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //repeating
                //forroad[0] and road[3]
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+0+"|30\t      "+(30+2*w4)+"|0\t       "+(30+2*w4)+"|"+0+"\t       "+0+"|30");
                System.out.println("RIGHT >       "+(30+w4)+"|0\t     "+(60+2*w4)+"|0\t       "+(60+3*w4)+"|0\t      "+30+"|0");
                System.out.println("");
                try {
                    Thread.sleep(30000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[3]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[3] Straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+w4+"|0\t      "+(2*w4)+"|0\t       "+(2*w4)+"|"+0+"\t       "+0+"|"+(w4));
                System.out.println("RIGHT >       "+(w4)+"|0\t     "+(30+2*w4)+"|0\t       "+(30+2*w4)+"|0\t      "+0+"|"+w4);
                System.out.println("");
                try {
                    Thread.sleep(w4*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[3]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for ROAD[0] Straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+0+"|"+w4+"\t       "+(w4)+"|0\t       "+(w4)+"|"+0+"\t      "+(30+3*w4)+"|"+0);
                System.out.println("RIGHT >        "+0+"|"+(w4)+"\t      "+(30+w4)+"|0\t      "+(30+w4)+"|0\t      "+(30+3*w4)+"|0");
                System.out.println("");
                try {
                    Thread.sleep(w4*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[1]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[1] and road[2] straight
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(30+2*w4)+"|"+0+"\t       "+0+"|30\t       "+0+"|"+30+"\t      "+(30+2*w4)+"|"+0);
                System.out.println("RIGHT >       "+(30+2*w4)+"|"+0+"\t      "+30+"|0\t      "+(30+w4)+"|0\t      "+(30+2*w4)+"|0");
                System.out.println("");
                try {
                    Thread.sleep(30000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[1]+ " AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road [1] straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(2*w4)+"|"+0+"\t       "+0+"|"+w4+"\t       "+w4+"|"+0+"\t      "+(2*w4)+"|"+0);
                System.out.println("RIGHT >       "+(2*w4)+"|"+0+"\t     "+0+"|"+w4+"\t       "+(w4)+"|0\t      "+(2*w4)+"|0");
                System.out.println("");
                try {
                    Thread.sleep(w4*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[2]+ " AND "+ road[1]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[2] straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+(w4)+"|"+0+"\t       "+w4+"|"+0+"\t       "+0+"|"+w4+"\t       "+(w4)+"|"+0);
                System.out.println("RIGHT >        "+(w4)+"|"+0+"\t       "+w4+"|"+0+"\t       "+(0)+"|"+w4+"\t       "+(w4)+"|0");
                System.out.println("");
                try {
                    Thread.sleep(w4*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            else if(a[3]>=50)
            {
                System.out.println("enter a number less than 50");
                break;
            }
            if(a[3]<40 && a[3]>=30)
            {
                int w=((a[3]-30)/2+1)*3;
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+0+"|"+(c1*2)+"\t      "+(2*c1)+"|"+0+"\t      "+(2*(c1+c2))+"|"+0+"\t      "+(2*(c1+c2+c3))+"|"+0);
                System.out.println("RIGHT >        "+0+"|"+(c1*2)+"\t      "+(2*c1)+"|"+0+"\t      "+(2*(c1+c2))+"|"+0+"\t      "+(2*(c1+c2+c3)+30)+"|0");
                System.out.println("");
                try {
                    Thread.sleep(c1*2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[1]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(2*(c3+c2))+"|"+0+"\t       "+0+"|"+(c2*2)+"\t      "+(2*c2)+"|"+0+"\t      "+(2*(c2+c3))+"|"+0);
                System.out.println("RIGHT >       "+(2*(c3+c2)+45)+"|"+0+"\t       "+0+"|"+(c2*2)+"\t      "+(2*c2)+"|"+0+"\t      "+(2*(c2+c3)+30)+"|0");
                System.out.println("");
                try {
                    Thread.sleep(c2*2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[2]+ " AND "+ road[1]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+(2*c3)+"|"+0+"\t      "+(60+2*c3)+"|"+0+"\t       "+0+"|"+(c3*2)+"\t       "+(2*c3)+"|"+0);
                System.out.println("RIGHT >       "+(2*c3+45)+"|"+0+"\t      "+(90+2*c3)+"|"+0+"\t       "+0+"|"+(c3*2)+"\t       "+(2*c3)+"|0");
                System.out.println("");
                try {
                    Thread.sleep(c3*2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[2]+" AND "+road[3]+"= Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[0] and road[3] Straight
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+0+"|"+30+"\t      "+(60)+"|"+0+"\t      "+60+"|"+(0)+"\t       "+(0)+"|"+30);
                System.out.println("RIGHT >       "+(45)+"|"+0+"\t      "+(90)+"|"+0+"\t     "+105+"|"+(0)+"\t      "+(30)+"|0");
                System.out.println("");
                try {
                    Thread.sleep(30000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[3]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[3] Straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+15+"|"+0+"\t      "+(30)+"|"+0+"\t      "+30+"|"+(0)+"\t       "+(0)+"|"+15);
                System.out.println("RIGHT >       "+(15)+"|"+0+"\t      "+(60)+"|"+0+"\t      "+75+"|"+(0)+"\t       "+(0)+"|15");
                System.out.println("");
                try {
                    Thread.sleep(15000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[3]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for ROAD[0] Straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+0+"|"+15+"\t      "+(15)+"|"+0+"\t      "+15+"|"+(0)+"\t      "+(75)+"|"+0);
                System.out.println("RIGHT >        "+(0)+"|"+15+"\t      "+(45)+"|"+0+"\t      "+60+"|"+(0)+"\t       "+(105)+"|0");
                System.out.println("");
                try {
                    Thread.sleep(15000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[1]+" AND "+road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[1] and road[2] straight
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+60+"|"+0+"\t       "+(0)+"|"+30+"\t       "+0+"|"+(30)+"\t      "+(60)+"|"+0);
                System.out.println("RIGHT >       "+(90+w)+"|"+0+"\t      "+(30)+"|"+0+"\t      "+45+"|"+(0)+"\t      "+(90)+"|0");
                System.out.println("");
                try{
                    Thread.sleep(30000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[1]+ " AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road [1] straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+30+"|"+0+"\t       "+(0)+"|"+15+"\t      "+15+"|"+(0)+"\t      "+(30)+"|"+0);
                System.out.println("RIGHT >       "+(60+w)+"|"+0+"\t       "+(0)+"|"+15+"\t      "+15+"|"+(0)+"\t      "+(60)+"|0");
                System.out.println("");
                try {
                    Thread.sleep(15000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[2]+ " AND "+ road[1]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[2] straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+15+"|"+0+"\t      "+(45+2*w)+"|"+0+"\t       "+0+"|"+(15)+"\t      "+(15)+"|"+0);
                System.out.println("RIGHT >       "+(45+w)+"|"+0+"\t      "+(75+2*w)+"|"+0+"\t      "+(75+3*w)+"|"+(15)+"\t      "+(45)+"|0");
                System.out.println("");
                try {
                    Thread.sleep(15000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[2]+ " AND "+ road[0]+" AND "+road[3]+ "= Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //repeating
                //forroad[0] and road[3]
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+0+"|"+30+"\t      "+(30+2*w)+"|"+0+"\t      "+(30+2*w)+"|"+(0)+"\t       "+0+"|"+30);
                System.out.println("RIGHT >       "+(30+w)+"|"+0+"\t      "+(60+2*w)+"|"+0+"\t      "+(60+3*w)+"|"+(0)+"\t      "+(30)+"|0");
                System.out.println("");
                try {
                    Thread.sleep(30000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[3]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[3] Straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+w+"|"+0+"\t      "+(2*w)+"|"+0+"\t      "+(2*w)+"|"+(0)+"\t       "+0+"|"+w);
                System.out.println("RIGHT >        "+(w)+"|"+0+"\t      "+(30+2*w)+"|"+0+"\t      "+(30+3*w)+"|"+(0)+"\t       "+(0)+"|"+w);
                System.out.println("");
                try {
                    Thread.sleep(w*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[3]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for ROAD[0] Straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+0+"|"+w+"\t       "+(w)+"|"+0+"\t       "+(w)+"|"+(0)+"\t      "+(3*w+30)+"|"+0);
                System.out.println("RIGHT >        "+(0)+"|"+w+"\t      "+(30+w)+"|"+0+"\t      "+(30+2*w)+"|"+(0)+"\t      "+(3*w+30)+"|"+0);
                System.out.println("");
                try {
                    Thread.sleep(w*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[1]+" AND "+road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[1] and road[2] straight
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(30+(2*w))+"|"+0+"\t       "+(0)+"|"+30+"\t       "+(0)+"|"+(30)+"\t      "+(2*w+30)+"|"+0);
                System.out.println("RIGHT >       "+(30+(2*w))+"|"+0+"\t      "+(30)+"|"+0+"\t      "+(30+w)+"|"+(0)+"\t      "+(2*w+30)+"|"+0);
                System.out.println("");
                try {
                    Thread.sleep(30000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[2]+ " AND "+ road[1]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road [1] straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(2*w)+"|"+0+"\t       "+(0)+"|"+w+"\t       "+(w)+"|"+(0)+"\t      "+(2*w)+"|"+0);
                System.out.println("RIGHT >       "+(2*w)+"|"+0+"\t       "+(0)+"|"+w+"\t       "+(w)+"|"+(0)+"\t      "+(2*w)+"|"+0);
                System.out.println("");
                try {
                    Thread.sleep(w*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[2]+ " AND "+ road[1]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[2] straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(w)+"|"+0+"\t       "+(w)+"|"+0+"\t       "+(0)+"|"+(w)+"\t      "+(w)+"|"+0);
                System.out.println("RIGHT >       "+(w)+"|"+0+"\t       "+(w)+"|"+0+"\t       "+(0)+"|"+(w)+"\t      "+(w)+"|"+0);
                System.out.println("");
                try {
                    Thread.sleep(w*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            if(a[3]<30 && a[3]>=20)
            {

                int w1=((a[3]-20)/2 +1)*3;
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+(0)+"|"+(c1*2)+"\t       "+(2*c1)+"|"+0+"\t       "+(2*(c1+c2))+"|"+(0)+"\t       "+(2*(c1+c2+c3))+"|"+0);
                System.out.println("RIGHT >        "+(0)+"|"+(c1*2)+"\t       "+((2*c1))+"|"+0+"\t       "+(2*(c1+c2))+"|"+(0)+"\t       "+(2*(c1+c2+c3)+30)+"|"+0);
                System.out.println("");
                try {
                    Thread.sleep(c1*2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[1]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(2*(c3+c2))+"|"+(0)+"\t       "+(0)+"|"+(c2*2)+"\t      "+(2*c2)+"|"+(0)+"\t      "+(2*(c2+c3))+"|"+0);
                System.out.println("RIGHT >       "+(30+w1+2*c3+2*c2)+"|"+(0)+"\t       "+(0)+"|"+(c2*2)+"\t      "+(2*c2)+"|"+(0)+"\t      "+(2*(c2+c3)+30)+"|0");
                System.out.println("");
                try {
                    Thread.sleep(c2*2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[2]+ " AND "+ road[1]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+(2*c3)+"|"+(0)+"\t      "+(2*w1+30+2*c3)+"|"+(0)+"\t       "+(0)+"|"+(c3*2)+"\t      "+(2*c3)+"|"+0);
                System.out.println("RIGHT >       "+(30+w1+2*c3)+"|"+(0)+"\t      "+(2*w1+60+2*c3)+"|"+(0)+"\t       "+(0)+"|"+(c3*2)+"\t      "+((2*c3)+30)+"|0");
                System.out.println("");
                try {
                    Thread.sleep(c3*2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[2]+" AND "+road[3]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //forroad[0] and road[3]
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+(0)+"|"+(30)+"\t      "+(2*w1+30)+"|"+(0)+"\t      "+(30+2*w1)+"|"+(0)+"\t       "+(0)+"|"+30);
                System.out.println("RIGHT >       "+(30+w1)+"|"+(0)+"\t      "+(2*w1+60)+"|"+(0)+"\t      "+(60+2*w1)+"|"+(0)+"\t      "+(30)+"|0");
                System.out.println("");
                try {
                    Thread.sleep(30000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[3]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[3] Straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+(w1)+"|"+(0)+"\t      "+(2*w1)+"|"+(0)+"\t      "+(2*w1)+"|"+(0)+"\t       "+(0)+"|"+w1);
                System.out.println("RIGHT >       "+(w1)+"|"+(0)+"\t      "+(2*w1+30)+"|"+(0)+"\t      "+(30+3*w1)+"|"+(0)+"\t       "+(0)+"|"+(w1));
                System.out.println("");
                try {
                    Thread.sleep(w1*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[3]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for ROAD[0] Straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+(0)+"|"+(w1)+"\t       "+(w1)+"|"+(0)+"\t       "+(w1)+"|"+(0)+"\t      "+(3*w1+30)+"|"+0);
                System.out.println("RIGHT >        "+(0)+"|"+(w1)+"\t      "+(w1+30)+"|"+(0)+"\t      "+(30+2*w1)+"|"+(0)+"\t      "+(3*w1+30)+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(w1*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[1]+" AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[1] and road[2] straight
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(30+2*w1)+"|"+(0)+"\t       "+(0)+"|"+(30)+"\t       "+(0)+"|"+(30)+"\t      "+(2*w1+30)+"|"+0);
                System.out.println("RIGHT >       "+(30+2*w1)+"|"+(0)+"\t      "+(30)+"|"+(0)+"\t      "+(30+w1)+"|"+(0)+"\t      "+(2*w1+30)+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(30000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[1]+" AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road [1] straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(2*w1)+"|"+(0)+"\t       "+(0)+"|"+(w1)+"\t       "+(w1)+"|"+(0)+"\t      "+(2*w1)+"|"+0);
                System.out.println("RIGHT >       "+(2*w1)+"|"+(0)+"\t       "+(0)+"|"+(w1)+"\t       "+(w1)+"|"+(0)+"\t      "+(2*w1)+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(w1*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[1]+" AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[2] straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+(w1)+"|"+(0)+"\t       "+(w1)+"|"+(0)+"\t       "+(0)+"|"+(w1)+"\t       "+(w1)+"|"+0);
                System.out.println("RIGHT >        "+(w1)+"|"+(0)+"\t       "+(w1)+"|"+(0)+"\t       "+(0)+"|"+(w1)+"\t       "+(w1)+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(w1*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            if(a[3]<20 && a[3]>=10)
            {
                int w2=((a[3]-10)/2+1)*3;
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+(0)+"|"+(c1*2)+"\t      "+(2*c1)+"|"+(0)+"\t      "+(2*c1+2*c2)+"|"+(0)+"\t      "+(2*c1+2*c2+2*c3)+"|"+0);
                System.out.println("RIGHT >        "+(0)+"|"+(c1*2)+"\t      "+(2*c1)+"|"+(0)+"\t      "+(2*c1+2*c2)+"|"+(0)+"\t      "+(2*c1+2*c2+2*c3+15)+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(c1*2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[1]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(2*c3+2*c2)+"|"+(0)+"\t       "+(0)+"|"+(c2*2)+"\t      "+(c2*2)+"|"+(0)+"\t      "+(2*c2+2*c3)+"|"+0);
                System.out.println("RIGHT >       "+(w2+15+2*c3+2*c2)+"|"+(0)+"\t       "+(0)+"|"+(c2*2)+"\t      "+(2*c2)+"|"+(0)+"\t      "+(15+2*c2+2*c3)+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(c2*2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[1]+" AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+(2*c3)+"|"+(0)+"\t      "+(15+2*w2+2*c3)+"|"+(0)+"\t       "+(0)+"|"+(c3*2)+"\t       "+(2*c3)+"|"+0);
                System.out.println("RIGHT >       "+(w2+15+2*c3)+"|"+(0)+"\t      "+(30+2*w2+2*c3)+"|"+(0)+"\t       "+(0)+"|"+(c3*2)+"\t      "+(15+2*c3)+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(c3*2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[3]+" AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //forroad[0] and road[3]
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+(0)+"|"+(15)+"\t      "+(15+2*w2)+"|"+(0)+"\t      "+(15+2*w2)+"|"+(0)+"\t       "+(0)+"|"+15);
                System.out.println("RIGHT >       "+(w2+15)+"|"+(0)+"\t      "+(30+2*w2)+"|"+(0)+"\t      "+(30+3*w2)+"|"+(0)+"\t      "+(15)+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(15000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[2]+" AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[3] Straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t       "+(w2)+"|"+(0)+"\t      "+(2*w2)+"|"+(0)+"\t      "+(2*w2)+"|"+(0)+"\t       "+(0)+"|"+w2);
                System.out.println("RIGHT >        "+(w2)+"|"+(0)+"\t      "+(15+2*w2)+"|"+(0)+"\t       "+(0)+"|"+(15+3*w2)+"\t       "+(0)+"|"+(w2));
                System.out.println("");
                try {
                    Thread.sleep(w2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[3]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for ROAD[0] Straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(0)+"|"+(w2)+"\t       "+(w2)+"|"+(0)+"\t      "+(w2)+"|"+(0)+"\t      "+(3*w2+15)+"|"+0);
                System.out.println("RIGHT >       "+(0)+"|"+(w2)+"\t       "+(15+w2)+"|"+(0)+"\t      "+(15+2*w2)+"|"+(0)+"\t      "+(3*w2+15)+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(w2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[1]+" AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[1] and road[2] straight
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(2*w2+15)+"|"+(0)+"\t       "+(0)+"|"+(15)+"\t      "+(0)+"|"+(15)+"\t      "+(2*w2+15)+"|"+0);
                System.out.println("RIGHT >       "+(2*w2+15)+"|"+(0)+"\t       "+(15)+"|"+(0)+"\t      "+(15+w2)+"|"+(0)+"\t      "+(2*w2+15)+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(15000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[1]+" AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road [1] straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(2*w2)+"|"+(0)+"\t       "+(0)+"|"+(w2)+"\t      "+(w2)+"|"+(0)+"\t      "+(2*w2)+"|"+0);
                System.out.println("RIGHT >       "+(2*w2)+"|"+(0)+"\t       "+(0)+"|"+(w2)+"\t      "+(w2)+"|"+(0)+"\t      "+(2*w2)+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(w2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[1]+" AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //for road[2] straight and right
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(w2)+"|"+(0)+"\t       "+(w2)+"|"+(0)+"\t      "+(0)+"|"+(w2)+"\t      "+(w2)+"|"+0);
                System.out.println("RIGHT >       "+(w2)+"|"+(0)+"\t       "+(w2)+"|"+(0)+"\t      "+(0)+"|"+(w2)+"\t      "+(w2)+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(w2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

            if(a[3]<10 && a[3]>=0)
            {
                int w3=((a[3]/2)+1)*3;
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(0)+"|"+(c1*2)+"\t       "+(2*c1)+"|"+(0)+"\t      "+(2*(c1+c2))+"|"+(0)+"\t      "+(2*(c1+c2+c3))+"|"+0);
                System.out.println("RIGHT >       "+(0)+"|"+(c1*2)+"\t       "+(2*c1)+"|"+(0)+"\t      "+(2*(c1+c2))+"|"+(0)+"\t      "+(2*(c1+c2+c3))+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(c1*2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[1]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(2*c3+w3+2*c2)+"|"+(0)+"\t       "+(0)+"|"+(c2*2)+"\t      "+(2*c2)+"|"+(0)+"\t      "+(2*(c3+c2))+"|"+0);
                System.out.println("RIGHT >       "+(2*c3+w3+2*c2)+"|"+(0)+"\t       "+(0)+"|"+(c2*2)+"\t      "+(2*c2)+"|"+(0)+"\t      "+(2*(c2+c3))+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(c2*2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[1]+" AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(2*c3+w3)+"|"+(0)+"\t       "+(2*w3+2*c3)+"|"+(0)+"\t      "+(0)+"|"+(c3*2)+"\t      "+(2*c3)+"|"+0);
                System.out.println("RIGHT >       "+(2*c3+w3)+"|"+(0)+"\t       "+(2*w3+2*c3)+"|"+(0)+"\t      "+(0)+"|"+(c3*2)+"\t      "+(2*c3)+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(c3*2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[3]+" AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(w3)+"|"+(0)+"\t       "+(2*w3)+"|"+(0)+"\t      "+(3*w3)+"|"+(0)+"\t      "+(0)+"|"+w3);
                System.out.println("RIGHT >       "+(w3)+"|"+(0)+"\t       "+(2*w3)+"|"+(0)+"\t      "+(3*w3)+"|"+(0)+"\t      "+(0)+"|"+(w3));
                System.out.println("");
                try {
                    Thread.sleep(w3*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[3]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(0)+"|"+(w3)+"\t       "+(w3)+"|"+(0)+"\t      "+(2*w3)+"|"+(0)+"\t      "+(3*w3)+"|"+0);
                System.out.println("RIGHT >       "+(0)+"|"+(w3)+"\t       "+(w3)+"|"+(0)+"\t      "+(2*w3)+"|"+(0)+"\t      "+(3*w3)+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(w3*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[0]+ " AND "+ road[1]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(2*w3)+"|"+(0)+"\t       "+(0)+"|"+(w3)+"\t      "+(w3)+"|"+(0)+"\t      "+(2*w3)+"|"+0);
                System.out.println("RIGHT >       "+(2*w3)+"|"+(0)+"\t       "+(0)+"|"+(w3)+"\t      "+(w3)+"|"+(0)+"\t      "+(2*w3)+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(w3*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(road[1]+" AND "+ road[2]+" = Yellow Light ");
                try {
                    Thread.sleep(2*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("\t\t"+road[0]+"\t\t"+road[1]+"\t\t"+road[2]+"\t\t"+road[3]);
                System.out.println("\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN\t     RED|GREEN");
                System.out.println("UP ^\t      "+(w3)+"|"+(0)+"\t       "+(w3)+"|"+(0)+"\t      "+(0)+"|"+(w3)+"\t      "+(w3)+"|"+0);
                System.out.println("RIGHT >       "+(w3)+"|"+(0)+"\t       "+(w3)+"|"+(0)+"\t      "+(0)+"|"+(w3)+"\t      "+(w3)+"|"+(0));
                System.out.println("");
                try {
                    Thread.sleep(w3*1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }


        }while(true);
    }

}