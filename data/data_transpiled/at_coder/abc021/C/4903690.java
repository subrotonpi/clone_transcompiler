public static void main ( String input ) {
  N = Integer . parseInt ( input ) ;
  a = Integer . parseInt ( input ) ;
  b = Integer . parseInt ( input ) ;
  M = Integer . parseInt ( input ) ;
  List < List < Integer >> XY = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    XY . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  int mod = ( int ) ( 1e9 + 7 ) ;
  Map < Integer , Set < Integer >> edges_from = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < XY . size ( ) ;
  i ++ ) {
    int x = XY . get ( i ) ;
    int y = XY . get ( i ) ;
    edges_from . computeIfAbsent ( x , k -> new HashSet < > ( ) ) . add ( y ) ;
    edges_from . computeIfAbsent ( y , k -> new HashSet < > ( ) ) . add ( x ) ;
  }
  Set < Integer > toVisit = new HashSet < > ( ) ;
  Set < Integer > visited = new HashSet < > ( ) ;
  nums = new int [ N + 1 ] ;
  nums [ a ] = 1 ;
  while ( true ) {
    Set < Integer > nextVisit = new HashSet < > ( ) ;
    for ( int v : toVisit ) {
      for ( int u : edges_from . get ( v ) ) {
        if ( ! visited . contains ( u ) ) {
          nextVisit . add ( u ) ;
          nums [ u ] = ( nums [ u ] + nums [ v ] ) % mod ;
        }
      }
    }
    if ( nums [ b ] != 0 ) {
      System . out . println ( nums [ b ] ) ;
      break ;
    }
    toVisit = nextVisit ;
    visited = visited . stream ( ) . filter ( i -> i > b ) . collect ( Collectors . toSet ( ) ) ;
  }
}
