static private String print ( ) {
  final BigDecimal d = new BigDecimal ( "2" ) ;
  DecimalContext . getDecimalContext ( ) . set ( d ) ;
  final BigInteger base = d . multiply ( new BigInteger ( "3" ) ) . add ( d . multiply ( new BigInteger ( "5" ) ) ) . sqrt ( ) ;
  final int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int testCase : xrange ( 1 , n + 1 ) ) {
    final BigInteger p = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final BigInteger x = base . pow ( p ) ;
    String s = "000" + x . toString ( ) ;
    s = s . substring ( 0 , s . indexOf ( '.' ) ) ;
    final String res = s . substring ( s . length ( ) - 3 ) ;
    System . out . println ( "Case #" + testCase + ": " + res ) ;
  }
  return s ;
}
