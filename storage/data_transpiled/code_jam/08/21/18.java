static private List < List < Pair < Integer , Point >>> readData ( ) {
  /* rl */
  int n = Integer . parseInt ( rl . nextLine ( ) ) ;
  List < List < Pair < Integer , Point >>> cases = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    n = ( Integer ) rl . nextLine ( ) ;
    A = ( Integer ) rl . nextLine ( ) ;
    B = ( Integer ) rl . nextLine ( ) ;
    C = ( Integer ) rl . nextLine ( ) ;
    D = ( Integer ) rl . nextLine ( ) ;
    x = ( Integer ) rl . nextLine ( ) ;
    y = ( Integer ) rl . nextLine ( ) ;
    M = ( Integer ) rl . nextLine ( ) ;
    Point [ ] points = new Point [ n ] ;
    points [ 0 ] = new Point ( x , y ) ;
    for ( int i : xrange ( n ) ) {
      x = ( A * x + B ) % M ;
      y = ( C * y + D ) % M ;
      points [ i ] = new Point ( x , y ) ;
    }
    List < Pair < Integer , Point >> case = new ArrayList < > ( ) ;
    case . add ( new Pair < > ( n , points ) ) ;
    cases . add ( case ) ;
  }
  int caseNumber = 1 ;
  for ( List < Pair < Integer , Point >> testCase : readData ( ) ) {
    n = testCase . size ( ) ;
    Point [ ] points = testCase . get ( 0 ) ;
    int triangles = 0 ;
    for ( int p1 : xrange ( n ) ) {
      Point v1 = points [ p1 ] ;
      for ( int p2 : xrange ( p1 + 1 , n ) ) {
        Point v2 = points [ p2 ] ;
        for ( int p3 : xrange ( p2 + 1 , n ) ) {
          Point v3 = points [ p3 ] ;
          int cx = ( v1 . x + v2 . x + v3 . x ) % 3 ;
          int cy = ( v1 . y + v2 . y + v3 . y ) % 3 ;
          if ( cx == 0 && cy == 0 ) {
            triangles ++ ;
          }
        }
      }
    }
    System . out . println ( "Case #" + caseNumber + ":" + triangles ) ;
    caseNumber ++ ;
  }
  return cases ;
}
