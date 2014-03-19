import java.io.IOException;




public class TestException{
	   public static void main(String args[]) throws Exception{
	        String str = "2346512aa";
	        int sum = 0;

	        for(int i = 0; i <= str.length(); i++){
	                try{
	                        //sum += Integer.parseInt(str.charAt(i) + "");
	                	throw new Exception("error");
	                }catch(IndexOutOfBoundsException ioe){
	                        System.out.print("Regular!  ");
	                }catch(NumberFormatException nfe){
	                        System.out.print("Yikes!  ");
	                }catch(IOException e){
	                	
	                }
	                finally{
	                        System.out.println("i= " + 10);
	                }
	        }
	        System.out.println("Sum: " + sum);
	   } //main
}
