@ SafeVarargs public static void binarySearch ( String ... strings ) {
  int n = Integer . parseInt ( input ( ) ) ;
  List < Integer > a = new ArrayList < > ( Arrays . asList ( strings ) ) ;
  List < Integer > b = new ArrayList < > ( Arrays . asList ( strings ) ) ;
  List < Integer > c = new ArrayList < > ( Arrays . asList ( strings ) ) ;
  int ans = 0 ;
  List < Integer > x = cumsum ( n - BiConsumer . right ( c , s ) ) ;
  List < Integer > y = new ArrayList < > ( ) ;
  for ( Integer t : a ) y . add ( t ) ;
  for ( int i : y ) {
    if ( i < n ) ans += x . get ( i ) ;
  }
  System . out . println ( ans ) ;
}
