public static void input ( Scanner s ) {
  int n = s . nextInt ( ) ;
  char [ ] t = s . toCharArray ( ) ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) != t [ i ] ) {
      cnt ++ ;
    }
  }
  if ( n == 1 ) {
    System . out . println ( 0 ) ;
  }
  else if ( cnt == 2 ) {
    System . out . println ( 24 * 2 + 25 * ( n - 2 ) ) ;
  }
  else if ( cnt == 0 && n % 2 != 0 ) {
    System . out . println ( 25 * ( n - 1 ) ) ;
  }
  else {
    System . out . println ( 25 * n ) ;
  }
}
