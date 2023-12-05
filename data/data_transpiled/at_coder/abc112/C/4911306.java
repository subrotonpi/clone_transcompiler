public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] info = new int [ N ] [ 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    info [ i ] [ 0 ] = 0 ;
    info [ i ] [ 1 ] = 0 ;
    info [ i ] [ 2 ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  Arrays . sort ( info , new Comparator < int [ ] > ( ) {
    @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
      return o2 [ 2 ] - o1 [ 0 ] ;
    }
  }
  ) ;
  for ( int cx = 0 ;
  cx < 101 ;
  cx ++ ) {
    for ( int cy = 0 ;
    cy < 101 ;
    cy ++ ) {
      int cnt = 1 ;
      int H = info [ 0 ] [ 2 ] + Math . abs ( info [ 0 ] [ 0 ] - cx ) + Math . abs ( info [ 0 ] [ 1 ] - cy ) ;
      for ( int n = 1 ;
      n < N ;
      n ++ ) {
        cnt ++ ;
        if ( info [ n ] [ 2 ] != Math . max ( H - Math . abs ( info [ n ] [ 0 ] - cx ) - Math . abs ( info [ n ] [ 1 ] - cy ) , 0 ) ) break ;
        if ( cnt == N ) {
          System . out . println ( cx + " " + cy + " " + H ) ;
          exit ( ) ;
        }
      }
    }
  }
  return 0 ;
}
