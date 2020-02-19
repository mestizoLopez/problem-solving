package problemsolving.arrays;

public class ChaoticQueue {

  //1 2 5 3 7 8 6 4
  //2 1 5 3 4
  //n n n n n
  //1 1 2

  static void minimumBribes2(int[] q) {
    int count = 0;
    // always keep track of min three values observed
    // Compare currently seeing value with this three values.
    int midOfThree = Integer.MAX_VALUE;
    int maxOfThree = Integer.MAX_VALUE;
    int minOfThree = Integer.MAX_VALUE;

    // iterating from left to right
    for (int i = q.length - 1; i >= 0; i--) {
      // person has no way to move more than two positions -> wrong
      if ((q[i] - i) > 3) {
        System.out.println("Too chaotic");
        return;
      } else {
        // means current value has passed at least 3 values -> wrong
        if (q[i] > maxOfThree) {
          System.out.println("Too chaotic");
          return;
        } else if (q[i] > midOfThree) { // means -> current value has bribed 2 ppl
          count = count + 2;
        } else if (q[i] > minOfThree) { // means-> current value has bribed 1 person.
          count = count + 1;
        }

        // Now adjust minThree values comparing, taking the current vlaue to account
        if (q[i] < minOfThree) {
          maxOfThree = midOfThree;
          midOfThree = minOfThree;
          minOfThree = q[i];
        } else if (q[i] < midOfThree) {
          maxOfThree = midOfThree;
          midOfThree = q[i];
        } else if (q[i] < maxOfThree) {
          maxOfThree = q[i];
        }
      }
    }
    System.out.println(count);
  }

  static void minimumBribes(int [] q){
    int bibreCount = 0;

    for(int i=0; i<q.length;i++){
      final int index = i+1;
      final int value = q[i];
      if(value > index){
        final int sub = value - index;
        if(sub>2){
          System.out.println("Too chaotic");
          return;
        }else {
          bibreCount += sub;
        }
      }
    }
    System.out.println(bibreCount);
  }

  public static void main(String[] args) {

    int q[] = {5,1,2,3,7,8,6,4};

    minimumBribes2(q);

  }


}
