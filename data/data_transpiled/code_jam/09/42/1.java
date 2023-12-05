public static String solve ( int row , int x ) throws IOException {
  int rows , cols ;
  int height_ = 0 ;
  int y = row + 1 ;
  while ( y < rows && M [ y ] [ x ] == '.' ) {
    height_ ++ ;
    y ++ ;
  }
  /* solve */
  File file = new File ( "input.in" ) ;
  int tests = Integer . parseInt ( file . readLine ( ) ) ;
  for ( int i = 1 ;
  i < tests ;
  i ++ ) {
    rows = Integer . parseInt ( file . readLine ( ) ) ;
    cols = Integer . parseInt ( file . readLine ( ) ) ;
    F = Integer . parseInt ( file . readLine ( ) ) ;
    M = new String [ rows ] [ cols ] ;
    for ( int j = 0 ;
    j < rows ;
    j ++ ) M [ i ] = new String ( file . readLine ( ) . trim ( ) ) ;
    System . out . println ( "Case #" + i + ": " + solve ( j ) + " " + sep ) ;
  }
  /* solve */
  if ( __name__ == "__main__" ) {
    main ( ) ;
  }
  else {
    int leftWall = x ;
    while ( leftWall > 0 && M [ level ] [ leftWall - 1 ] == '.' ) leftWall -- ;
    int rightWall = x ;
    while ( rightWall < cols - 1 && M [ level ] [ rightWall + 1 ] == '.' ) rightWall ++ ;
    int leftBase = x ;
    while ( leftBase > 0 && M [ level + 1 ] [ leftBase - 1 ] == '#' ) leftBase -- ;
    int rightBase = x ;
    while ( rightBase < cols - 1 && M [ level + 1 ] [ rightBase + 1 ] == '#' ) rightBase ++ ;
    int left = Math . max ( leftWall , leftBase ) ;
    int right = Math . min ( rightWall , rightBase ) ;
    if ( left > 0 && M [ level ] [ left - 1 ] == '.' ) {
      int h = height ( level , left - 1 ) ;
      if ( h <= F ) search ( level + h , left - 1 ) ;
    }
    if ( right < cols - 1 && M [ level ] [ right + 1 ] == '.' ) {
      int h = height ( level , right + 1 ) ;
      if ( h <= F ) search ( level + h , right +