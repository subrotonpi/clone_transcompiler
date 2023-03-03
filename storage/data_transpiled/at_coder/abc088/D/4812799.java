@ VisibleForTesting static void main ( String [ ] args ) {
  int h = Integer . parseInt ( args [ 0 ] ) ;
  int w = Integer . parseInt ( args [ 1 ] ) ;
  String [ ] s = new String [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    s [ i ] = input . nextLine ( ) ;
  }
  int [ ] [ ] dist = new int [ w ] [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    dist [ i ] [ 0 ] = - 1 ;
  }
  int black = 0 ;
  for ( String line : s ) {
    black += line . indexOf ( "#" ) ;
  }
  PriorityQueue < Integer > que = new PriorityQueue < Integer > ( ) ;
  que . add ( new Integer [ ] {
    0 , 0 }
    ) ;
    dist [ 0 ] [ 0 ] = 1 ;
    while ( que . size ( ) > 0 ) {
      int x = que . poll ( ) ;
      int y = que . poll ( ) ;
      for ( int i = 1 , j = 0 ;
      i < h ;
      i ++ , j ++ ) {
        int nx = x + i ;
        int ny = y + j ;
        if ( nx < 0 || nx >= h || ny < 0 || ny >= w ) {
          continue ;
        }
        if ( s [ nx ] . charAt ( ny ) == '#' ) {
          continue ;
        }
        if ( dist [ nx ] [ ny ] == - 1 ) {
          dist [ nx ] [ ny ] = dist [ x ] [ y ] + 1 ;
          que . add ( new Integer ( nx ) ) ;
        }
      }
    }
    if ( dist [ h - 1 ] [ w - 1 ] == - 1 ) {
      System . out . println ( - 1 ) ;
    }
    else {
      System . out . println ( h * w - dist [ h - 1 ] [ w - 1 ] - black ) ;
    }
  }
  