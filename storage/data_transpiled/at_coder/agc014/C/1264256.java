static final int [ ] [ ] resize ( int h , int w , int k ) {
  int [ ] [ ] a = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) a [ i ] [ 0 ] = input . next ( ) ;
  int minDer = w * h ;
  boolean s = false ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) for ( int j = 0 ;
  j < w ;
  j ++ ) if ( a [ i ] [ j ] == 'S' ) {
    s = ( i , j ) ;
    break ;
  }
  if ( s ) break ;
  Queue < Integer > dq = new LinkedList < Integer > ( ) ;
  dq . add ( new Integer [ ] {
    0 , s [ 0 ] , s [ 1 ] }
    ) ;
    boolean [ ] [ ] moved = new boolean [ h ] [ w ] ;
    for ( int j = 0 ;
    j < w ;
    j ++ ) for ( int i = 0 ;
    i < h ;
    i ++ ) moved [ j ] [ i ] = false ;
    while ( dq . size ( ) > 0 ) {
      int m = dq . poll ( ) ;
      int y = dq . poll ( ) ;
      int x = dq . poll ( ) ;
      if ( moved [ y ] [ x ] ) continue ;
      else moved [ y ] [ x ] = true ;
      if ( m > k ) continue ;
      if ( y == 0 || y == h - 1 || x == 0 || x == w - 1 ) {
        System . out . println ( 1 ) ;
        exit ( ) ;
      }
      minDer = Math . min ( minDer , y , h - 1 - y , x , w - 1 - x ) ;
      for ( int dy = ( 1 , 0 ) ;
      dy <= m ;
      dy ++ , dx ++ ) if ( 0 <= y + dy && y + dy < h && 0 <= x + dx && a [ y + dy ] [ x + dx ] == '.' && ! moved [ y + dy ] [ x + dx ] ) dq . add ( new Integer [ ] {
        m + 1 , y + dy , x + dx }
        ) ;
      }
      System . out . println ( 1 + ( minDer + k - 1 ) / k ) ;
      return moved ;
    }
    