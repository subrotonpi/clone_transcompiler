public static int order ( ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] orderList = order . split ( " " ) ;
  int count = 0 ;
  int [ ] position = new int [ 2 ] ;
  for ( int i = 0 ;
  i < orderList . length ;
  i ++ ) {
    String n = orderList [ i ] ;
    if ( n . equals ( "L" ) ) {
      position [ 0 ] -- ;
    }
    else if ( n . equals ( "R" ) ) {
      position [ 0 ] ++ ;
    }
    else if ( n . equals ( "U" ) ) {
      position [ 1 ] ++ ;
    }
    else if ( n . equals ( "D" ) ) {
      position [ 1 ] -- ;
    }
    else if ( n . equals ( "?" ) ) {
      count ++ ;
    }
  }
  if ( T == 1 ) {
    System . out . println ( Math . abs ( position [ 0 ] ) + Math . abs ( position [ 1 ] ) + count ) ;
  }
  else if ( T == 2 ) {
    if ( Math . abs ( position [ 0 ] ) + Math . abs ( position [ 1 ] ) >= count ) {
      System . out . println ( Math . abs ( position [ 0 ] ) + Math . abs ( position [ 1 ] ) - count ) ;
    }
    else {
      if ( ( Math . abs ( position [ 0 ] ) + Math . abs ( position [ 1 ] ) - count ) % 2 == 0 ) {
        System . out . println ( 0 ) ;
      }
      else {
        System . out . println ( 1 ) ;
      }
    }
  }
  return count ;
}
