private static void print ( int n , int m ) {
  Map < Integer , Set < Integer >> graph = new HashMap < > ( ) ;
  for ( int u = 1 ;
  u <= n ;
  u ++ ) graph . put ( u , new HashSet < > ( ) ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int u = Integer . parseInt ( input . nextLine ( ) ) ;
    int v = Integer . parseInt ( input . nextLine ( ) ) ;
    graph . get ( u ) . add ( v ) ;
    graph . get ( v ) . add ( u ) ;
  }
  int odd = 0 ;
  Stack < Integer > v6 = new Stack < > ( ) ;
  Stack < Integer > v4 = new Stack < > ( ) ;
  for ( int u = 1 ;
  u <= n ;
  u ++ ) {
    if ( graph . get ( u ) . size ( ) % 2 != 0 ) {
      odd ++ ;
      break ;
    }
    else if ( graph . get ( u ) . size ( ) >= 6 ) {
      v6 . push ( u ) ;
    }
    else if ( graph . get ( u ) . size ( ) == 4 ) {
      v4 . push ( u ) ;
    }
  }
  if ( odd > 0 ) System . out . println ( "No" ) ;
  else {
    if ( v6 . size ( ) > 0 || v4 . size ( ) > 2 ) System . out . println ( "Yes" ) ;
    else if ( v4 . size ( ) < 2 ) System . out . println ( "No" ) ;
    else {
      int s = v4 . pop ( ) ;
      int t = v4 . pop ( ) ;
      boolean has3Cycles = false ;
      for ( int c : graph . get ( s ) ) {
        Set < Integer > visited = new HashSet < > ( ) ;
        visited . add ( s ) ;
        visited . add ( t ) ;
        Queue < Integer > q = new LinkedList < > ( ) ;
        q . add ( c ) ;
        while ( q . size ( ) > 0 ) {
          int v = q . poll ( ) ;
          if ( visited . contains ( v ) ) continue ;
          visited . add ( v ) ;
          for ( int u : graph . get ( v ) ) {
            if ( v != c && u == s ) {
              has3Cycles = true ;
              break ;
            }
            if ( ! visited . contains ( u ) ) q . add ( u ) ;
          }
          if ( has3Cycles ) break ;
        }
        if ( has3Cycles ) break ;
        