package heapsandpriorityqueues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapsAPQ {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A",4));
        pq.add(new Student("B",5));
        pq.add(new Student("C",7));
        pq.add(new Student("D",2));
        pq.add(new Student("E",1));
        pq.add(new Student("F",8));
    while (!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }
}
