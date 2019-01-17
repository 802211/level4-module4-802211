import java.lang.reflect.Array;

public class Checkpoint {
	
	public abstract class Cake { 
        protected String name; 
        protected double rate; 
        public Cake (String n, double r) { 
            name = n; 
            rate = r; 
        } 
        
        public abstract double calcPrice(); 
        
        public String toString() {
            return name + "\t" + rate;
        }  
        
    } 
	
	public static void main(String[] args) {
		
	}
	Array[] a = new Array[20];
	for(int i = 0; i< 20; i++) {
		
	}
	
	public abstract class orderCake extends Cake{
		
		public orderCake(String n, double r) {
			super(n, r);
			
		}
		
	}
	
	public abstract class readymadeCake extends Cake{
		
		public readymadeCake(String n, double r) {
			super(n, r);
			
		}
		
	}
	
}
