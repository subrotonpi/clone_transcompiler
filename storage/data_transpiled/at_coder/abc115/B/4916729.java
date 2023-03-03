static public int main ( String [ ] in ) {
  final int N = Integer . parseInt ( next ( in ) ) ;
  final int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] = Integer . parseInt ( next ( in ) ) ;
  }
  P [ 0 ] = Integer . parseInt ( next ( in ) ) ;
  return P [ 0 ] ;
}
