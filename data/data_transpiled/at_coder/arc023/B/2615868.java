public static void print ( int r , int c , int d ) {
  List < Integer > li = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    List < Integer > a = new LinkedList < > ( ) ;
    a . add ( i ) ;
    a = a . subList ( 2 , d % 2 != i % 2 ) . subList ( 0 , Math . min ( c , Math . max ( 0 , d + 1 - i ) ) ) ;
    if ( a . size ( ) > 0 ) li . addAll ( a ) ;
  }
  System . out . println ( max ( li ) ) ;
}
