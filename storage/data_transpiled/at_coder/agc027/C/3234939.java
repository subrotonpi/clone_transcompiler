public static final int [ ] getValidNodes ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  Set < Integer > [ ] toA = new Set [ n ] ;
  Set < Integer > [ ] toB = new Set [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( s . charAt ( a - 1 ) == 'A' ) {
      if ( s . charAt ( b - 1 ) == 'A' ) {
        toA [ a - 1 ] . add ( b - 1 ) ;
        toA [ b - 1 ] . add ( a - 1 ) ;
      }
      else {
        toB [ a - 1 ] . add ( b - 1 ) ;
        toA [ b - 1 ] . add ( a - 1 ) ;
      }
    }
    if ( s . charAt ( a - 1 ) == 'B' ) {
      if ( s . charAt ( b - 1 ) == 'B' ) {
        toB [ a - 1 ] . add ( b - 1 ) ;
        toB [ b - 1 ] . add ( a - 1 ) ;
      }
      else {
        toA [ a - 1 ] . add ( b - 1 ) ;
        toB [ b - 1 ] . add ( a - 1 ) ;
      }
    }
  }
  Set < Integer > notValid = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int node = notValid . remove ( i ) ;
    cnt ++ ;
    for ( int nextNode : toA [ node ] ) {
      if ( nextNode == node ) continue ;
      if ( s . charAt ( node ) == 'A' ) toA [ nextNode ] . remove ( node ) ;
      else toB [ nextNode ] . remove ( node ) ;
      if ( toA [ nextNode ] . size ( ) * toB [ nextNode ] . size ( ) == 0 ) notValid . add ( nextNode ) ;
    }
  }
  if ( cnt == n ) System . out . println ( "No" ) ;
  else System . out . println ( "Yes" ) ;
  return toA ;
}
