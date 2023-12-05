private static void solve ( int test ) {
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int v = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = ArrayUtil . getIntegerArray ( input . nextLine ( ) ) ;
  Arrays . sort ( a ) ;
  int ans = 0 ;
  int cur = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    while ( cur < a [ i ] - 1 ) {
      ans ++ ;
      cur += ( cur + 1 ) * c ;
    }
    cur += a [ i ] * c ;
  }
  while ( cur < v ) {
    ans ++ ;
    cur += ( cur + 1 ) * c ;
  }
  System . out . println ( "Case #" + test + ": " + ans ) ;
}
