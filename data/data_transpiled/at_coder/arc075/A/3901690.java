static final int [ ] getDigits ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] scores = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  final int perfect = Arrays . stream ( scores ) . mapToInt ( Integer :: intValue ) . sum ( ) ;
  final int [ ] dp = new int [ perfect ] ;
  Arrays . fill ( dp , 1 ) ;
  for ( int s : scores ) {
    for ( int i = perfect - s ;
    i >= 0 ;
    i -- ) {
      dp [ i + s ] |= dp [ i ] ;
    }
  }
  for ( int s = perfect ;
  s > 0 ;
  s -- ) {
    if ( dp [ s ] > 0 && s % 10 != 0 ) {
      System . out . println ( s ) ;
      break ;
    }
  }
  else {
    System . out . println ( 0 ) ;
  }
  return dp ;
}
