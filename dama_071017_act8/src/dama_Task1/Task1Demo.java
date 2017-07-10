
package dama_Task1;

import dama_Task1.InnerClass;


public class Task1Demo {
    public static void main(String args[]){
        OuterClass oc = new OuterClass();
        InnerClass ic = new InnerClass();
        System.out.println(oc.data);
        System.out.println(ic.data2);
         ic.method(oc);
    }


}
