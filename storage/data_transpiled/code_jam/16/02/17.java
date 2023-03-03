@ VisibleForTesting static int solve ( String S ) throws IOException {
  S = S + '+' ;
  return Collections . frequency ( S , "" ) - 1 ;
}
fo = new FileWriter ( "out.txt" ) ;
Scanner fi = new Scanner ( System . in ) ;
try {
  rr = new Scanner ( fi ) ;
}
catch ( NoSuchElementException e ) {
  throw new IOException ( e ) ;
}
IntFunction < Integer > rrI = new IntFunction < Integer > ( ) {
  @ Override public Integer apply ( Integer input ) {
    return Integer . parseInt ( input ) ;
  }
}
;
IntFunction < Integer > rrM = new IntFunction < Integer > ( ) {
  @ Override public Integer apply ( Integer input ) {
    return Integer . parseInt ( input ) ;
  }
}
;
for ( int tc : xrange ( rrI . apply ( rrM ) ) ) {
  S = rr . next ( ) ;
  int zetaans = solve ( S ) ;
  String zeta = "Case #" + ( tc + 1 ) + zetaans ;
  System . out . println ( zeta ) ;
}
return zetaans ;
}
