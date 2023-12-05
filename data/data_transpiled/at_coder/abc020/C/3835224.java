static final int [ ] [ ] getBinarySearch ( int [ ] [ ] adj ) {
  class Dijkstra {
    int [ ] [ ] [ ] _adj ;
    int [ ] [ ] _visited = new int [ adj . length ] [ ] ;
    int [ ] [ ] _heap = new int [ adj . length ] [ ] ;
    int [ ] [ ] _heap ;
    int [ ] [ ] _heap ;
    int [ ] [ ] _heap ;
    int [ ] [ ] _heap ;
    int [ ] [ ] _heap ;
    int low = 0 ;
    int high = _heap [ 0 ] . length ;
    int t = Integer . MIN_VALUE ;
    while ( true ) {
      if ( _heap . length == 0 ) break ;
      int [ ] start = new int [ w ] ;
      for ( int j = 0 ;
      j < h ;
      j ++ ) {
        _heap [ 0 ] [ j ] = 0 ;
      }
      int [ ] [ ] _adj = new int [ w ] [ h ] ;
      for ( int i = 0 ;
      i < w * h ;
      i ++ ) {
        _adj [ i ] [ j ] = _heap [ i ] [ j ] ;
        if ( _adj [ i ] [ j ] == - 1 ) {
          continue ;
        }
        _visited [ i ] = _heap [ i ] [ j ] ;
      }
      for ( int i = 0 ;
      i < _heap . length ;
      i ++ ) {
        if ( _heap [ i ] [ j ] == - 1 && _heap [ i ] [ j ] != 0 ) {
          _heap [ i ] [ j ] = _heap [ i ] [ j ] ;
        }
      }
    }
  }
  int [ ] [ ] _heap = new int [ w ] [ h ] ;
  for ( int i = 0 ;
  i < _heap . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < _heap [ i ] . length ;
    j ++ ) {
      if ( _heap [ i ] [ j ] == '#' ) {
        if ( i + 1 < h ) _heap [ w * ( i + 1 ) + j ] [ w * i + j ] = t ;
        if ( j + 1 < w ) _heap [ w * i + j ] [ j ] = t ;
      }
      else {
        _heap [ w * i + j ] [ j ] = 1 ;
      }
    }
  }
  Dijkstra . dijkstra ( _heap ) ;
  return _heap ;
}
