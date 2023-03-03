static final Scanner scanner = new Scanner ( System . in ) {
  @ Override public void close ( ) throws IOException {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    String N = br . readLine ( ) ;
    for ( int caseIterator = 0 ;
    caseIterator < Integer . parseInt ( N ) ;
    caseIterator ++ ) {
      String [ ] engineNames = new String [ Integer . parseInt ( S ) ] ;
      String S = br . readLine ( ) ;
      for ( int engineIterator = 0 ;
      engineIterator < S ;
      engineIterator ++ ) {
        engineNames [ engineIterator ] = br . readLine ( ) ;
      }
      String [ ] query = new String [ Integer . parseInt ( S ) ] ;
      String Q = br . readLine ( ) ;
      for ( int queryIterator = 0 ;
      queryIterator < Q ;
      queryIterator ++ ) {
        query [ queryIterator ] = br . readLine ( ) ;
      }
      String currentEngine = null ;
      int currentPosition = 0 ;
      int numOfSwitches = - 1 ;
      while ( currentPosition < query . length ) {
        Map < String , Integer > nextLength = new HashMap < String , Integer > ( ) ;
        for ( String engine : engineNames ) {
          if ( engine != currentEngine ) {
            int position = currentPosition ;
            while ( position < query . length && query [ position ] != engine ) {
              position = position + 1 ;
            }
            nextLength . put ( engine , position - currentPosition ) ;
          }
        }
        int maxLength = 0 ;
        for ( String engine : engineNames ) {
          if ( engine != currentEngine && nextLength . get ( engine ) > maxLength ) {
            maxLength = nextLength . get ( engine ) ;
            switchTo = engine ;
          }
        }
        currentEngine = switchTo ;
        currentPosition = currentPosition + maxLength ;
        numOfSwitches = numOfSwitches + 1 ;
      }
      if ( Integer . parseInt ( Q ) == 0 ) {
        numOfSwitches = 0 ;
      }
      System . out . println ( "Case #" + ( caseIterator + 1 ) + ": " + numOfSwitches ) ;
    }
  }
  ;
  return new Scanner ( new BufferedReader ( new InputStreamReader ( System . in ) ) ) ;
}
