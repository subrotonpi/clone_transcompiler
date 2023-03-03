public static long [ ] getCounts ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  long [ ] a = new long [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Long . parseLong ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( a ) ;
  long s = 0 ;
  long m = 1 ;
  long c = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i > 0 ) {
      if ( a [ i - 1 ] == a [ i ] ) {
        c ++ ;
        m = m * c % 1000000007 ;
      }
      else {
        c = 1 ;
      }
    }
    s += ( n - i ) * a [ i ] ;
  }
  System . out . println ( s ) ;
  System . out . println ( m ) ;
  return a ;
}
