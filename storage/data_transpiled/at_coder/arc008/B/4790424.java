public static void main ( String [ ] args ) {
  Scanner input = new Scanner ( System . in ) ;
  String name = input . nextLine ( ) ;
  IntStream kit = input . stream ( ) ;
  System . out . println ( solve ( name , kit ) ) ;
  /* Map<String,Integer> cnt = new HashMap<>();
  for (String c: name) {
  cnt.put(c, cnt.get(c)+1);
  }*/
}
