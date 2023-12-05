public static double [ ] getDoubleArray ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] ax = new double [ n ] ;
  double [ ] ay = new double [ n ] ;
  double [ ] bx = new double [ n ] ;
  double [ ] by = new double [ n ] ;
  double [ ] g = new double [ 4 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ax [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    ay [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    g [ 0 ] += ax [ i ] ;
    g [ 1 ] += ay [ i ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    bx [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    by [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    g [ 2 ] += bx [ i ] ;
    g [ 3 ] += by [ i ] ;
  }
  g [ 0 ] /= n ;
  g [ 1 ] /= n ;
  g [ 2 ] /= n ;
  g [ 3 ] /= n ;
  double [ ] d = new double [ 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double tx = ax [ i ] - g [ 0 ] ;
    double ty = ay [ i ] - g [ 1 ] ;
    double t = tx * tx + ty * ty ;
    d [ 0 ] = Math . max ( d [ 0 ] , t ) ;
    tx = bx [ i ] - g [ 2 ] ;
    ty = by [ i ] - g [ 3 ] ;
    t = tx * tx + ty * ty ;
    d [ 1 ] = Math . max ( d [ 1 ] , t ) ;
  }
  double ans = ( d [ 1 ] / d [ 0 ] ) * 0.5 ;
  System . out . println ( ans ) ;
  return d ;
}
