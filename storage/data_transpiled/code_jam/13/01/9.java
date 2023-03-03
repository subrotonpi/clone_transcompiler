public static String checkSeq ( String seq ) {
  if ( seq . replace ( 'T' , 'X' ) . equals ( "XXXX" ) ) return "X won" ;
  if ( seq . replace ( 'T' , 'O' ) . equals ( "OOOO" ) ) return "O won" ;
  /* Check game */
  String xWin = "XXXX" ;
  String oWin = "OOOO" ;
  for ( int r = 0 ;
  r < 4 ;
  r ++ ) {
    String res = checkSeq ( seq . substring ( 4 * r , 4 * r + 4 ) ) ;
    if ( res != null ) return res ;
  }
  for ( int c = 0 ;
  c < 4 ;
  c ++ ) {
    String res = checkSeq ( seq . substring ( c , 0 , 5 ) ) ;
    if ( res != null ) return res ;
  }
  String res = checkSeq ( seq . substring ( 3 , 13 ) ) ;
  if ( res != null ) return res ;
  if ( seq . contains ( "." ) ) return "Game has not completed" ;
  /* Draw */
  int casesCount = Integer . parseInt ( readLine ( ) ) ;
  for ( int i = 0 ;
  i < casesCount ;
  i ++ ) {
    String game = StringUtils . nextLine ( ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + checkGame ( game ) ) ;
  }
  return "Game has completed" ;
}
