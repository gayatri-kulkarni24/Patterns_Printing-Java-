public class patterns{
   public static void inverted_star_pattern(){
        int n=4;
        for(int line=1;line<=4;line++){
            for(int star=1;star<=n-line+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
  public static void main(String[] args){
    inverted_star_pattern();
  }
}
