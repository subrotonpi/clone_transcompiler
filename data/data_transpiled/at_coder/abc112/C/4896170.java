public static boolean valid ( int x , int y ) {
  final PrintStream write = System . out ;
  final int N = info . length ;
  int H = info [ nzPoint ] [ 2 ] + Math . abs ( info [ nzPoint ] [ 0 ] - x ) + Math . abs ( info [ nzPoint ] [ 1 ] - y ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i == nzPoint ) continue ;
    if ( Math . max ( 0 , H - Math . abs ( x - info [ i ] [ 0 ] ) - Math . abs ( y - info [ i ] [ 1 ] ) ) != info [ i ] [ 2 ] ) return false ;
  }
  /* printheight */
  write . println ( String . valueOf ( info [ nzPoint ] [ 2 ] + Math . abs ( i - info [ nzPoint ] [ 0 ] ) + Math . abs ( j - info [ nzPoint ] [ 1 ] ) ) + "\n" ) ;
  N = Integer . parseInt ( input ( ) ) ;
  info = new int [ N ] [ ] ;
  nzPoint = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    info [ i ] = new int [ ] {
      Integer . parseInt ( input ( ) ) }
      ;
      if ( info [ i ] [ 2 ] > 0 ) nzPoint = i ;
    }
    for ( int i = 0 ;
    i < 101 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 101 ;
      j ++ ) {
        if ( valid ( i , j ) ) {
          write . println ( String . valueOf ( i ) + " " + String . valueOf ( j ) + " " ) ;
          printheight ( i , j ) ;
          System . exit ( 0 ) ;
        }
      }
    }
    return true ;
  }
  