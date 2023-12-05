public static int cost ( Set < Integer > en , Set < Integer > fr ) {
  return en . stream ( ) . filter ( o -> o != null ) . count ( ) ;
  /* greedy */
  Set < Integer > allWords = new HashSet < > ( ) ;
  allWords . addAll ( en ) ;
  allWords . addAll ( fr ) ;
  for ( Integer o : other ) {
    allWords . addAll ( o ) ;
  }
  int total = allWords . size ( ) ;
  Set < Integer > gen = new HashSet < > ( en ) ;
  Set < Integer > gfr = new HashSet < > ( fr ) ;
  for ( Integer o : other ) {
    Set < Integer > nen = gen . stream ( ) . filter ( o -> o != null ) . collect ( toSet ( ) ) ;
    Set < Integer > nfr = gfr . stream ( ) . filter ( o -> o != null ) . collect ( toSet ( ) ) ;
    int cen = nen . size ( ) - gen . size ( ) ;
    int cfr = nfr . size ( ) - gfr . size ( ) ;
    if ( cen < cfr ) {
      gen = nen ;
    }
    else {
      gfr = nfr ;
    }
  }
  /* solve */
  if ( other . size ( ) == 0 ) {
    return en . stream ( ) . filter ( o -> o != null ) . count ( ) ;
  }
  if ( best != null && en . stream ( ) . filter ( o -> o != null ) . count ( ) > best ) {
    return best ;
  }
  Set < Integer > subEn = en . stream ( ) . filter ( o -> o != null ) . collect ( toSet ( ) ) ;
  Set < Integer > subFR = fr . stream ( ) . filter ( o -> o != null ) . collect ( toSet ( ) ) ;
  Set < Integer > subOther = other . stream ( ) . filter ( o -> o != null ) . collect ( toSet ( ) ) ;
  int s0 = solve ( subEn , fr , subOther , best ) ;
  int s1 = solve ( en , subFR , subOther , best ) ;
  if ( s0 == 0 || s1 == 0 ) {
    System . out . println ( "??????" ) ;
  }
  return Math . min ( s0 , s1 ) ;
}
