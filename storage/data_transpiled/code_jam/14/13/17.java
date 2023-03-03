static private int [ ] [ ] bad ( int n ) {
  final int [ ] [ ] xs = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xs [ i ] = xs [ i ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int p = random . nextInt ( n - 1 ) ;
    xs [ i ] [ p ] = xs [ p ] ;
  }
  return xs ;
}
