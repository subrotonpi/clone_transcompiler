public static void print ( int n , int c , int k ) {
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) t [ i ] = Integer . parseInt ( input ( ) ) ;
  Arrays . sort ( t ) ;
  int cnt = 0 ;
  int cur = - k ;
  int num = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( t [ i ] > cur + k || num == c ) {
      cur = t [ i ] ;
      cnt ++ ;
      num = 1 ;
    }
    else num ++ ;
  }
  System . out . println ( cnt ) ;
}
