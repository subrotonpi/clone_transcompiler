public static final String getSortingString ( ) throws IOException {
  String iFName = "d:\\projekty\\google-jam\unda-1-b\\a\\A-large.in" ;
  String outFN = "d:\\projekty\\google-jam\unda-1-b\\a\\out-large.txt" ;
  boolean verbose = false ;
  BufferedReader iReader = new BufferedReader ( new FileReader ( iFName ) ) ;
  PrintWriter outF = new PrintWriter ( outFN ) ;
  int N = Integer . parseInt ( iReader . readLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( verbose ) {
      System . out . println ( i ) ;
    }
    String S = iReader . readLine ( ) ;
    StringTokenizer st = new StringTokenizer ( S ) ;
    int P = Integer . parseInt ( st . nextToken ( ) ) ;
    int K = Integer . parseInt ( st . nextToken ( ) ) ;
    int L = Integer . parseInt ( st . nextToken ( ) ) ;
    if ( verbose ) {
      System . out . println ( P + " " + K + " " + L ) ;
    }
    S = iReader . readLine ( ) ;
    if ( P * K < L ) {
      totalCnt = - 1 ;
    }
    else {
      st . nextToken ( ) ;
    }
    Collections . sort ( st ) ;
    if ( verbose ) {
      System . out . println ( outF ) ;
    }
    int currCost = 1 ;
    totalCnt = 0 ;
    int keysLeft = K ;
    for ( int s = 0 ;
    s < S . length ( ) ;
    s ++ ) {
      if ( keysLeft == 0 ) {
        currCost = currCost + 1 ;
        keysLeft = K ;
      }
      totalCnt = totalCnt + s * currCost ;
      keysLeft = keysLeft - 1 ;
    }
  }
  if ( totalCnt == - 1 ) {
    System . out . println ( outF ) ;
    outF . println ( "Case #" + ( ++ c ) + ": Impossible" ) ;
  }
  else {
    System . out . println ( outF ) ;
    outF . println ( "Case #" + ( ++ c ) + ": " + ( ++ cnt ) + " " + totalCnt ) ;
  }
  iReader . close ( ) ;
  outF . close ( ) ;
}
