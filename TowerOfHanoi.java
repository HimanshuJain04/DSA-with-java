public class TowerOfHanoi {
    
    public static void printTOH(int num,char Src,char Aux,char Dest){

        if(num==0) return;

        else if(num==1){
            System.out.println("Disk "+num+" Move From "+Src+" To "+Dest);
            
        } else {
            
            printTOH(num-1,Src,Dest,Aux);
            System.out.println("Disk "+num+" Move From "+Src+" To "+Dest);
            // printTOH(1,Src,Aux,Dest);
            printTOH(num-1,Aux,Src,Dest);
        }
        
    }

    public static void main(String[] args) {
        int n=3;
        printTOH(2,'S','A','D');
        
    }
    
}
