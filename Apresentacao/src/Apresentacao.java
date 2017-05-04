import java.util.Random;
public class Apresentacao {
	public static void main (String[] args) {
	    int i;
	    int[] array = new int[10];
	    for (i=0;i<array.length;i++) {
	        Random gerador = new Random();
	        array[i] = gerador.nextInt();
	        System.out.print(array[i]+" ");
	    }
	    System.out.print("\n");
	    array = substitui(array);
	    int negativos;
	    negativos = negativos(array);
	    System.out.print("São "+negativos+" números negativos.\n");
	   }
	    
	   static int[] substitui (int[] array) {
	       for (int i=0;i<array.length;i++){
	           if (array[i]<0)
	               array[i]=-1;
	           else
	               array[i]=1;
	           System.out.print(array[i]+" ");
	       }
	       System.out.print("\n");
	       return (array);
	   }   
	    static int negativos (int[] array){
	        int j=0;
	        for (int i=0;i<array.length;i++) {
	            if (array[i]<0)
	                j++;
	        }
	        return (j);
	    }   
}
