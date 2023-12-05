public static int N = Integer . parseInt ( input ) {
  int [ ] dp = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    dp [ x ] = dp [ x - 1 ] + 1 ;
  }
  return N - max ( dp ) ;
}
