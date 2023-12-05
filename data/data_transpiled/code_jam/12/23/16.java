public static final String getSeqNum ( ) throws IOException {
  BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int testCase = 0 ;
  testCase <= T ;
  testCase ++ ) {
    List < Integer > line = Arrays . asList ( Integer . parseInt ( br . readLine ( ) ) ) ;
    final int N = line . get ( 0 ) ;
    final List < Integer > S = line . subList ( 1 , line . size ( ) ) ;
    final Map < Integer , Set < Integer >> state = new HashMap < > ( ) ;
    for ( int given : S ) {
      state . put ( given , new HashSet < > ( Arrays . asList ( given ) ) ) ;
    }
    return null ;
  }
  Job < String , String > job = new Job < String , String > ( job ) {
    @ Override public String [ ] run ( ) {
      for ( int n = 1 ;
      n < N ;
      n ++ ) {
        Set < Map . Entry < Integer , Set < Integer >>> entrySet = state . entrySet ( ) ;
        for ( int i = 0 ;
        i <= entrySet . size ( ) - 1 ;
        i ++ ) {
          for ( int j = i + 1 ;
          j < entrySet . size ( ) ;
          j ++ ) {
            int bagI = entrySet . get ( i ) . getValue ( ) . iterator ( ) . next ( ) . getValue ( ) . add ( i ) ;
            int bagJ = entrySet . get ( j ) . getValue ( ) . iterator ( ) . next ( ) . getValue ( ) . add ( j ) ;
            int bagNew = bagI | bagJ ;
            int sumNew = Integer . valueOf ( bagNew ) ;
            if ( state . containsKey ( sumNew ) ) {
              if ( bagNew != state . get ( sumNew ) ) {
                return new String [ ] {
                  bagNew , state . get ( sumNew ) }
                  ;
                }
                else {
                  state . put ( sumNew , bagNew ) ;
                }
              }
            }
          }
        }
        return null ;
      }
    }
    ;
    String [ ] ret = job . run ( ) ;
    System . out . println ( "Case #" + ( testCase + 1 ) + ":" ) ;
    if ( ret . length == 0 ) {
      System . out . println ( "Impossible" ) ;
    }
    else {
      final String [ ] bagA = ret . split ( "\\s+" ) ;
      final String [ ] bagB = ret . split ( "