@ PrioleDict public static void Dijkstra ( Map < Integer , Integer > G , int start , int end ) {
  Map < Integer , Integer > D = new HashMap < Integer , Integer > ( ) ;
  Map < Integer , Integer > P = new HashMap < Integer , Integer > ( ) ;
  PriorityDictionary Q = new PriorityDictionary ( ) ;
  Q . put ( start , 0 ) ;
  for ( int v = 0 ;
  v < Q . size ( ) ;
  v ++ ) {
    D . put ( v , Q . get ( v ) ) ;
    if ( v == end ) break ;
    for ( int w = 0 ;
    w < G . get ( v ) . size ( ) ;
    w ++ ) {
      int [ ] vwLength = D . get ( v ) . size ( ) + G . get ( v ) . get ( w ) . size ( ) ;
      if ( D . containsKey ( w ) ) {
        if ( vwLength < D . get ( w ) ) {
          System . out . println ( "Dijkstra: found better path to already-final vertex" ) ;
        }
      }
      else if ( ! Q . containsKey ( w ) || vwLength < Q . get ( w ) ) {
        Q . put ( w , vwLength ) ;
        P . put ( w , v ) ;
      }
    }
  }
  if ( "__main__" . equals ( "__main__" ) ) {
    Main . main ( ) ;
  }
  else {
    Map < Integer , Integer > D = Dijkstra ( G , start , end ) ;
    Map < Integer , Integer > P = new HashMap < Integer , Integer > ( ) ;
    List < Integer > Path = new ArrayList < Integer > ( ) ;
    while ( true ) {
      Path . add ( end ) ;
      if ( end == start ) break ;
      end = P . get ( end ) ;
    }
    Path . reverse ( ) ;
    return Path ;
  }
  final int minflowV = Math . min ( Math . abs ( b2 . y - b1 . z - 1 ) , Math . abs ( b1 . y - b2 . z - 1 ) ) ;
  final int minflowH = Math . min ( Math . abs ( b2 . x - b1 . x - b2 . x - 1 ) , Math . abs ( b1 . y - b1 . y - b2 . x - 1 ) ) ;
  if ( ( b1 . x <= b2 . x && b1 . y >= b2 .