package array;
import java.util.ArrayList;
import java.util.Collection;


public class ArrayList {
	private static ArrayList<String> exe1 = new ArrayList<String>();
    
    
	 
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        array();
        for (int i=0;i<exe1.size();i++){
            System.out.println(exe1.get(i));
        }
         
        for (String exe : exe1){
            System.out.println(exe);
        }
    }
     
    public static void array () {
        exe1.add("ararara");
        exe1.add("tororo");
        exe1.add("barara");
    }
   //primeira alteração, questão 2
 
    // segunda alteração, questão 4
}
