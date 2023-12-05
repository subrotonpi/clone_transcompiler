static final double [ ] [ ] read ( final char [ ] board , final int R , final int C ) {
  final int M = C - 1 ;
  final int [ ] [ ] board = new int [ R ] [ C ] ;
  final HashMap < Integer , int [ ] > cache = new HashMap < Integer , int [ ] > ( ) ;
  final int [ ] [ ] result = new int [ R ] [ C ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    result [ i ] = new int [ R ] ;
    cache . put ( result [ i ] , result [ i ] ) ;
  }
  while ( result [ 0 ] == 0 ) {
    if ( result [ 1 ] == 0 ) {
      result [ 1 ] = result [ 0 ] ;
    }
    if ( result [ 1 ] [ 0 ] == 0 ) {
      return result [ 1 ] ;
    }
    else if ( result [ 1 ] [ 0 ] == 0 ) {
      result [ 1 ] = result [ 1 ] [ 0 ] ;
    }
    else {
      final int [ ] result = new int [ R ] ;
      for ( int i = 0 ;
      i < result . length ;
      i ++ ) {
        result [ i ] = result [ i ] ;
      }
      for ( int i = 0 ;
      i < result . length ;
      i ++ ) {
        result [ i ] = result [ i ] ;
      }
      return result ;
    }
  }
  if ( result [ 0 ] == 0 ) {
    result [ 0 ] = 0 ;
    if ( result [ 1 ] == 0 ) {
      result [ 1 ] = 2 ;
      result [ 2 ] -= 1 ;
      result [ 3 ] -= 1 ;
      result [ 4 ] = 2 ;
      result [ 5 ] += 1 ;
    }
  }
  if ( result [ 1 ] == 0 ) {
    result [ 1 ] = 0 ;
    result [ 2 ] = 1 ;
    result [ 3 ] = 1 ;
  }
  else {
    result [ 1 ] = 0 ;
    result [ 3 ] = 1 ;
  }
  return result ;
}
