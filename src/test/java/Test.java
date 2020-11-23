import net.bytebuddy.asm.Advice;

import java.util.ArrayList;

public class Test {


    public void testArray() {
        ArrayList list=new ArrayList();
        ArrayList str=new ArrayList();
        ArrayList num=new ArrayList();
        ArrayList result=new ArrayList();
        for(int i=0;i<10;i++) {
            list.add("1");
            str.add("A");
            num.add("@");
        }

            for (Object k : list) {
                for(Object a:str){
                    for(Object c:num){
                        System.out.println(" Data:"+k.toString()+a.toString()+c.toString());
                result.add(k.toString()+a.toString()+c.toString());
            }}}

        for(int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));

        }
    }



    public static void main(String[] args){
        Test n = new Test();
        n.testArray();
    }
}
