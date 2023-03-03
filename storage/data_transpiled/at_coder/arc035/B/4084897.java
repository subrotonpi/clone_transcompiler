public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( t ) ;
  int m = 10 * 9 + 7 ;
  int res = 0 ;
  int ass = 1 ;
  int [ ] p = new int [ n + 1 ] ;
  p [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    p [ i ] = p [ i - 1 ] * i % m ;
  }
  int c = 0 ;
  int k = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    c += t [ i ] ;
    res += c ;
    if ( i != n - 1 ) {
      if ( t [ i ] != t [ i + 1 ] ) {
        ass = ass * p [ k ] % m ;
        k = 1 ;
      }
      else {
        k ++ ;
      }
    }
    else {
      ass = ass * p [ k ] % m ;
    }
  }
  System . out . println ( res ) ;
  System . out . println ( ass ) ;
}
