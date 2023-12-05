public static void solve ( List < Integer > list ) throws IOException {
  HashMap < Integer , Integer > memo = new HashMap < Integer , Integer > ( ) ;
  {
    int lo = 0 ;
    int hi = list . size ( ) ;
    int result ;
    if ( ( lo == 0 ) && ( hi == 0 ) ) {
      result = memo . get ( lo ) ;
    }
    else {
      int best = 0 ;
      if ( hi == list . size ( ) ) {
        int o1 = opt ( lo + 1 , hi ) ;
        if ( o1 != 0 ) {
          best = Math . max ( best , o1 ) ;
        }
      }
      for ( int i : xrange ( lo + 1 , hi ) ) {
        int o1 = opt ( lo + 1 , i ) ;
        int o2 = opt ( i + 1 , hi ) ;
        if ( o1 != 0 && o2 != 0 ) {
          best = Math . max ( best , o1 + ( list . get ( lo ) == list . get ( i ) ? 10 : 5 ) + o2 ) ;
        }
      }
      result = best ;
    }
    memo . put ( lo , result ) ;
  }
  if ( Class . isClassPresent ( Test . class ) ) {
    final BufferedReader is = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    /* try {
    is.readLine();
    } catch (IOException e) {
    System.out.println(e);
    }*/
    int numCases = Integer . parseInt ( is . readLine ( ) ) ;
    for ( int i : xrange ( numCases ) ) {
      List < Integer > list = list . get ( i ) ;
      System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( list ) ) ;
    }
  }
}
