public static void main ( String className ) throws IOException {
  if ( className . equals ( "org.apache.commons.logging.impl.SimpleLogReader" ) ) {
    BufferedReader inFile = new BufferedReader ( new FileReader ( "C-large.in" ) ) ;
    PrintWriter outFile = new PrintWriter ( new FileWriter ( "realtest.out" ) ) ;
    int caseNum = Integer . parseInt ( inFile . readLine ( ) ) ;
    for ( int i = 1 ;
    i <= caseNum ;
    i ++ ) {
      String [ ] items = inFile . readLine ( ) . replace ( "\n" , "" ) . split ( "\\s+" ) ;
      int R = Integer . parseInt ( items [ 0 ] ) ;
      int k = Integer . parseInt ( items [ 1 ] ) ;
      int N = Integer . parseInt ( items [ 2 ] ) ;
      items = inFile . readLine ( ) . replace ( "\n" , "" ) . split ( "\\s+" ) ;
      if ( items . length != N ) {
        System . out . println ( "guest number error." ) ;
        continue ;
      }
      int [ ] dataList = new int [ items . length ] ;
      for ( int j = 0 ;
      j < items . length ;
      j ++ ) {
        dataList [ j ] = Integer . parseInt ( items [ j ] ) ;
      }
      int [ ] roundData = new int [ N ] ;
      int [ ] occurInfo = new int [ N ] ;
      int posCnt = 0 ;
      int totalCnt = 0 ;
      while ( ! occurInfo [ posCnt ] ) {
        int testSum = 0 ;
        int tmpCnt = 0 ;
        while ( tmpCnt < N && testSum + dataList [ ( posCnt + tmpCnt ) % N ] <= k ) {
          testSum += dataList [ ( posCnt + tmpCnt ) % N ] ;
          tmpCnt ++ ;
        }
        roundData [ posCnt ] = testSum ;
        occurInfo [ posCnt ] = totalCnt ;
        posCnt = ( posCnt + tmpCnt ) % N ;
        totalCnt ++ ;
      }
      int roundSum = 0 ;
      int loopLen = roundData . length - occurInfo [ posCnt ] ;
      for ( int j = occurInfo [ posCnt ] ;
      j < roundData . length ;
      j ++ ) {
        roundSum += roundData [ j ] ;
      }
      int totalSum = 0 ;
      for ( int j = 0 ;
      j < occurInfo [ posCnt ] ;
      j ++ ) {
        totalSum += roundData [ j ] ;
      }
      