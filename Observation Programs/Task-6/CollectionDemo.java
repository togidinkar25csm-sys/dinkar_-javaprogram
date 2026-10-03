package crits;


import java.util.*;

public class CollectionDemo {

    static void header(String title) {
        System.out.println("\n===== " + title + " =====");
    }

    // ---------- ArrayList ----------
    static void arrayListDemo() {
        header("ArrayList");
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1, "Mango");
        System.out.println("After add()            : " + list);
        System.out.println("get(2)                 : " + list.get(2));
        list.set(0, "Orange");
        System.out.println("After set(0, Orange)   : " + list);
        list.add("Banana");
        System.out.println("indexOf(Banana)        : " + list.indexOf("Banana"));
        System.out.println("lastIndexOf(Banana)    : " + list.lastIndexOf("Banana"));
        list.remove(1);
        list.remove("Cherry");
        System.out.println("After remove()         : " + list);
        System.out.println("contains(Banana)       : " + list.contains("Banana"));
        list.sort(Comparator.naturalOrder());
        System.out.println("After sort()           : " + list);
        System.out.println("size()                 : " + list.size());
        list.clear();
        System.out.println("isEmpty() after clear(): " + list.isEmpty());
    }

    // ---------- LinkedList ----------
    static void linkedListDemo() {
        header("LinkedList");
        LinkedList<String> ll = new LinkedList<>();
        ll.add("B");
        ll.addFirst("A");
        ll.addLast("D");
        ll.add(2, "C");
        System.out.println("After add methods      : " + ll);
        System.out.println("get(1)                 : " + ll.get(1));
        System.out.println("getFirst() / getLast() : " + ll.getFirst() + " / " + ll.getLast());
        ll.offer("E");
        System.out.println("After offer(E)         : " + ll);
        System.out.println("removeFirst()          : " + ll.removeFirst());
        System.out.println("removeLast()           : " + ll.removeLast());
        ll.remove("C");
        ll.remove(0);
        System.out.println("After remove()         : " + ll);
        System.out.println("peek()                 : " + ll.peek());
        System.out.println("poll()                 : " + ll.poll());
        System.out.println("poll() on empty list   : " + ll.poll());
    }

    // ---------- Vector ----------
    static void vectorDemo() {
        header("Vector");
        Vector<Integer> v = new Vector<>();
        System.out.println("Initial capacity()     : " + v.capacity());
        v.add(10);
        v.addElement(20);
        v.add(30);
        System.out.println("After add/addElement   : " + v);
        System.out.println("get(1)                 : " + v.get(1));
        v.set(1, 25);
        System.out.println("After set(1, 25)       : " + v);
        v.remove(0);
        v.removeElement(30);
        System.out.println("After remove methods   : " + v);
        System.out.println("contains(25)           : " + v.contains(25));
        System.out.println("size()                 : " + v.size());
    }

    // ---------- Stack ----------
    static void stackDemo() {
        header("Stack");
        Stack<String> st = new Stack<>();
        st.push("Java");
        st.push("Python");
        st.push("C++");
        System.out.println("Stack                  : " + st);
        System.out.println("peek()                 : " + st.peek());
        System.out.println("search(Java)           : " + st.search("Java"));
        System.out.println("pop()                  : " + st.pop());
        System.out.println("After pop()            : " + st);
        System.out.println("empty()                : " + st.empty());
    }

    // ---------- HashSet ----------
    static void hashSetDemo() {
        header("HashSet");
        HashSet<String> hs = new HashSet<>();
        hs.add("Red");
        hs.add("Green");
        hs.add("Blue");
        System.out.println("add(Red) again         : " + hs.add("Red"));
        System.out.println("Set (no duplicates)    : " + hs);
        System.out.println("contains(Green)        : " + hs.contains("Green"));
        hs.remove("Blue");
        System.out.println("After remove(Blue)     : " + hs);
        System.out.println("size() / isEmpty()     : " + hs.size() + " / " + hs.isEmpty());
        hs.clear();
        System.out.println("After clear()          : " + hs);
    }

    // ---------- LinkedHashSet ----------
    static void linkedHashSetDemo() {
        header("LinkedHashSet");
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Zebra");
        lhs.add("Apple");
        lhs.add("Mango");
        lhs.add("Apple");
        System.out.println("Insertion order kept   : " + lhs);
        System.out.println("contains(Mango)        : " + lhs.contains("Mango"));
        lhs.remove("Zebra");
        System.out.println("After remove(Zebra)    : " + lhs);
        System.out.println("size()                 : " + lhs.size());
        lhs.clear();
        System.out.println("After clear()          : " + lhs);
    }

    // ---------- TreeSet ----------
    static void treeSetDemo() {
        header("TreeSet");
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(40);
        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(50);
        System.out.println("Sorted set             : " + ts);
        System.out.println("first() / last()       : " + ts.first() + " / " + ts.last());
        System.out.println("higher(30) / lower(30) : " + ts.higher(30) + " / " + ts.lower(30));
        System.out.println("ceiling(25) / floor(25): " + ts.ceiling(25) + " / " + ts.floor(25));
        System.out.println("contains(20)           : " + ts.contains(20));
        ts.remove(20);
        System.out.println("After remove(20)       : " + ts);
        System.out.println("pollFirst()            : " + ts.pollFirst());
        System.out.println("pollLast()             : " + ts.pollLast());
        System.out.println("Remaining              : " + ts);
    }

    // ---------- PriorityQueue ----------
    static void priorityQueueDemo() {
        header("PriorityQueue");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.offer(10);
        pq.add(20);
        pq.offer(5);
        System.out.println("peek() (smallest)      : " + pq.peek());
        System.out.println("contains(20)           : " + pq.contains(20));
        pq.remove(20);
        System.out.println("size() after remove    : " + pq.size());
        System.out.print("poll() order           : ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
        System.out.println("poll() on empty queue  : " + pq.poll());
    }

    // ---------- ArrayDeque ----------
    static void arrayDequeDemo() {
        header("ArrayDeque");
        ArrayDeque<String> dq = new ArrayDeque<>();
        dq.addFirst("B");
        dq.addLast("C");
        dq.offerFirst("A");
        dq.offerLast("D");
        System.out.println("Deque                  : " + dq);
        System.out.println("peekFirst / peekLast   : " + dq.peekFirst() + " / " + dq.peekLast());
        System.out.println("pollFirst()            : " + dq.pollFirst());
        System.out.println("pollLast()             : " + dq.pollLast());
        System.out.println("Remaining              : " + dq);
    }

    // ---------- HashMap ----------
    static void hashMapDemo() {
        header("HashMap");
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Rahul");
        hm.put(2, "Priya");
        hm.put(3, "Amit");
        hm.put(2, "Sneha");
        System.out.println("Map (key 2 replaced)   : " + hm);
        System.out.println("get(3)                 : " + hm.get(3));
        System.out.println("get(9)                 : " + hm.get(9));
        System.out.println("getOrDefault(9)        : " + hm.getOrDefault(9, "Not Found"));
        System.out.println("containsKey(1)         : " + hm.containsKey(1));
        System.out.println("containsValue(Amit)    : " + hm.containsValue("Amit"));
        System.out.println("keySet()               : " + hm.keySet());
        System.out.println("values()               : " + hm.values());
        System.out.println("entrySet()             : " + hm.entrySet());
        hm.remove(1);
        System.out.println("After remove(1)        : " + hm);
        System.out.println("size() / isEmpty()     : " + hm.size() + " / " + hm.isEmpty());
        hm.clear();
        System.out.println("After clear()          : " + hm);
    }

    // ---------- LinkedHashMap ----------
    static void linkedHashMapDemo() {
        header("LinkedHashMap");
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Maths", 90);
        lhm.put("Physics", 85);
        lhm.put("Chemistry", 88);
        System.out.println("Insertion order kept   : " + lhm);
        System.out.println("get(Physics)           : " + lhm.get("Physics"));
        System.out.println("containsKey(Maths)     : " + lhm.containsKey("Maths"));
        lhm.remove("Physics");
        System.out.println("keySet()               : " + lhm.keySet());
        System.out.println("values()               : " + lhm.values());
        System.out.println("entrySet()             : " + lhm.entrySet());
    }

    // ---------- TreeMap ----------
    static void treeMapDemo() {
        header("TreeMap");
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(30, "C");
        tm.put(10, "A");
        tm.put(50, "E");
        tm.put(20, "B");
        tm.put(40, "D");
        System.out.println("Sorted by key          : " + tm);
        System.out.println("get(20)                : " + tm.get(20));
        System.out.println("firstKey() / lastKey() : " + tm.firstKey() + " / " + tm.lastKey());
        System.out.println("higherKey(30)/lowerKey : " + tm.higherKey(30) + " / " + tm.lowerKey(30));
        System.out.println("ceilingKey(25)/floorKey: " + tm.ceilingKey(25) + " / " + tm.floorKey(25));
        System.out.println("containsKey(40)        : " + tm.containsKey(40));
        System.out.println("containsValue(Z)       : " + tm.containsValue("Z"));
        tm.remove(10);
        System.out.println("After remove(10)       : " + tm);
        System.out.println("entrySet()             : " + tm.entrySet());
    }

    // ---------- Hashtable ----------
    static void hashtableDemo() {
        header("Hashtable");
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("One", 1);
        ht.put("Two", 2);
        ht.put("Three", 3);
        System.out.println("get(Two)               : " + ht.get("Two"));
        System.out.println("containsKey(One)       : " + ht.containsKey("One"));
        System.out.println("containsValue(3)       : " + ht.containsValue(3));
        System.out.print("keys()                 : ");
        Enumeration<String> keys = ht.keys();
        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }
        System.out.println();
        System.out.print("elements()             : ");
        Enumeration<Integer> vals = ht.elements();
        while (vals.hasMoreElements()) {
            System.out.print(vals.nextElement() + " ");
        }
        System.out.println();
        ht.remove("One");
        System.out.println("After remove(One)      : " + ht);
        System.out.println("size() / isEmpty()     : " + ht.size() + " / " + ht.isEmpty());
    }

    public static void main(String[] args) {
        arrayListDemo();
        linkedListDemo();
        vectorDemo();
        stackDemo();
        hashSetDemo();
        linkedHashSetDemo();
        treeSetDemo();
        priorityQueueDemo();
        arrayDequeDemo();
        hashMapDemo();
        linkedHashMapDemo();
        treeMapDemo();
        hashtableDemo();
    }
}