static final double [ ] [ ] resize ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] [ ] a = new double [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = resize ( a [ i ] ) ;
  }
  return a ;
}
