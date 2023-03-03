public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  LinkedList < Integer > num = new LinkedList < Integer > ( ) ;
  num . add ( 2 ) ;
  num . add ( 2000 ) ;
  pri . clear ( ) ;
  while ( num . size ( ) > 0 ) {
    int p = num . pop ( ) ;
    pri . add ( p ) ;
  }
  List five = new ArrayList ( ) ;
  for ( int i : pri ) {
    if ( i % 5 == 1 ) {
    }
  }
  String ans = five . toString ( ) ;
  System . out . println ( Arrays . toString ( ans ) ) ;
}
