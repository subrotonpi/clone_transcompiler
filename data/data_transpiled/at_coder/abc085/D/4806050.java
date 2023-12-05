public static void main ( String input ) {
  int n = Integer . parseInt ( input ) , h = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] , b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int c = Integer . parseInt ( input ) ;
    int d = Integer . parseInt ( input ) ;
    a [ i ] = c ;
    b [ i ] = d ;
  }
  int aMax = max ( a ) ;
  Arrays . sort ( b ) ;
  int piv = 0 ;
  int res = 0 ;
  while ( h > 0 && piv < n && b [ piv ] > aMax ) {
    res ++ ;
    h -= b [ piv ] ;
    piv ++ ;
  }
  if ( h > 0 ) {
    res += ( h + aMax - 1 ) / aMax ;
  }
  System . out . println ( res ) ;
}
