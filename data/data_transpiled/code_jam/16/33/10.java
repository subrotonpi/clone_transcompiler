public static void readFile ( File f ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( f ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    String [ ] testCase = br . readLine ( ) . split ( " " ) ;
    int J = Integer . parseInt ( testCase [ 0 ] ) ;
    int P = Integer . parseInt ( testCase [ 1 ] ) ;
    int S = Integer . parseInt ( testCase [ 2 ] ) ;
    int K = Integer . parseInt ( testCase [ 3 ] ) ;
    if ( K >= S ) K = S ;
    int total = 0 ;
    List < List < String >> allList = new ArrayList < List < String >> ( ) ;
    for ( int j = 0 ;
    j < J ;
    j ++ ) {
      int startNum = j + 1 + ( K - 1 ) * j ;
      if ( ( startNum ) > S ) startNum = ( ( startNum - 1 ) % S ) + 1 ;
      for ( int p = 0 ;
      p < P ;
      p ++ ) {
        List < String > oneList = new ArrayList < String > ( ) ;
        oneList . add ( String . valueOf ( j + 1 ) ) ;
        oneList . add ( String . valueOf ( p + 1 ) ) ;
        for ( int k = 0 ;
        k < K ;
        k ++ ) {
          List < String > finalList = new LinkedList < String > ( ) ;
          finalList . add ( String . valueOf ( startNum ) ) ;
          allList . add ( finalList ) ;
          total ++ ;
          startNum ++ ;
          if ( ( startNum ) > S ) startNum = 1 ;
        }
      }
    }
  }
  System . out . println ( "Case #" + ( t + 1 ) + ": " + total ) ;
  for ( Iterator < String > i = allList . iterator ( ) ;
  i . hasNext ( ) ;
  ) {
    System . out . println ( i . next ( ) ) ;
  }
}
