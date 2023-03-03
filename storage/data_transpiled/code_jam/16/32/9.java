public static void readFile ( File f ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( f ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
  for ( int k = 0 ;
  k < T ;
  k ++ ) {
    String [ ] testCase = br . readLine ( ) . split ( " " ) ;
    int B = Integer . parseInt ( testCase [ 0 ] ) ;
    int M = Integer . parseInt ( testCase [ 1 ] ) ;
    if ( ( M > ( 2 * ( B - 2 ) ) ) && ( M > 0 ) ) {
      System . out . println ( "Case #" + ( k + 1 ) + ": IMPOSSIBLE" ) ;
      continue ;
    }
    System . out . println ( "Case #" + ( k + 1 ) + ": POSSIBLE" ) ;
    String [ ] [ ] matrix = new String [ B ] [ 2 ] ;
    for ( int i = 0 ;
    i < B ;
    i ++ ) {
      String [ ] oneLine = new String [ B ] ;
      for ( int j = 0 ;
      j < B ;
      j ++ ) oneLine [ j ] = "0" ;
      matrix [ i ] = oneLine ;
    }
    if ( ( M > 0 ) && ( M > 0 ) ) {
      M -- ;
      matrix [ 0 ] [ B - 1 ] = "1" ;
    }
    int totalPossible = 1 ;
    int lastIdx = 1 ;
    for ( int i = 0 ;
    i < B - 2 ;
    i ++ ) {
      int currentIdx = B - i - 2 ;
      if ( ( M == 0 ) && ( lastIdx == 0 ) ) {
        lastIdx = currentIdx + 1 ;
        break ;
      }
      if ( ( M >= totalPossible ) && ( M > 0 ) ) {
        M -= totalPossible ;
        totalPossible *= 2 ;
        int otherIdx = currentIdx ;
        while ( ( otherIdx < B - 1 ) && ( otherIdx != 0 ) ) {
          otherIdx ++ ;
          matrix [ currentIdx ] [ otherIdx ] = "1" ;
        }
      }
      else {
        int otherIdx = currentIdx ;
        while ( ( otherIdx < B - 1 ) && ( otherIdx != 0 ) ) {
          otherIdx ++ ;
          totalPossible /= 2 ;
          if ( ( totalPossible == 0 ) && ( M > 0 ) ) totalPossible = 1 ;
          if ( ( M >= totalPossible ) && ( M > 0 ) ) M -= totalPossible ;
          matrix [ currentIdx ] [ otherIdx ] = "1"