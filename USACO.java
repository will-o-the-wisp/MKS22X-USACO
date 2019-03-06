import java.io.*;
import java.util.*;
public class USACO{
  public static void main(String[] args){
    try{
      bronze("makelake.1.in");
    }
    catch(FileNotFoundException e){

    }
  }
  private static String arrayToString(int[][] ary){
    String ans="";
    for(int i=0;i<ary.length;i++){
      for(int j=0;j<ary[0].length;j++){
        if(ary[i][j]!='\n'){
          ans+=ary[i][j];
          ans+=' ';
        }
        else{
          ans+='n';
          ans+=ary[i][j];
        }
      }
      ans+='\n';
    }
    return ans;
  }
  public static int bronze(String filename) throws FileNotFoundException{
    int r;
    int c;
    int e;
    int n;
    int[][] lake;
    int[][] ins;
    File text = new File(filename);
    Scanner inf = new Scanner(text);
    r = inf.nextInt();
    c = inf.nextInt();
    e = inf.nextInt();
    n = inf.nextInt();
    lake = new int[r][c];
    ins = new int[n][3];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        lake[i][j]=inf.nextInt();
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<3;j++){
        ins[i][j]=inf.nextInt();
      }
    }
    for(int i=0;i<n;i++){
      int rs=ins[n][0];
      int cs=ins[n][1];
      int ds=ins[n][2];
      int max=lake[rs][cs];
      for(int j=0;j<3;j++){
        for(int k=0;k<3;k++){
          if(lake[rs+j][rs+k]>max){
            max=lake[rs+j][rs+k];
          }
        }
      }
      for(int j=0;j<3;j++){
        for(int k=0;k<3;k++){
          if(lake[rs+j][rs+k]>max-ds){
            lake[rs+j][rs+k]=max-ds;
          }
        }
      }
    }
    System.out.println(arrayToString(ins));
    return 0;
  }
}
