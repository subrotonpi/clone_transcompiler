@ VisibleForTesting static LinkedHashMap < Integer , Boolean > map ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  List < List < Integer >> edges = new ArrayList < > ( n + 1 ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    edges . get ( a ) . add ( b ) ;
    edges . get ( b ) . add ( a ) ;
  }
  List < Integer > ans = new ArrayList < > ( 1 + edges . get ( 1 ) . get ( 0 ) ) ;
  boolean [ ] used = new boolean [ n + 1 ] ;
  used [ n ] = true ;
  while ( true ) {
    boolean ok = true ;
    for ( int e : edges . get ( ans . get ( 0 ) ) ) {
      if ( used [ e ] == false ) {
        ans . add ( e ) ;
        used [ e ] = true ;
        ok = false ;
        break ;
      }
    }
    if ( ok ) break ;
  }
  System . out . println ( ans . size ( ) ) ;
  System . out . println ( ans . toArray ( ) ) ;
  return ans ;
}
