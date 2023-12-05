public static int N = Integer . parseInt ( input ) {
  int [ ] a = new int [ N ] ;
  int stage = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int in = Integer . parseInt ( input ) ;
    if ( ! a [ in ] ) {
      a [ stage ] = in ;
      stage ++ ;
    }
  }
  return stage ;
}
