public static void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String buf = input ;
  int N = Integer . parseInt ( buf ) ;
  int [ ] a = new int [ N ] ;
  int [ ] b = new int [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    buf = input ;
    StringTokenizer bufTokenizer = new StringTokenizer ( buf ) ;
    a [ i ] = Integer . parseInt ( bufTokenizer . nextToken ( ) ) - 1 ;
    b [ i ] = Integer . parseInt ( bufTokenizer . nextToken ( ) ) - 1 ;
  }
  int [ ] [ ] graph = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) graph [ i ] = new int [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) graph [ i ] [ 0 ] = new int [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    graph [ i ] [ 1 ] = b [ i ] ;
    graph [ i ] [ 2 ] = a [ i ] ;
  }
  String path = findPath ( graph , 0 , N - 1 , new String [ N ] ) ;
  int splitPoint = ( path . length ( ) + 1 ) / 2 ;
  String [ ] fennec_base = path . substring ( 0 , splitPoint ) ;
  String [ ] snukeBase = path . substring ( splitPoint , path . length ( ) ) ;
  int fennecVertexCount = fennec_base . length ;
  int snukeVertexCount = snukeBase . length ;
  for ( int i = 0 ;
  i < fennec_base . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < graph [ i ] [ j ] . length ;
    j ++ ) {
      if ( i != 0 ) {
        if ( j == fennec_base [ i - 1 ] . length ( ) ) continue ;
      }
      if ( i != fennec_base . length - 1 ) {
        if ( j == fennec_base [ i + 1 ] . length ( ) ) continue ;
      }
      else {
        if ( j == snukeBase [ 0 ] . length ( ) ) continue ;
      }
      fennecVertexCount += getVertexCount ( graph , i , j ) ;
    }
  }
  if ( fennecVertexCount > snukeVertexCount ) {
    System