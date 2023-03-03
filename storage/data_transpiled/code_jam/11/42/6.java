static boolean findsize ( int [ ] [ ] cells , int row , int col , int size ) {
  int centerr = size - 1 ;
  int centerc = size - 1 ;
  int rdiff = 0 ;
  int cdiff = 0 ;
  for ( int r = 0 ;
  r < size ;
  r ++ ) {
    for ( int c = 0 ;
    c < size ;
    c ++ ) {
      if ( ( ( r == 0 && ( c == 0 || c == size - 1 ) ) || ( r == size - 1 && ( c == 0 || c == size - 1 ) ) ) ) {
      }
      else {
        rdiff += cells [ row + r ] [ col + c ] * ( 2 * r - centerr ) ;
        cdiff += cells [ row + r ] [ col + c ] * ( 2 * c - centerc ) ;
      }
    }
  }
  if ( ( rdiff == 0 && cdiff == 0 ) ) {
    return true ;
  }
  else {
    return false ;
  }
  Scanner fin = new Scanner ( new File ( "input.in" ) ) ;
  PrintWriter fout = new PrintWriter ( new File ( "output.out" ) ) ;
  int numcases = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int casenum = 1 ;
  casenum <= numcases ;
  casenum ++ ) {
    int [ ] info = new int [ 2 ] ;
    for ( int i = 0 ;
    i < info . length ;
    i ++ ) {
      info [ i ] = Integer . parseInt ( fin . nextLine ( ) ) ;
    }
    int [ ] [ ] rows = new int [ info [ 0 ] ] [ info . length ] ;
    for ( int i = 0 ;
    i < info . length ;
    i ++ ) {
      String line = fin . nextLine ( ) ;
      rows [ i ] = new int [ info . length ] ;
      for ( int j = 0 ;
      j < info . length ;
      j ++ ) {
        line = fin . nextLine ( ) ;
        rows [ i ] [ j ] = Integer . parseInt ( line . substring ( i , j + 1 ) ) ;
      }
      String solnstr = "IMPOSSIBLE" ;
      boolean solnfd = false ;
      for ( size = Math . min ( ( info [ 0 ] ) , info . length ) ;
      size > 2 ;
      size -- ) {
        for ( int r = 0 ;
        r < info . length + 1 - size ;
        r ++ ) {
          for ( int c = 0 ;
          c < info . length + 1 - size ;
          