static final int [ ] [ ] getVertices ( int Y , int X , int Q ) {
  int [ ] [ ] a = new int [ Y + 1 ] [ X + 1 ] ;
  for ( int i = 0 ;
  i < Y ;
  i ++ ) a [ i ] = new int [ Y ] ;
  for ( int i = 0 ;
  i < X ;
  i ++ ) a [ i ] [ 0 ] = Collections . singletonList ( i ) ;
  MatrixCentroid vCum = new MatrixCentroid ( a ) ;
  MatrixCentroid sRowCum = new MatrixCentroid ( a [ 0 ] [ X ] * a [ 0 ] [ 1 ] , a [ 0 ] [ X ] * a [ 0 ] [ 1 ] ) ;
  MatrixCentroid sColCum = new MatrixCentroid ( a [ 0 ] [ Y ] * a [ 1 ] [ X ] , a [ 0 ] [ X ] * a [ 0 ] [ 1 ] ) ;
  int [ ] [ ] result = new int [ Q ] [ ] ;
  for ( int q = 0 ;
  q < Q ;
  q ++ ) {
    int y1 = Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ;
    int x1 = Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt ( Integer . parseInt (