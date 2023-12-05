public static String flip ( String row ) {
  return row . replaceAll ( String . valueOf ( "-+" ) , "+-" ) ;
  /* solve the row by k */
  int flips = 0 ;
  for ( int i = 0 ;
  i < row . length ( ) ;
  i ++ ) {
    if ( row . charAt ( i ) == '-' && i + k <= row . length ( ) ) {
      row = row . substring ( 0 , i ) + flip ( row . substring ( i , i + k ) ) + row . substring ( i + k ) ;
      flips ++ ;
    }
  }
  if ( row . contains ( "-" ) ) {
    /* IMPOSSIBLE */
    return "IMPOSSIBLE" ;
  }
  else {
    /* main */
    int t = Integer . parseInt ( input ( ) ) ;
    for ( int ti = 0 ;
    ti < t ;
    ti ++ ) {
      row = input ( ) ;
      k = input ( ) ;
      System . out . println ( "Case #" + ( ti + 1 ) + ": " + solve ( row , ( int ) k ) ) ;
    }
  }
  if ( getClass ( ) . isAnonymousClass ( ) ) {
    /* main */
  }
  return row ;
}
