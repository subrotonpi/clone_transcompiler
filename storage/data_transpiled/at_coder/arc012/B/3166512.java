static double n ( int n , double v1 , double v2 , double l ) {
  double time ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    time = l / v1 ;
    l = v2 * time ;
    if ( l <= 1e-6 ) l = 0 ;
  }
  System . out . println ( l ) ;
}
