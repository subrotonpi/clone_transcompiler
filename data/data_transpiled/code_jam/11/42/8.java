@ GwtIncompatible ( "java.util.Scanner" ) private static int [ ] [ ] readN ( String a ) throws Exception {
  /* read from a string */
  int n = Integer . parseInt ( a . substring ( 0 , 1 ) ) ;
  /* solve the first two strings */
  String str = System . getProperty ( "line.separator" ) ;
  /* read the first two strings */
  int foo = readN ( str ) ;
  /* read the second two strings */
  int R = Integer . parseInt ( str ) ;
  int C = Integer . parseInt ( str ) ;
  int D = Integer . parseInt ( str ) ;
  int [ ] [ ] data = new int [ R ] [ C + 1 ] ;
  for ( int r = 0 ;
  r < R ;
  r ++ ) {
    data [ r ] = new int [ D ] ;
    data [ r ] [ 0 ] = 0 ;
    for ( int i = 0 ;
    i < D ;
    i ++ ) {
      data [ r ] [ 0 ] = Integer . parseInt ( str . substring ( i , i + 1 ) ) ;
    }
  }
  R ++ ;
  C ++ ;
  int dk = Array . getLength ( data ) ;
  int mi = mgrid [ 0 ] ;
  int mj = mgrid [ 0 ] ;
  int di = dk * mi ;
  int dj = dk * mj ;
  int si = cumsum ( cumsum ( di , dk ) , 0 ) ;
  int sj = cumsum ( cumsum ( dj , dk ) , 0 ) ;
  int sk = cumsum ( cumsum ( dk , dk ) , 0 ) ;
  int ret = 0 ;
  for ( int i = xrange ( 1 , R ) ;
  i < D ;
  i ++ ) {
    for ( int j = xrange ( 1 , C ) ;
    j < D ;
    j ++ ) {
      for ( int s = xrange ( 3 , Math . min ( R - i , C - j ) + 1 ) ;
      s ++ ) {
        int ii = i + s - 1 ;
        int jj = j + s - 1 ;
        /* print the result */
        int [ ] [ ] result = new int [ ] [ ] {
          ii , jj , s }
          ;
          /* print the result */
          ret = result [ s ] [ 0 ] ;
        }
      }
    }
    /* return the first two strings */
    return ret ;
  }
  