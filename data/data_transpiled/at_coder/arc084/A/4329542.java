static final int [ ] binarySearch ( int N ) {
  int [ ] A = new int [ N ] ;
  Arrays . sort ( A ) ;
  Arrays . sort ( B ) ;
  Arrays . sort ( C ) ;
  int [ ] x = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x [ i ] = 1 ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = binarySearch ( A , x [ i ] ) ;
    int c = N - binarySearch ( C , x [ i ] ) ;
    ans += a * c ;
  }
  System . out . println ( ans ) ;
  return x ;
}
