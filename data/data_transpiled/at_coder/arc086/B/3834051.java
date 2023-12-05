static final int [ ] getIntArray ( ) {
  final int [ ] array = new int [ N ] ;
  for ( int i = 0 ;
  i < array . length ;
  i ++ ) array [ i ] = i ;
  final int N = array . length ;
  int maxVal = array [ 0 ] , maxT = 0 ;
  int minVal = array [ 0 ] , minT = array [ 0 ] ;
  for ( int t = 1 ;
  t < array . length ;
  t ++ ) {
    if ( maxVal < array [ t ] ) {
      maxVal = array [ t ] ;
      maxT = t ;
    }
    if ( minVal > array [ t ] ) {
      minVal = array [ t ] ;
      minT = t ;
    }
  }
  if ( maxVal >= - minVal ) {
    System . out . println ( 2 * N - 2 ) ;
    for ( int i = 0 ;
    i < array . length ;
    i ++ ) {
      if ( array [ i ] == maxT ) continue ;
      System . out . println ( maxT + 1 + " " + array [ i ] + " " ) ;
    }
    for ( int i = 1 ;
    i < array . length ;
    i ++ ) {
      System . out . println ( array [ i ] + " " + array [ i ] ) ;
    }
  }
  else {
    System . out . println ( 2 * N - 2 ) ;
    for ( int i = 0 ;
    i < array . length ;
    i ++ ) {
      if ( array [ i ] == minT ) continue ;
      System . out . println ( minT + 1 + " " + array [ i ] + " " ) ;
    }
    for ( int i = array . length ;
    i > 1 ;
    i -- ) {
      System . out . println ( array [ i ] + " " + array [ i ] ) ;
    }
  }
  return array ;
}
