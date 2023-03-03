public static int [ ] ints ( ) {
  return ArrayUtil . ints ( new Scanner ( System . in ) . nextLine ( ) ) ;
  int numCases = ints . length ;
  for ( int caseNum = xrange ( 1 , numCases + 1 ) ;
  caseNum <= xrange ( 1 , numCases ) ;
  caseNum ++ ) {
    StringTokenizer line = new StringTokenizer ( System . in ) ;
    HashMap < Integer , Integer > comb = new HashMap < Integer , Integer > ( ) ;
    HashSet < Integer > opp = new HashSet < Integer > ( ) ;
    ArrayList < Integer > L = new ArrayList < Integer > ( ) ;
    int C = Integer . parseInt ( line . nextToken ( ) ) ;
    for ( int i : xrange ( C ) ) {
      String s = line . nextToken ( ) ;
      int x = Integer . parseInt ( s ) ;
      int y = Integer . parseInt ( s ) ;
      int z = Integer . parseInt ( s ) ;
      comb . put ( new Integer ( x ) , z ) ;
      comb . put ( new Integer ( y ) , z ) ;
    }
    int D = Integer . parseInt ( line . nextToken ( ) ) ;
    for ( int i : xrange ( D ) ) {
      String s = line . nextToken ( ) ;
      int x = Integer . parseInt ( s ) ;
      int y = Integer . parseInt ( s ) ;
      opp . add ( new Integer ( x ) ) ;
      opp . add ( new Integer ( y ) ) ;
    }
    int N = Integer . parseInt ( line . nextToken ( ) ) ;
    String S = line . nextToken ( ) ;
    for ( int i = 0 ;
    i < S . length ( ) ;
    i ++ ) {
      if ( L . size ( ) > 0 && comb . containsKey ( new Integer ( S . charAt ( i ) ) ) ) {
        int last = L . remove ( L . size ( ) - 1 ) ;
        L . add ( comb . get ( new Integer ( S . charAt ( i ) ) , last ) ) ;
      }
      else if ( ArrayUtil . contains ( opp , new Integer ( N ) ) ) {
        L . clear ( ) ;
      }
      else {
        L . add ( S . charAt ( i ) ) ;
      }
    }
    System . out . println ( "Case #" + caseNum + ": [" + L . toString ( ) + "]" ) ;
  }
  return new int [ ] {
  }
  ;
}
