package Model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class room {

    long id;
    String name;
    String date;
   // Boolean[][] sits;
    int sits[][];


    public void init(){
       for (int i = 0; i< sits.length ; i++){
           for(int j = 0; j< sits.length; j++){
               sits[i][j] = 0;
           }
       }
   }
  public void print(){
      int x = 0;
      char c = 'A';
      for (int i = 0; i< sits.length; i++){
          for(int j = 0; j< sits.length; j++){
              if(i==0){
                  for(; x< sits.length+1; x++) {
                      System.out.print(x + " ");
                      System.out.print((x == sits.length)?"\n":"");
                  }

              }
              System.out.print(((j == 0)?c+" ":"")+sits[i][j]+" ");
              }
          ++c;
          System.out.println();
          }

      }

    public void activateSit(String row, int col){
        char c = 'A';
        int x = 0;

        for(; c <= 'Z'; ++c){
            if(row.equals(c)){
                break;
            }
            x++;
        }

        sits[x][col-1] = 1;
    }
}