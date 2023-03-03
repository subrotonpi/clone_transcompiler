static final long solve ( ) throws IOException {
  engines = new HashMap < > ( ) ;
  queries = new int [ 256 ] ;
  {
    int i ;
    int n ;
    long psTime ;
    for ( i = 0 ;
    i < queries . length ;
    i ++ ) {
      q = queries [ i ] ;
      for ( i = 0 ;
      i < engines . length ;
      i ++ ) {
        k = engines [ i ] . keys ( ) [ i ] ;
        if ( k == q ) {
          engines [ i ] . add ( 0 ) ;
        }
        else {
          engines [ i ] . add ( engines [ i ] . get ( engines [ i ] . size ( ) - 1 ) + 1 ) ;
        }
      }
    }
    String curKey = "" ;
    int changeNum = 0 ;
    for ( n = queries . length ;
    n > 0 ;
    n -- ) {
      int maxVal = 0 ;
      for ( i = 0 ;
      i < engines . length ;
      i ++ ) {
        if ( engines [ i ] . get ( n ) > maxVal ) {
          maxVal = engines [ i ] . get ( n ) ;
          maxKey = k ;
        }
      }
      if ( curKey . length ( ) != 0 ) {
        if ( engines [ curKey . charAt ( n ) ] == 0 ) {
          ++ changeNum ;
          curKey = maxKey ;
        }
      }
      else {
        curKey = maxKey ;
      }
    }
    System . out . println ( engines ) ;
    return changeNum ;
  }
  long psTime = System . currentTimeMillis ( ) ;
  String filename = "A-large" ;
  BufferedReader in = new BufferedReader ( new FileReader ( "./" + filename + ".in" ) ) ;
  PrintWriter out = new PrintWriter ( new BufferedWriter ( new FileWriter ( "./" + filename + ".out" ) ) ) ;
  int caseNum = 0 ;
  int mode = 0 ;
  int engineCount = 0 ;
  int queryCount = 0 ;
  caseNum = 0 ;
  String line ;
  while ( ( line = in . readLine ( ) ) != null ) {
    switch ( mode ) {
      case 0 : totalNum = Integer . parseInt ( line ) ;
      System . out . println ( "total : " + totalNum ) ;
      mode = 1 ;
      break ;
      case 1 : caseNum ++ ;
      System . out . println ( "case:" + caseNum ) ;
      engines . clear ( ) ;
      engineCount = Integer . parseInt ( line ) ;
      mode = 2 ;
      break ;
      case 2 : engines . put ( line , new int [ ] {
        0 }
        )