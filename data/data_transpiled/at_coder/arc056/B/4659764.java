@ Nonnull public static < T > T [ ] [ ] toArray ( @ Nonnull final T [ ] [ ] array ) {
  final int n = array . length ;
  final int m = array . length ;
  final int [ ] [ ] [ ] par = new int [ n ] [ ] [ ] ;
  int ans = - Float . MAX_VALUE ;
  final List < T [ ] > v = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      if ( array [ j ] [ 1 ] < array [ i ] [ 0 ] ) break ;
      final int x = array [ j ] [ 0 ] ;
      final int y = array [ j ] [ 1 ] ;
      if ( ! same ( array [ x ] , y ) ) unite ( array [ x ] , y ) ;
    }
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( array [ i ] [ 0 ] == array [ i ] [ 1 ] ) ++ ans ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      v . add ( new T [ ] [ ] {
        array [ i ] [ j ] , array [ j ] [ 0 ] }
        ) ;
      }
    }
    final int [ ] [ ] [ ] ans = new int [ n ] [ ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( array [ i ] [ j ] == array [ i ] [ 0 ] ) ++ ans [ i ] ;
      }
    }
    final int [ ] [ ] [ ] l = new int [ n ] [ ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) l [ i ] = null ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) l [ i ] [ 0 ] = array [ i ] [ 0 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( array [ i ] [ 0 ] == array [ i ] [ 1 ] ) break ;
    }
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( array [ i ] [ j ] == array [ i ] [ j ] )