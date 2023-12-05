public static int N = Integer . parseInt ( input ) {
  for ( int t = 0 ;
  t < 10 * 5 ;
  t ++ ) {
    if ( t * ( t + 1 ) / 2 >= N ) {
      System . out . println ( t ) ;
      break ;
    }
  }
  return 0 ;
}
