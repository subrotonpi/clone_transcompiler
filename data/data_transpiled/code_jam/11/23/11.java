public static void readFile ( File file ) throws IOException {
  BufferedReader reader = new BufferedReader ( new FileReader ( file ) ) ;
  String strWholeFile = reader . readLine ( ) ;
  String [ ] aStrLines = strWholeFile . split ( "\n" ) ;
  int nCases = Integer . parseInt ( aStrLines [ 0 ] ) ;
  String [ ] aStrLinesLeft = aStrLines . substring ( 1 ) . split ( " " ) ;
  for ( int nCase = 1 ;
  nCase <= nCases ;
  ++ nCase ) {
    String [ ] aStrLinesCur = aStrLinesLeft [ 0 ] . split ( " " ) ;
    Set < Integer > colorsInFace = new HashSet < Integer > ( ) ;
    for ( int i = 1 ;
    i <= nColors ;
    ++ i ) {
      int ptsUncolored = Integer . parseInt ( aStrLinesCur [ i ] ) ;
      if ( ptsUncolored != - 1 ) {
        int slackLeast = slack ;
        int ptsUncolored = Integer . parseInt ( aStrLinesLeft [ i ] ) ;
        int iSlackLeast = aryFace . indexOf ( face ) ;
      }
      String [ ] face = aryFace . toArray ( ) ;
      Set < Integer > ptsUncolored = new HashSet < Integer > ( ) ;
      for ( int i = 0 ;
      i <= nColors ;
      ++ i ) {
        int ptsUncolored = Integer . parseInt ( aStrLinesCur [ i ] ) ;
        if ( ptsUncolored != - 1 && ptsUncolored < slackLeast ) {
          int slackLeast = slackLeast ;
          int iSlackLeast = ptsUncolored . length ;
          int iSlackLeast = aryFace . indexOf ( face ) ;
          int [ ] aryFace = new int [ 3 ] ;
          aryFace [ i ] = new int [ 3 ] ;
          aryFace [ i ] [ 0 ] = 1 ;
          aryFace [ i ] [ 1 ] = 1 ;
          aryFace [ i ] [ 2 ] = 1 ;
          aryFace [ i ] [ 3 ] = 1 ;
        }
        System . out . println ( "Case #" + nCase + ": " + nSlackLeast ) ;
        String strRes = "" ;
        for ( int i = 0 ;
        i <= nColors ;
        ++ i ) {
          int ptsUncolored = Integer . parseInt ( aStrLinesLeft [ i ] ) ;
          if ( ptsUncolored != - 1 ) {
            strRes = strRes + " " ;
          }
        }
        System .