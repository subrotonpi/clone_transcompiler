static final double [ ] getDoubleArray ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] l = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l = Math . roll ( l , 1 ) ;
    if ( ( l == l . length ) ) ans += n ;
  }
  return l ;
}
