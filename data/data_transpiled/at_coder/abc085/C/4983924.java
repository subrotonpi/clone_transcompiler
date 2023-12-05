public static int N = Integer . parseInt ( input ) {
  int anI = 0 ;
  int anM = 0 ;
  int anK = - 1 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    for ( int m = 0 ;
    m < N - i + 1 ;
    m ++ ) {
      int k = N - i - m ;
      if ( k == 0 ) return k ;
    }
  }
  return anI ;
}
