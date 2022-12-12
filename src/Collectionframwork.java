//import java.sql.SQLOutput;
import java.util.*;
//import java.util.HashMap ;
//import java util.Queue;

class Collectionframwork {
    public static void main(String[] args) {

                //LINKED LIST
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        LinkedList<String> list = new LinkedList<String>();
//
//        list.addFirst("a");     //a
//        list.addFirst("is");    // is a
//        list.addFirst("this");  // this is a
//        list.add("list");          // this is a list // addLast function
//        System.out.println(list);
//
//        System.out.println(list.size());  //4
//
//        for(int i=0 ; i< list.size() ; i++)
//        {
//            System.out.print(list.get(i)+" -> ");
//        }
//        System.out.println("null");
//        list.add(3,"my");
//        System.out.println(list);
//
//        System.out.println(list.get(2));  // extract the value of specific index
//
//        list.removeFirst();
//        System.out.println(list);
//
//        list.removeLast();
//        System.out.println(list);
//
//        list.remove(1);  // delete a node from specified index
//        System.out.println(list);

// --------------------------------------------------------------------------------------------------------------------




                        // ARRAY-LIST

//
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> kapilList = new ArrayList<>();
//        while (sc.hasNextInt())
//        {
//            int num = sc.nextInt();
//            kapilList.add(num);
//        }
//        System.out.print(kapilList);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(0,1);
        System.out.println(arrayList);

        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(3,4);
        arrayList.add(4,5);
        arrayList.add(5,6);
        arrayList.add(6,7);
        arrayList.add(7,2);
        //arrList.offerLast(10);
        System.out.println(arrayList);

        arrayList.remove(0);  //remove element of 0th index
        System.out.println(arrayList);

        arrayList.set(2,100);  // replace
        System.out.println(arrayList);

        System.out.println(arrayList.get(2)); // show the element of index passed


        //check whether the element is present or not in ArrayList
       if(arrayList.contains(100))
       {
           System.out.println("YES..");
       }
       else
           System.out.println("NO");

        System.out.println(arrayList.lastIndexOf(2)); // Last index of the perticular element

        System.out.println(arrayList.indexOf(2));  //first index of the perticular element





            // form matrix using ArrayList
//        Scanner sc = new Scanner(System.in);
//        List<List<Integer>> arr = new ArrayList<>(); // => [] arr
//
//        System.out.println("Number of rows : ");
//        int rows = sc.nextInt();
//
//        for(int i = 0; i < rows; i++) {
//            System.out.println("Number of Columns for " + i + "th row :");
//            int cols = sc.nextInt();
//
//            List<Integer> c.nextInt();
//            temp.add(nutemp = new ArrayList<>(); // => [] temp
//            for(int j = 0; j < cols; j++) {
//                int num = sm);
//            }
//
//            arr.add(temp);
//        }
//
//        System.out.println(arr); // O(rows * cols)
//
//        for(int i = 0; i < arr.size(); i++) {
//            for(int j = 0; j < arr.get(i).size(); j++) {
//                System.out.print(arr.get(i).get(j) + " "); //arr[i][j]
//            }
//            System.out.println();
//        }
//


// --------------------------------------------------------------------------------------------------------------------





                    //STACK

//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//        System.out.println(st.pop());  // it will delete and show the deleted number
//        System.out.println(st);  // display the Stack after deleting the top element through pop()
//        System.out.println(st.peek());  // display the top element of stack
//        System.out.println(st.size());  // size/filled capacity of stack
//        System.out.println(st.empty());  // boolean ans display true or false

// --------------------------------------------------------------------------------------------------------------------





                        //QUEUE

//        Queue<Integer> q = new LinkedList<>();
//        q.offer(1);
//        q.offer(2);
//        q.offer(3);
//        q.offer(4);
//        q.offer(5);
//        q.add(6);
//        System.out.println(q);
//
////        q.poll();  // it will remove and display the first element of queue which was entered first
//        System.out.println(" TOOK OUT and DISPLAY THE VERY FIRST ELEMENT : "+q.poll());
//
//        System.out.println("THE VERY FIRST ELEMENT AS PEEK : "+ q.peek());
//
//        System.out.println("SIZE OF THE WHOLE QUEUE IS : "+ q.size());
//
//        System.out.println("IS THE QUEUE IS EMPTY ? "+ q.isEmpty());
//
//       q.clear();  // IT WILL CLEAR ALL THE ELEMENT IN QUEUE
//
//
// --------------------------------------------------------------------------------------------------------------------



                    //ARRAY DEQUE

//        ArrayDeque<Integer> dq = new ArrayDeque<>();
//
//        // Add to the rear end (Last)
//        dq.offerLast(6);
//        dq.offerLast(8);
//
//        // Add to the front end (First)
//        dq.offerFirst(1);
//        System.out.println(dq);
//
//        // peekFirst() and peekLast()
//        System.out.println(dq.peekFirst());
//        System.out.println(dq.peekLast());
//
////        dq.pollFirst();
////        System.out.println("After removal of first element: " + dq);
//
////        dq.pollLast();
////        System.out.println("After removal of last element: " + dq);
//
//        System.out.println("Size: " + dq.size());
//        System.out.println("Is dq empty? " + dq.isEmpty());

// --------------------------------------------------------------------------------------------------------------------



                              //HASH  MAP
        //1. How to create HashMap
        HashMap<String,Integer> hm = new HashMap<>(); //String is key & Integer is value (like primary key in sql ...uniqu)
                                                      // key only be can unique and value can be uniqu and same as well
        //2.How to insert into HashMap
        hm.put("India",120);
        hm.put("China",150);
        hm.put("US",30);
//        System.out.println(hm);
//
//        System.out.println();
//
//
//        //3.How to update values of exiting key
//         hm.put("China",160);
//        System.out.println(hm);
//
//        System.out.println();
//
//
//        //3. Search/look up operation -> by using .containKey(keyname); -> it will give us ans in true or false
//        // 3.1 Search by usnig key
//        if(hm.containsKey("China"))
//            System.out.println("Key is present in the HashMap");
//        else
//            System.out.println("key does not present in HashMap");
//
//        // 3.2 Search by usnig value
//        if(hm.containsValue(160))
//            System.out.println("value is present in the HashMap");
//        else
//            System.out.println("Value does not present in HashMap");
//
//        System.out.println();
//
//
//        //4.How to get/retrieve the value of existing key -> .get()
//        System.out.println(hm.get("India"));    // key exists
//        System.out.println(hm.get("America")); // does'nt exits
//
//        System.out.println();
//
//
//        //5. How to remove the a complete pair -> pass the key name in .remove()
//        hm.remove("US"); // A pair of US with its value will removed from map
//        System.out.println(hm);
//
//       System.out.println();
//        //6. How to iterate over the pairs that we added into HashMap
//        // BY using for each loop
//                int arr[] = {10,20,30};
//                for(int val : arr)
///                  System.out.print(val+" ");
//
//        /* for iterating over hashmap...replace
//        int -> Map.entry<String ,Integer>
//        val -> e
//        arr -> Map.entrySet()
//         */
//
////        //print only key..
//     for(Map.Entry<String,Integer> e : hm.entrySet())
//           System.out.println(e.getKey());

       //print only values..
        for(Map.Entry<String,Integer> e : hm.entrySet())
            System.out.println(e.getValue());


        System.out.println();


        //FIRST WAY TO -> print both similtaniously
        Set<String> keys = hm.keySet();
        for(String k : keys)
        {
            System.out.println(k+" "+hm.get(k));
        }

        System.out.println();

        //SECOND WAY TO -> print both similtaniously
        for(Map.Entry m : hm.entrySet())

            System.out.println(m.getKey()+" "+m.getValue());

        System.out.println();
        String str = "fasafbccdeafdg" ;
        HashMap<Character,Integer> map = new HashMap<>();
        int maxFreq = 0 ;
        char ans = ' ';
        for(int i=0 ; i<str.length() ; i++)
        {
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Character ch : map.keySet())
        {
           if(maxFreq < map.get(ch))
           {
               maxFreq = map.get(ch);
               ans = ch;
           }
        }
        System.out.println(ans+" "+maxFreq);

        //7. size of HashMap
        System.out.println(hm.size());

        // we can store null values in HashMap
        HashMap<Integer,String> hmap=new HashMap<>();
        hmap.put(1,"Program to store null value");
        hmap.put(null,"InterviewBit");
        hmap.put(null,"dhsrhdh");
        hmap.put(2,null);
        hmap.put(3,null);
        System.out.println(hmap);

//
//
//
//              //USING OF LINKED-HASHMAP , TREE-MAP
//        HashMap<String,Integer> hm2 = new HashMap<>();
//        hm2.put("India",120);
//        hm2.put("China",150);
//        hm2.put("US",30);
//        hm2.put("America",110);
//        hm2.put("Zimbawey",20);
//        System.out.println(hm2); //OP will be in jumbled form
//
//
//        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>(); //TC of all the functions is same O(1)
//         lhm.put("India",120);
//        lhm.put("China",150);
//        lhm.put("US",30);
//        lhm.put("America",110);
//        lhm.put("Zimbawey",20);
//        System.out.println(lhm); //op will  as order of insertion
//
//
//        TreeMap<String,Integer> tm = new TreeMap<>();  // TC of all the method of TREEMap is O(logn) because of sorting
//        tm.put("India",120);
//        tm.put("China",150);
//        tm.put("US",30);
//        tm.put("America",110);
//        tm.put("Zimbawey",20);
//        System.out.println(tm); //op will according to the sorting of key (if key is String then sorting in alphabeticlly


 // --------------------------------------------------------------------------------------------------------------------


    }
    }

