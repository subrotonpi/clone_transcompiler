public static String cPuzzle ( int [ ] [ ] Board ) {
  int boardSize = 8 ;
  /* 0 < boardSize */
  int row = Board [ 0 ] [ 0 ] . length ;
  int col = Board [ 0 ] . length ;
  /* 1 < boardSize */
  int boardWidth = Board [ 0 ] [ 1 ] . length ;
  int boardHeight = Board [ 0 ] [ 1 ] . length ;
  /* 2 < boardSize */
  if ( row >= boardSize ) {
    return true ;
  }
  char previousState = board [ row ] [ col ] ;
  board [ row ] [ col ] = 'Q' ;
  boolean isRejected = false ;
  for ( int k = 0 ;
  k < boardSize ;
  k ++ ) {
    isRejected |= ( row == k ) && ( row == col ) && ( board [ row ] [ k ] . length ( ) == 1 ) ;
    isRejected |= ( k == col ) && ( board [ row ] [ col ] . length ( ) == 1 ) ;
    isRejected |= ( ( row - k ) != ( col - k ) ) && ( isInside ( row - k , col - k , boardSize , boardSize ) && board [ row - k ] [ col - k ] . length ( ) == 1 ) ;
    isRejected |= ( ( row + k ) != ( col + k ) ) && ( isInside ( row + k , col + k , boardSize , boardSize ) && board [ row + k ] [ col + k ] . length ( ) == 1 ) ;
    isRejected |= ( ( row + k ) != ( col - k ) ) && ( isInside ( row + k , col - k , boardSize , boardSize ) && board [ row + k ] [ col - k ] . length ( ) == 1 ) ;
    isRejected |= ( ( row - k ) != ( col + k ) ) && ( isInside ( row + k , col + k , boardSize , boardSize ) && board [ row + k ] [ col + k ] . length ( ) == 1 ) ;
  }
  if ( isRejected ) {
    board [ row ] [ col ] = previousState ;
    return false ;
  }
  for ( int k = 0 ;
  k < boardSize ;
  k ++ ) {
    if ( canPlaceQueen ( row + 1 , k , Board ) ) {
      return "\n" + String . join ( "" , Board ) ;
    }
  }
  return "