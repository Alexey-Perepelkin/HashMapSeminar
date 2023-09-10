public class Program {

    public static void main(String[] args) {

        Employee employee1 = new Employee("AAAA", 33);
        System.out.println(employee1.hashCode());
        Employee employee2 = new Employee("AAAA", 41);
        System.out.println(employee2.hashCode());


        HashMap<String, String> hashMap1 = new HashMap<>(4);


         hashMap1.put("+79007774431", "AAAAAAA");

       hashMap1.put("+79007774432", "BBBBB");
         hashMap1.put("+79007774431", "CCCCCCC1");
        hashMap1.put("+79007774433", "CCCCCCC2");
        hashMap1.put("+79007774434", "CCCCCCC3");
         hashMap1.put("+79007774435", "CCCCCCC4");
        hashMap1.put("+79007774436", "CCCCCCC5");
         hashMap1.put("+79007774437", "CCCCCCC6");
        hashMap1.put("+79007774438", "CCCCCCC7");
         hashMap1.put("+79007774439", "CCCCCCC8");


        String res = hashMap1.get("+79007774435");
       //System.out.println(hashMap1.toString());
        res = hashMap1.get("+79107774431");

//        oldValue = hashMap1.remove("+79007774435");
//        oldValue = hashMap1.remove("+79007774435");

        for (HashMap<String, String>.Entity element : hashMap1) {
            System.out.println(element.key);
            System.out.println(element.value);
            System.out.println("\n");
        }



    }

}
