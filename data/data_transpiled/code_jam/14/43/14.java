static int solve ( int w , int h , int b , int [ ] [ ] coordinates ) {
  final boolean [ ] [ ] river = new boolean [ w ] [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < coordinates . length ;
    j ++ ) {
      int x0 = coordinates [ i ] [ j ] ;
      int y0 = coordinates [ i ] [ j ] ;
      int x1 = coordinates [ i ] [ j ] ;
      int y1 = coordinates [ i ] [ j ] ;
      for ( int x = x0 ;
      x <= x1 ;
      x ++ ) {
        for ( int y = y0 ;
        y <= y1 ;
        y ++ ) {
          river [ y ] [ x ] = true ;
        }
      }
    }
  }
  int flow = 0 ;
  final int [ ] dirs = {
    {
      ( 1 , 0 ) , ( 0 , 1 ) , ( - 1 , 0 ) , ( 0 , - 1 ) }
    }
    ;
    for ( int xs = 0 ;
    xs < w ;
    xs ++ ) {
      final int [ ] ways = new int [ 4 ] ;
      ways [ 0 ] = ways [ 0 ] = new int [ w ] ;
      ways [ 1 ] = new int [ w ] ;
      ways [ 2 ] = new int [ h ] ;
      ways [ 3 ] = new int [ h ] ;
      ways [ 4 ] = new int [ h ] ;
      ways [ 5 ] = new int [ h ] ;
      ways [ 6 ] = new int [ h ] ;
      ways [ 7 ] = new int [ h ] ;
      ways [ 8 ] = new int [ h ] ;
      ways [ 9 ] = new int [ h ] ;
      ways [ 10 ] = new int [ h ] ;
      ways [ 11 ] = new int [ h ] ;
      ways [ 12 ] = new int [ h ] ;
      ways [ 13 ] = new int [ h ] ;
      ways [ 14 ] = new int [ h ] ;
      ways [ 15 ] = new int [ h ] ;
      ways [ 16 ] = new int [ h ] ;
      ways [ 12 ] = new int [ h ] ;
      ways [ 13 ] = new int [ h ] ;
      ways [ 14 ] = new int [ h ] ;
      ways [ 15 ] = new int [ h ] ;
      ways [ 16 ] = new int [ h ] ;
      ways [ 17 ] = new int [ h ] ;
      ways [ 18 ] = new int [ h ] ;
      ways [ 19 ] = new int [ h ] ;
      ways [ 23 ]