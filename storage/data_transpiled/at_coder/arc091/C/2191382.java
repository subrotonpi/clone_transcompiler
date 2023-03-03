public static int [ ] solve ( int N , int A , int B ) {
  if ( A + B > N + 1 || A * B < N ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  boolean swap = false ;
  if ( A < B ) {
    B = A ;
    A = B ;
    swap = true ;
  }
  int [ ] base = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= A ;
  i ++ ) base [ i ] = i ;
  int rest = N - A ;
  int roop = ( N + A - 1 ) / A ;
  if ( roop == B ) {
    int a = A + 1 ;
    int [ ] pre = new int [ N ] ;
    while ( a <= N ) {
      pre = new int [ N ] ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) pre [ j ] = i ;
    }
    return pre ;
  }
  return base ;
}
