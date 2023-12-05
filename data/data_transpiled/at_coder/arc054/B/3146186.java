@ GwtIncompatible ( "java.math.BigInteger" ) public static int [ ] getBigIntegerFormats ( ) {
  getMathContext ( ) . setRoundingMode ( 56 ) ;
  BigDecimal x = new BigDecimal ( BigInteger . ZERO ) ;
  BigDecimal P = new BigDecimal ( x ) ;
  P . multiply ( new BigDecimal ( 2 * BigDecimal . valueOf ( - 1 ) . multiply ( x . multiply ( new BigDecimal ( 2 ) . divide ( new BigDecimal ( 3 ) ) ) ) ) ) ;
  return P . divideAndRemainder ( x ) ;
}
