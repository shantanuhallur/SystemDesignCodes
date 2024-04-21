import java.util.*;

class inheritance {
        
        static class P{
                int d = 1;
                int d1 = 10;
                int d2 = 99;

                void fun() { System.out.println("P fun"); }
                void fun1() { System.out.println("P fun1"); }
        }

        static class C extends P{
                int d = 2;
                int d2 = 20;

                void fun() { System.out.println("C fun"); }
                void fun2() { System.out.println("C fun2"); }
        }

        public static void main(String[] args) {
                P obj = new C();
                // System.out.println(((C)obj).d); not Allowed as d2 cant be see through P's reference
                System.out.println(((C)obj).d); // Typecaseted to reference C we get C's d .
                System.out.println(obj.d); // conflict gets resolved by reference P
                System.out.println(obj.d1); //only P has d1
                System.out.println(obj.d2); //not Allowed as d2 cant be see through P's reference
                
                obj.fun();
                ((P)obj).fun(); //functios always go from bottom to top so we get C's fun
                obj.fun1(); // only P has fun1     
               // obj.fun2();
        }
}