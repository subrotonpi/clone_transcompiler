private static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  Set < Integer > [ ] edges = new Set [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    edges [ i ] = new HashSet < > ( ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    a -- ;
    b -- ;
    edges [ a ] . add ( b ) ;
    edges [ b ] . add ( a ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Set < Integer > x = new HashSet < > ( ) ;
    for ( int v = 0 ;
    v < edges [ i ] . size ( ) ;
    v ++ ) {
      for ( int w = 0 ;
      w < edges [ v ] . size ( ) ;
      w ++ ) {
        if ( ! edges [ i ] . contains ( w ) && w != i ) {
          x . add ( w ) ;
        }
      }
    }
    System . out . println ( x . size ( ) ) ;
  }
}
