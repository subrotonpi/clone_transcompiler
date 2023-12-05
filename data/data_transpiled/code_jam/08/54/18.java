static int waysToReachExit ( int r , int c ) throws IOException {
  if ( c == W && r == H ) return 1 ;
  if ( c > W || r > H ) return 0 ;
  boolean isRock = false ;
  for ( int i = 0 ;
  i < rocks . length ;
  i ++ ) {
    if ( rocks [ i ] [ 0 ] == r && rocks [ i ] [ 1 ] == c ) isRock = true ;
  }
  if ( isRock == true ) return 0 ;
  if ( squareData . containsKey ( new Integer ( r ) ) ) {
    int result = squareData . get ( new Integer ( r ) ) ;
    return result ;
  }
  else {
    int result = waysToReachExit ( r + 1 , c + 2 ) + waysToReachExit ( r + 2 , c + 1 ) ;
    squareData . put ( new Integer ( r ) , result ) ;
    return result ;
  }
  BufferedReader in = new BufferedReader ( new FileReader ( "D-small-attempt0.in" ) ) ;
  PrintWriter out = new PrintWriter ( new FileWriter ( "D-small-out.out" ) ) ;
  int cases = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int caseNum = 1 ;
  caseNum <= cases ;
  caseNum ++ ) {
    String params = in . readLine ( ) . toString ( ) ;
    StringTokenizer st = new StringTokenizer ( params ) ;
    int len = Integer . parseInt ( st . nextToken ( ) ) ;
    int H = len . intValue ( ) ;
    int W = len . intValue ( ) ;
    int R = len . intValue ( ) ;
    rocks = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      String rock = in . readLine ( ) . toString ( ) ;
      st = new StringTokenizer ( rock ) ;
      len = Integer . parseInt ( st . nextToken ( ) ) ;
      rocks . add ( rock ) ;
    }
    squareData . clear ( ) ;
    int answer = waysToReachExit ( 1 , 1 ) ;
    answer = answer % 10007 ;
    String outString = "Case #" + caseNum + ": " + answer + "\n" ;
    System . out . println ( outString . toString ( ) ) ;
    out . println ( outString ) ;
  }
  in . close ( ) ;
  out . close ( ) ;
  return 0 ;
}
