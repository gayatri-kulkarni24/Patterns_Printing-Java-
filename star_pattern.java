public class patterns{
  public static void star_pattern(){
        for(int line=1;line<=4;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
  public static void main(String[] args){
    star_pattern();
  }
}
