@ VisibleForTesting static int bipartiteMatch ( Map < Integer , List < Integer >> graph ) throws IOException {
  final Map < Integer , List < Integer >> matching = new HashMap < > ( ) ;
  for ( int u : graph . keySet ( ) ) {
    for ( int v : graph . get ( u ) ) {
      if ( ! matching . containsKey ( v ) ) {
        matching . put ( v , u ) ;
        break ;
      }
    }
  }
  while ( true ) {
    final Map < Integer , List < Integer >> preds = new HashMap < > ( ) ;
    final List < Integer > unmatched = new ArrayList < > ( ) ;
    final Map < Integer , List < Integer >> pred = new HashMap < > ( ) ;
    for ( int u : graph . keySet ( ) ) {
      pred . put ( u , unmatched ) ;
    }
    for ( int v : matching . keySet ( ) ) {
      pred . remove ( matching . get ( v ) ) ;
    }
    List < Integer > layer = new LinkedList < > ( ) ;
    while ( layer . isEmpty ( ) && unmatched . isEmpty ( ) ) {
      final Map < Integer , List < Integer >> newLayer = new HashMap < > ( ) ;
      for ( int u : layer ) {
        for ( int v : graph . get ( u ) ) {
          if ( ! preds . containsKey ( v ) ) {
            newLayer . computeIfAbsent ( v , k -> new ArrayList < > ( ) ) . add ( u ) ;
          }
        }
      }
      layer . clear ( ) ;
      for ( int v : newLayer ) {
        preds . put ( v , newLayer . get ( v ) ) ;
        if ( matching . containsKey ( v ) ) {
          layer . add ( matching . get ( v ) ) ;
          pred . put ( matching . get ( v ) , v ) ;
        }
        else {
          unmatched . add ( v ) ;
        }
      }
    }
    if ( unmatched . isEmpty ( ) ) {
      final Map < Integer , List < Integer >> unlayered = new HashMap < > ( ) ;
      for ( int u : graph . keySet ( ) ) {
        for ( int v : graph . get ( u ) ) {
          if ( ! preds . containsKey ( v ) ) {
            unlayered . put ( v , null ) ;
          }
        }
      }
      return ( matching . size ( ) == 0 ? 1 : 0 ) ? 1 : 0 ;
    }
    else {
      return 0 ;
    }
  }
}
