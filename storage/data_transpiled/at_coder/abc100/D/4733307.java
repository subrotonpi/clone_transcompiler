static void m ( int n , int m ) {
  List < List < Integer >> x = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  @ SuppressWarnings ( "unchecked" ) int res = 0 ;
  for ( int [ ] a : x ) {
    List < Integer > ts = new ArrayList < > ( ) ;
    for ( List < Integer > t : x ) {
      int ta = 0 ;
      for ( int i = a , j = 0 ;
      i < t . size ( ) ;
      j ++ ) ta += a [ i ] * t . get ( j ) ;
      ts . add ( ta ) ;
    }
    int s = Integer . valueOf ( ts . toString ( ) . substring ( 0 , m ) ) ;
    res = Math . max ( res , s ) ;
  }
  System . out . println ( res ) ;
}
