public static void main ( Scanner in ) {
  int n = in . nextInt ( ) ;
  for ( int v = 0 ;
  v < n ;
  v ++ ) {
    char [ ] [ ] board = new char [ 4 ] [ 4 ] ;
    Arrays . fill ( board , 'A' ) ;
    in . nextLine ( ) ;
    boolean isfull = Arrays . equals ( board [ 0 ] , board [ 1 ] ) ;
    boolean [ ] [ ] lines = new boolean [ 4 ] [ 4 ] ;
    for ( int i = 0 ;
    i < lines . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < lines [ i ] . length ;
      j ++ ) {
        lines [ i ] [ j ] = ( char ) ( i + j ) ;
      }
    }
    lines [ 3 ] = new boolean [ 3 ] [ 4 ] ;
    for ( int i = 0 ;
    i < lines . length ;
    i ++ ) {
      lines [ i ] [ 0 ] = ( char ) ( i + 1 ) ;
      lines [ i ] [ 1 ] = ( char ) ( i + 1 ) ;
    }
    lines [ 4 ] [ 3 ] = ( char ) ( i + 1 ) ;
    boolean owin = false ;
    boolean xwin = false ;
    for ( int i = 0 ;
    i < lines . length ;
    i ++ ) {
      boolean [ ] [ ] l = lines [ i ] ;
      if ( Arrays . equals ( board [ l [ 0 ] [ 0 ] ] , l [ 1 ] ) == 'O' || Arrays . equals ( board [ l [ 1 ] [ 0 ] ] , l [ 2 ] ) == 'T' ) {
        owin = true ;
      }
      if ( Arrays . equals ( board [ l [ 0 ] [ 0 ] ] , l [ 1 ] ) == 'X' || Arrays . equals ( board [ l [ 1 ] [ 0 ] ] , l [ 2 ] ) == 'T' ) {
        xwin = true ;
      }
    }
    if ( owin ) {
      in . nextLine ( ) ;
    }
    else if ( xwin ) {
      in . nextLine ( ) ;
    }
    else if ( isfull ) {
      in . nextLine ( ) ;
    }
    else {
      in . nextLine ( ) ;
    }
  }
}
