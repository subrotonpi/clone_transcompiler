static String [ ] [ ] board2str ( int [ ] [ ] brd ) throws IOException {
  final String a ;
  int x ;
  int y ;
  int C ;
  int M ;
  String [ ] [ ] tmp ;
  int i ;
  int ii ;
  int x ;
  int jj ;
  if ( brd . length == 0 ) {
    a = "Impossible" ;
    return a ;
  }
  a = new String [ brd . length ] [ ] ;
  for ( ii = 0 ;
  ii < brd . length ;
  ++ ii ) {
    for ( jj = 0 ;
    jj < brd [ ii ] . length ;
    ++ jj ) {
      tmp = new String [ brd [ ii ] [ jj ] . length ] ;
      tmp = convertnums ( tmp ) ;
      R = tmp [ 0 ] ;
      C = tmp [ 1 ] ;
      M = tmp [ 2 ] ;
      brd = findsol ( R , C , M ) ;
      a = board2str ( brd ) ;
      fido . println ( "Case #" + Integer . toString ( ii ) + ":\n" + a + "\n" ) ;
      n = 0 ;
      x = R - 1 ;
      y = C - 1 ;
      z = 1 ;
      while ( ( n < M ) && ( n < C ) ) {
        brd [ ii ] [ jj ] = 0 ;
      }
    }
    else {
      for ( ii = 0 ;
      ii < nc ;
      ++ ii ) {
        for ( jj = 0 ;
        jj < nr ;
        ++ jj ) brd [ ii ] [ jj ] = 0 ;
      }
    }
    brd [ 0 ] [ 0 ] = - 1 ;
    return brd ;
  }
  /* find sol */
  int N = R * C - M ;
  brd = new int [ N ] [ ] ;
  for ( ii = 0 ;
  ii < R ;
  ++ ii ) {
    brd [ ii ] = new int [ N ] ;
    for ( jj = 0 ;
    jj < C ;
    ++ jj ) brd [ ii ] [ jj ] = 1 ;
  }
  brd [ 0 ] [ 0 ] = - 1 ;
  if ( ( N == 1 ) && ( y > 1 ) ) {
    return brd ;
  }
  if ( ( M == 0 ) && ( y <= C ) ) {
    clearrect ( brd , x , y , R , C ) ;
    return brd ;
  }
  if ( ( R == 1 ) || ( C == 1 ) ) {
    clearrect ( brd , x , y , R , C ) ;
    return br @ @