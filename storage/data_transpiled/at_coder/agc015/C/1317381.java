static final int [ ] [ ] getVertices ( int Y , int X , int Q ) {
  int [ ] [ ] a = new int [ Y + 1 ] [ X + 1 ] ;
  for ( int i = 0 ;
  i < Y ;
  i ++ ) {
    a [ 1 + i ] [ 1 ] = Collections . singletonList ( Collections . singletonList ( Collections . singletonList ( Collections . singletonList ( Collections . singletonList ( Collections . singletonList ( Collections . singletonList ( Collections . singletonList ( Collections . singletonList ( Collections . singletonList ( Collections . singletonList ( Collections . singletonList ( Collections . singletonList ( Collections . singletonList ( Collections . singletonList ( Collections . singletonList ( Collections . singletonList ( "" ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ;
  }
  int [ ] vCum = new int [ Y + 1 ] ;
  for ( int i = 0 ;
  i < Y ;
  i ++ ) {
    a [ i ] = a [ i ] [ 0 ] ;
  }
  int [ ] sRowCum = new int [ Y + 1 ] ;
  int [ ] sColCum = new int [ Y + 1 ] ;
  for ( int i = 0 ;
  i < Y ;
  i ++ ) {
    a [ i ] [ 0 ] = a [ i ] [ 0 ] ;
  }
  int [ ] result = new int [ Q ] ;
  for ( int q = 0 ;
  q < Q ;
  q ++ ) {
    int y1 = Integer . parseInt ( input ( ) ) ;
    int x1 = Integer . parseInt ( input ( ) ) ;
    int y2 = Integer . parseInt ( input ( ) ) ;
    int x2 = Integer . parseInt ( input ( ) ) ;
    int vertices = vCum [ y2 ] [ x2 ] - vCum [ y2 ] [ x1 - 1 ] - vCum [ y1 - 1 ] [ x2 ] + vCum [ y1 - 1 ] [ x1 - 1 ] ;
    int sidesRow = sRowCum [ y2 ] [ x2 - 1 ] - sRowCum [ y2 ] [ x1 - 1 ] - sRowCum [ y1 - 1 ] [ x2 - 1 ] + sRowCum [ y1 - 1 ] [ x1 - 1 ] ;
    int sidesCol = sColCum [ y2 - 1 ] [ x2 ] - sColCum [ y1 - 1 ] [ x2 - 1 ] - sColCum [ y2 ] [ x1 - 1 ] [ x1 - 1 ] + sColCum [ y1 - 1 ] [ x1 -