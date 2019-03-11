import java.io.*;
import java.util.*;
public class USACO{
  public static void main(String[] args){
    try{
      System.out.println(bronze("makelake.0.in"));
    }
    catch(FileNotFoundException e){

    }
  }
  private static String arrayToString(int[][] ary){
    String ans="";
    for(int i=0;i<ary.length;i++){
      for(int j=0;j<ary[0].length;j++){
          ans+=ary[i][j];
          ans+=' ';
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
      int rs=ins[i][0]-1;
      int cs=ins[i][1]-1;
      int ds=ins[i][2];
      int max=lake[rs][cs];
      for(int j=0;j<3;j++){
        for(int k=0;k<3;k++){
          if((lake[rs+j][cs+k])>max){
            max=lake[rs+j][cs+k];
          }
        }
      }
      for(int j=0;j<3;j++){
        for(int k=0;k<3;k++){
          if(lake[rs+j][cs+k]>max-ds){
            lake[rs+j][cs+k]=max-ds;
          }
        }
      }
    }
    int totaldepth=0;
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        lake[i][j]=e-lake[i][j];
        if(lake[i][j]>0){
          totaldepth+=lake[i][j];
        }
      }
    }
    return totaldepth*72*72;
  }
  public static int silver(String filename) throws FileNotFoundException{
    int r;
    int c;
    int t;
    int[][] pasture;
    int r1;
    int c1;
    int r2;
    int c2;
    String s;
    File text=new File(filename);
    Scanner inf = new Scanner(text);
    r = inf.nextInt();
    c = inf.nextInt();
    t = inf.nextInt();
    pasture = new int[r][c];
    for(int i=0;i<r;i++){
      s = inf.next();
      for(int j=0;j<c;j++){
        if(s.charAt(j)=='*'){
          pasture[i][j]=-1;
        }
      }
    }
    return 0;
  }
}
