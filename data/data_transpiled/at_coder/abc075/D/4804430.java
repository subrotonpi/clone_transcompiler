public static double getDistance ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , k = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > p = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) p . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  double ans = Double . POSITIVE_INFINITY ;
  Collections . sort ( p ) ;
  for ( int i = 0 ;
  i < n - k + 1 ;
  i ++ ) {
    for ( int j = i + k - 1 ;
    j < n ;
    j ++ ) {
      double x = p . get ( j ) . x - p . get ( i ) . x ;
      List < Integer > yl = new ArrayList < > ( p . subList ( i , j + 1 ) ) ;
      for ( int l = 0 ;
      l < yl . size ( ) - k + 1 ;
      l ++ ) {
        double y = yl . get ( l + k - 1 ) . y - yl . get ( l ) . y ;
        ans = Math . min ( ans , y * x ) ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
