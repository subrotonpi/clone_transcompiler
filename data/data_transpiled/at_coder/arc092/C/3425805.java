@ Nonnull public static < T > T [ ] toArray ( @ Nonnull Collection < T > collection , @ Nonnull Collection < ? extends T > collection , @ Nonnull Collection < ? extends T > collection , @ Nonnull Collection < ? extends T > collection , @ Nonnull String separator ) {
  final int N = collection . size ( ) ;
  final double INF = Double . MAX_VALUE ;
  final T [ ] A = collection . toArray ( new T [ collection . size ( ) ] ) ;
  final T [ ] del1 = collection . toArray ( new T [ collection . size ( ) ] ) ;
  final T [ ] del2 = collection . toArray ( new T [ collection . size ( ) ] ) ;
  final double INF = Double . MAX_VALUE ;
  final T [ ] A = collection . toArray ( new T [ collection . size ( ) ] ) ;
  final T [ ] ans = collection . toArray ( new T [ collection . size ( ) ] ) ;
  final T [ ] ope = collection . toArray ( new T [ collection . size ( ) ] ) ;
  System . out . println ( ans ) ;
  System . out . println ( ope . length ) ;
  System . out . println ( "\n" ) ;
  if ( collection . isEmpty ( ) ) {
    collection . remove ( ) ;
  }
  else {
    final int [ ] a = new int [ collection . size ( ) ] ;
    int num = 0 ;
    for ( int i = N ;
    i < a . length ;
    i ++ ) {
      a [ i ] = i ;
    }
    for ( int i = 1 ;
    i < dele . length ;
    i ++ ) {
      a [ num ] = 1 ;
    }
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      a [ num ] = i ;
    }
    for ( int i = 1 ;
    i < a . length ;
    i ++ ) {
      a [ num ] = a [ i ] ;
    }
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      if ( a [ i ] < a . length ) {
        a [ num ] = a [ i ] ;
      }
    }
    final T [ ] ans = collection . toArray ( new T [ list . size ( ) ] ) ;
    final T [ ] ans = collection . toArray ( ans ) ;
    System . out . println ( ans ) ;
    System . out . println ( ans . length ) ;
    System . out . println ( "\n" ) ;
  }
  if ( collection . isEmpty ( ) ) {
    collection . remove ( ) ;
  }
  return ans ;
  