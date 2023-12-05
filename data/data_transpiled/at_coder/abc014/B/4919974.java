public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ( K >> i ) & 1 == 1 ) {
      res += A [ i ] ;
    }
  }
  return res ;
}
