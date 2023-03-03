@ GwtIncompatible ( "java.math.BigInteger" ) public static void roundToBigInteger ( String s ) throws IOException {
  BufferedReader i = new BufferedReader ( new FileReader ( "1c0.in" ) ) ;
  int testCases = Integer . parseInt ( i . readLine ( ) ) ;
  getMathContext ( ) . setRoundingMode ( RoundingMode . HALF_UP ) ;
  BigDecimal d = new BigDecimal ( "3.0" ) . add ( new BigDecimal ( "5.0" ) ) . sqrt ( ) ;
  for ( int t = 1 ;
  t <= testCases ;
  t ++ ) {
    int n = Integer . parseInt ( i . readLine ( ) ) ;
    BigInteger v = BigInteger . ONE ;
    for ( int p = 0 ;
    p < n ;
    p ++ ) v *= d . multiply ( d ) ;
    System . out . printf ( "Case #%d: %03d%n" , t , ( int ) ( ( v . toBigInteger ( ) . multiply ( BigInteger . valueOf ( t ) ) . divide ( d ) . multiply ( BigInteger . valueOf ( t ) ) ) . intValue ( ) ) ) ;
  }
}
