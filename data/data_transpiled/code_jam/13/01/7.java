static final Scanner getScanner ( String [ ] args ) throws FileNotFoundException {
  BufferedReader br ;
  PrintWriter o ;
  String line ;
  int t = 0 ;
  br = new BufferedReader ( new FileReader ( args [ 0 ] ) ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    line = br . readLine ( ) ;
    o = new PrintWriter ( line ) ;
  }
  if ( args . length == 2 ) {
    br = new BufferedReader ( new FileReader ( args [ 1 ] ) ) ;
    o = new PrintWriter ( args [ 2 ] ) ;
  }
  /* check line */
  int playerX = 0 ;
  int playerY = 0 ;
  if ( Arrays . binarySearch ( args , "T" ) >= 0 || Arrays . binarySearch ( args , "X" ) >= 0 ) playerX ++ ;
  if ( Arrays . binarySearch ( args , "T" ) >= 0 || Arrays . binarySearch ( args , "O" ) >= 0 ) playerY ++ ;
  /* do tic tacto */
  int playerX = 0 ;
  int playerY = 0 ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    final int px = br . readLine ( ) ;
    final int py = br . readLine ( ) ;
    playerX = px + playerX ;
    playerY = py + playerY ;
  }
  for ( int col = 0 ;
  col < 4 ;
  col ++ ) {
    final int [ ] l = new int [ 4 ] ;
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      l [ col ] = br . readLine ( ) ;
    }
    final int px = br . readLine ( ) ;
    final int py = br . readLine ( ) ;
    playerX = px + playerX ;
    playerY = py + playerY ;
  }
  final int [ ] l = new int [ 4 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    l [ 3 - i ] = br . readLine ( ) ;
  }
  final int px = br . readLine ( ) ;
  final int py = br . readLine ( ) ;
  playerX = px + playerX ;
  playerY = py + playerY ;
  final boolean gridFull = ! StringUtils . isEmpty ( l ) ;
  if ( playerX == 0 && playerY == 0 ) {
    if ( gridFull ) {
      System . out . println ( "Case #" + caseId + ": Draw" ) ;
    }
    else {
      System . out . println ( "Case #" +