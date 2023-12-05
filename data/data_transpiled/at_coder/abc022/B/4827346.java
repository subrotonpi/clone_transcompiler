static final int [ ] getCounts ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  HashMap < Integer , Integer > l = new HashMap < Integer , Integer > ( a ) ;
  int b = 0 ;
  for ( Integer k : l . keySet ( ) ) {
    if ( l . get ( k ) >= 2 ) {
      b += l . get ( k ) - 1 ;
    }
  }
  System . out . println ( b ) ;
  return a ;
}
