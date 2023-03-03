@ VisibleForTesting static Iterable < String > lexesFor ( List < String > paths ) {
  final int n = paths . size ( ) ;
  final Comparator < String > lexComparator = ( path , best ) -> {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      final int p = paths . get ( i ) ;
      final int b = paths . get ( i ) ;
      if ( p > b ) return false ;
      else if ( p < b ) return true ;
    }
    return true ;
  }
  ;
  final Comparator < String > yoba = ( keys , chests , path , best ) -> {
    if ( ! check ( keys , chests ) ) return best ;
    if ( ! lexComparator . compare ( path , best ) ) return best ;
    if ( chests . size ( ) == 0 && lexComparator . compare ( path , best ) ) {
      best = path ;
    }
    for ( int i = 0 ;
    i < chests . size ( ) ;
    i ++ ) {
      final int index = chests . get ( i ) ;
      final String currKey = chests . get ( index ) ;
      final Set < String > keysInside = chests . get ( index ) ;
      if ( keysInside . contains ( currKey ) ) {
        final int ik = keys . indexOf ( currKey ) ;
        best = yoba . compare ( keys . subList ( 0 , ik ) . subList ( ik + 1 , i ) . subList ( 0 , i ) . subList ( i + 1 , chests . size ( ) ) , path . subList ( index , index ) , best ) ;
        if ( best != null && lexComparator . compare ( best , new String [ ] {
          "IMPOSSIBLE" }
          ) ) break ;
        }
      }
      return best ;
    }
    ;
    final Set < String > allKeys = keys ;
    final Set < String > needKeys = new HashSet < > ( ) ;
    for ( int index = 0 ;
    index < chests . size ( ) ;
    index ++ ) {
      final String currKey = chests . get ( index ) ;
      final Set < String > keysInside = chests . get ( index ) ;
      allKeys = allKeys . addAll ( keysInside ) ;
      needKeys = needKeys . add ( currKey ) ;
    }
    for ( String key : new HashSet < > ( needKeys ) ) {
      if ( allKeys . stream ( ) . noneMatch ( key ) ) return false ;
    }
    final ImmutableList < String > tchests = chests ;
    final ImmutableSet