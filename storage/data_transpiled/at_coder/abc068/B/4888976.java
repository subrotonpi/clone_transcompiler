public static int N = Integer . parseInt ( input ) {
  for ( int i = 0 ;
  i < 7 ;
  i ++ ) {
    if ( 2 * i <= N && N < 2 * ( i + 1 ) ) {
      System . out . println ( 2 * i ) ;
    }
  }
  return 0 ;
}
