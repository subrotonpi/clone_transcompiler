public static String [ ] numToProposition ( int num , int K , int C ) throws IOException {
  String [ ] ans = new String [ C ] ;
  for ( int i = 0 ;
  i < xrange ( C ) ;
  i ++ ) {
    ans [ i ] = num % K ;
    num /= K ;
  }
  return ans ;
  /* Find the number of numbers in the range [K] */
  int num = 0 ;
  for ( int ix = 0 ;
  ix < A . length ;
  ix ++ ) {
    num += ( K * ix ) * A [ ix ] ;
  }
  /* Solve the range [K] */
  if ( S * C < K ) return "IMPOSSIBLE" ;
  Set < Integer > toSee = new HashSet < Integer > ( ) ;
  for ( int ix = 0 ;
  ix < K ;
  ix ++ ) {
    toSee . add ( i ) ;
  }
  String [ ] ans = new String [ C ] ;
  while ( toSee . size ( ) > 0 ) {
    int ct = 0 ;
    StringBuilder buf = new StringBuilder ( ) ;
    while ( toSee . size ( ) > 0 && ct < C ) {
      ct ++ ;
      buf . append ( toSee . remove ( toSee . size ( ) - 1 ) ) ;
    }
    while ( buf . length ( ) < C ) buf . append ( 0 ) ;
    num = posToNum ( buf . toString ( ) , K ) + 1 ;
    ans [ ct ] = num ;
  }
  FileWriter fo = new FileWriter ( "out.txt" ) ;
  Scanner fi = new Scanner ( new InputStreamReader ( System . in ) ) ;
  Function < Integer , Integer > rr = new Function < Integer , Integer > ( ) {
    @ Override public Integer apply ( Integer input ) {
      return input . toString ( ) ;
    }
  }
  ;
  Function < Integer , Integer > rrI = new Function < Integer , Integer > ( ) {
    @ Override public Integer apply ( Integer input ) {
      return Integer . parseInt ( rr . next ( ) ) ;
    }
  }
  ;
  Function < Integer , Integer > rrM = new Function < Integer , Integer > ( ) {
    @ Override public Integer apply ( Integer input ) {
      return Integer . parseInt ( rr . next ( ) ) ;
    }
  }
  ;
  for ( int tc : xrange ( rrI . apply ( rrM ) ) ) {
    K = rrM . apply ( tc ) ;
    int zetaans = solve ( K , C , S ) ;
    String