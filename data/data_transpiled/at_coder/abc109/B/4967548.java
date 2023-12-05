static final int [ ] [ ] resize ( int n ) {
  int [ ] [ ] w = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    w [ i ] = resize ( w [ i ] ) ;
  }
  flag = true ;
  count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    w [ i ] [ 0 ] = w [ i - 1 ] [ i - 1 ] ;
  }
  return w ;
}
