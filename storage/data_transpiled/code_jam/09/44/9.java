static final String [ ] [ ] split ( String [ ] [ ] a ) {
  final String [ ] [ ] result = new String [ a . length ] [ ] ;
  if ( a . length == 1 ) {
    result [ 0 ] = new String [ ] {
      a [ 0 ] , new String ( ) }
      ;
      return result ;
    }
    for ( String [ ] x : split ( a [ 1 ] ) ) {
      result [ 0 ] [ 1 ] = x [ 0 ] ;
      result [ 1 ] [ 0 ] = x [ 1 ] ;
      result [ 1 ] [ 1 ] = x [ 0 ] ;
    }
    /* calc the result */
    if ( result . length == 0 ) {
      return 0.0 ;
    }
    if ( result . length == 1 ) {
      return result [ 0 ] [ 2 ] ;
    }
    Double res = null ;
    for ( int i = 0 ;
    i < result . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < i ;
      j ++ ) {
        final double dx = result [ i ] [ 0 ] - result [ j ] [ 0 ] ;
        final double dy = result [ i ] [ 1 ] - result [ j ] [ 1 ] ;
        final double d = ( dx * dx + dy * dy ) * 0.5 ;
        d += result [ i ] [ 2 ] + result [ j ] [ 2 ] ;
        if ( res == null ) {
          res = d / 2.0 ;
        }
        if ( d / 2.0 > res ) {
          res = d / 2.0 ;
        }
      }
    }
    return result ;
  }
  