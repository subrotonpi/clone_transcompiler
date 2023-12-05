public static void divide ( List < Point > pt , int d , Set < Point > r ) {
  if ( pt . size ( ) == 1 ) return ;
  if ( pt . size ( ) == 2 ) {
    Point v0 = pt . get ( 0 ) ;
    Point v1 = pt . get ( 1 ) ;
    if ( v0 . x != v1 . x && v0 . y != v1 . y ) r . add ( new Point ( v0 . x , v1 . y ) ) ;
    return ;
  }
  Collections . sort ( pt , new Comparator < Point > ( ) {
    @ Override public int compare ( Point o1 , Point o2 ) {
      int i = o1 . x / 2 ;
      if ( d == 0 ) {
        Point pv0 = pt . get ( i ) . x ;
        for ( Point v : pt ) r . add ( new Point ( pv0 , v . y ) ) ;
      }
      else {
        Point pv1 = pt . get ( i ) . y ;
        for ( Point v : pt ) r . add ( new Point ( v . x , pv1 ) ) ;
      }
      Point [ ] pt0 = pt . toArray ( new Point [ i ] ) ;
      Point [ ] pt1 = pt . toArray ( new Point [ i ] ) ;
      int nd = 1 - d ;
      divide ( pt0 , nd , r ) ;
      divide ( pt1 , nd , r ) ;
      return i ;
    }
  }
  ) ;
  /* solve the number of points */
  Set < Point > org = new HashSet < Point > ( ) ;
  Set < Point > r = new HashSet < Point > ( ) ;
  for ( Point v : pt ) org . add ( v ) ;
  divide ( pt , 0 , r ) ;
  for ( Point v : org ) if ( r . contains ( v ) ) r . remove ( v ) ;
  System . out . println ( r . size ( ) ) ;
  for ( Point v : r ) {
    int x = v . x ;
    int y = v . y ;
    System . out . println ( x + " " + y ) ;
  }
  /* main program */
  int n = input . nextInt ( ) ;
  int n = Integer . parseInt ( n ) ;
  pt = new Point [ n ] ;
  for ( ;
  ;
  ) {
    int x = Integer . parseInt ( x ) ;
    int y = Integer . parseInt ( y ) ;
    pt [ i ] = new Point ( x , y ) ;
  }
  solve ( n , pt ) ;
}
