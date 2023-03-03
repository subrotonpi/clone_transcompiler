public static int yakusu ( int m ) {
  int cnt = 1 ;
  for ( int i = 1 ;
  i <= ( m / 2 ) ;
  i ++ ) {
    if ( m % i == 0 ) {
      cnt ++ ;
    }
  }
  return cnt ;
}
