public static void main ( String input ) {
  int n = Integer . parseInt ( input ) , m = Integer . parseInt ( input ) ;
  LinkedList < String > s = new LinkedList < String > ( ) ;
  Scanner k = new Scanner ( input ) ;
  int a = 0 ;
  while ( s . hasNext ( ) ) {
    String s = s . next ( ) ;
    int c = k . nextInt ( ) ;
    a = c + 1 ;
  }
  System . out . println ( a ) ;
}
