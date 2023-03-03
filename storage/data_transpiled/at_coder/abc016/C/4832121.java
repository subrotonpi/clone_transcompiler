private static void input ( Scanner in ) {
  int n = in . nextInt ( ) , m = in . nextInt ( ) ;
  Set < Integer > [ ] s = new Set [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = in . nextInt ( ) , b = in . nextInt ( ) ;
    s [ a - 1 ] . add ( b - 1 ) ;
    s [ b - 1 ] . add ( a - 1 ) ;
  }
  for ( Set < Integer > i : s ) {
    Set < Integer > l = new HashSet < Integer > ( ) ;
    for ( int j : i ) l . addAll ( i ) ;
    System . out . println ( l . size ( ) - i ) ;
  }
}
