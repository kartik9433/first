import java.util.*;
public class parenthesis {
     public static boolean checkParenthesis(String str){
          Stack<Character> s =new Stack<>();
              for(int i=0;i<str.length();i++){
                  if (str.charAt(i)=='{'||str.charAt(i)=='['||str.charAt(i)=='(') {
                    s.push(str.charAt(i));
                  }
                  else{
                    char ch  = s.peek();
                    if(ch=='('&& str.charAt(i)==')'||
                      ch=='{'&& str.charAt(i)=='}' ||
                      ch=='['&& str.charAt(i)==']'    
                    ){
                        s.pop();
                    }
                  }
              }
              if (s.isEmpty()) {
                return true;
              }
              return false;
     }
  public static boolean duplicate(String str){
       Stack<Character> s = new Stack<>();
       for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
           if (ch==')') {
            int count = 0;
              while (s.peek()!='(') {
                  s.pop();
                  count++;
              }
              if (count<1) {
                return true;
              }
              else{
                s.pop();
              }
           }
           else{
             s.push(ch);
           }
       }
        return false;
  }
  // Queue
  public static void Interleave(Queue<Integer>q){
          Queue<Integer>firstHalf = new LinkedList<>();
          int size = q.size();
          for(int i=0;i<size/2;i++){
            firstHalf.add(q.remove());
          }
          while (!firstHalf.isEmpty()) {
                q.add(firstHalf.remove());
               q.add(q.remove()); 
          }

  }
  public static void reverseQueue(Queue<Integer>q){
     Stack<Integer> s  = new Stack<>();
         while(!q.isEmpty()){
              s.push(q.remove());
         }
         while (!s.isEmpty()) {
            q.add(s.pop());
         }
  }

    public static void main(String[] args) {
        // String str = "()[]{}";
        // System.out.println(checkParenthesis(str));
        // String str = "(a-b)"; 
        // System.out.println(duplicate(str));
          Queue<Integer>q= new LinkedList <> ();
          q.add(1);
          q.add(2);
          q.add(3);
          q.add(4);
          q.add(5);
          q.add(6);
          q.add(7);
          q.add(8);
          q.add(9);
          q.add(10);
          // Interleave(q);
          reverseQueue(q);
          while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
          }
    }
}