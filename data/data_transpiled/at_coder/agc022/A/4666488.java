public static int input ( ) {
  int S = input ( ) ;
  int N = S . length ( ) ;
  if ( N < 26 ) {
    for ( int i = 97 ;
    i < 123 ;
    i ++ ) {
      if ( ! S . contains ( ( char ) i ) ) {
        System . out . println ( S + ( char ) i ) ;
        exit ( ) ;
      }
    }
  }
  int [ ] minC = new int [ N ] ;
  minC [ N - 1 ] = S . length - 1 ;
  for ( int c = S . length - 2 ;
  c >= 0 ;
  c -- ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int mc = minC [ i ] ;
      if ( c < mc ) {
        System . out . println ( S . substring ( 0 , i ) + mc ) ;
        exit ( ) ;
      }
    }
  }
  return N ;
}
