/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephus;


        public class Josephus{
  public static void main (String[] args ){
   Srring[] a1={"a","b","c","d","e"};
   CircQueueImp<String> cq =new CircQueueImp<>()
   for (int i=0;i<a1.length;i++){cq.enqueue(a1[i]);
   while(cq.size()>1){
   for(int y=0;i<2;y++)
   cq.rotate();
   System.out.println(cq.dequeue()+"is out" )
   } 
   System.out.println("is winner"+cq.dequeue() );
   }
   }
    }
    

