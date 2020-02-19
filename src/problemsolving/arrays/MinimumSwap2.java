package problemsolving.arrays;

public class MinimumSwap2 {

  static int minimumSwaps(int q[]){

    int count=0;

    for(int i=0;i<q.length;i++){
      int pivot = q[i];
      if(pivot==i+1){
        continue;
      }
      for(int j=i+1;j<q.length;j++) {

        int next = q[j];
        int temp=0;
        if( (next<j+1) && (next<=i+1)){
          temp=pivot;
          q[i]=next;
          q[j]=temp;
          count++;
          break;
        }
      }
    }
    return count;
  }

  static int minimumSwaps2(int[] arr) {
    int swap=0;
    boolean visited[]=new boolean[arr.length];

    for(int i=0;i<arr.length;i++){
      int j=i,cycle=0;

      while(!visited[j]){
        visited[j]=true;
        j=arr[j]-1;
        cycle++;
      }

      if(cycle!=0)
        swap+=cycle-1;
    }
    return swap;
  }

  public static void main(String[] args) {

    int q[] = {4,3,2,1};

    System.out.println(minimumSwaps(q));

  }

}
