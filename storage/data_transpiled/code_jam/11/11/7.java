public static int [ ] ints ( ) {
  return ArrayUtil . ints ( new Scanner ( System . in ) . nextLine ( ) . split ( " " ) ) ;
  int numCases = ints ( ) , pg ;
  for ( int caseNum = xrange ( 1 , numCases + 1 ) ;
  caseNum <= numCases ;
  caseNum ++ ) {
    int n = ints ( ) ;
    int pd = ints ( ) ;
    int pg = ints ( ) ;
    boolean poss = n >= 100 || ArrayUtil . find ( new int [ ] {
      pd * d }
      , pd ) != - 1 ;
      if ( pg == 0 || pg == 100 && pg != pd ) poss = false ;
      String res = poss ? "Possible" : "Broken" ;
      System . out . println ( "Case #" + caseNum + ": " + res ) ;
    }
    return new int [ ] {
      numCases }
      ;
    }
    