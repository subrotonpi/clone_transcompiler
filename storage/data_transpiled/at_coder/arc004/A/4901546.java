static final double [ ] [ ] x ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double lmax = 0 ;
  double [ ] lx = new double [ n ] ;
  double [ ] ly = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double x = Integer . parseInt ( input . nextLine ( ) ) ;
    double y = Integer . parseInt ( input . nextLine ( ) ) ;
    lx [ i ] = x ;
    ly [ i ] = y ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 1 ;
    j < n ;
    j ++ ) {
      double a = Math . abs ( lx [ i ] [ j ] ) ;
      double b = Math . abs ( ly [ i ] [ j ] ) ;
      double l = a * a + b * b ;
      if ( lmax < l ) lmax = l ;
    }
  }
  return lx ;
}
