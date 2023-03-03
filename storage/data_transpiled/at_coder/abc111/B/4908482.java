public static int N = Integer . parseInt ( input ) {
  for ( int i = 0 ;
  i < N ;
  i += 1000 ) {
    if ( i % 111 == 0 ) {
      System . out . println ( i ) ;
      exit ( ) ;
    }
  }
  return 0 ;
}
