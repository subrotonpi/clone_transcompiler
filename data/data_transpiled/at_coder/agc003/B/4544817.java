public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] A = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    cnt += A [ i ] / 2 ;
    if ( A [ i ] % 2 == 0 && A [ i + 1 ] > 0 ) {
      cnt ++ ;
      A [ i + 1 ] -- ;
    }
  }
  cnt += A [ n - 1 ] / 2 ;
  System . out . println ( cnt ) ;
}
