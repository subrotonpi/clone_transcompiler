@ GwtIncompatible ( "java.lang.String" ) public static int solve ( int m ) {
  BigDecimal base = new BigDecimal ( 3 ) . add ( new BigDecimal ( 5 ) ) . sqrt ( ) ;
  /* solve the m */
  return base . pow ( m ) . mod ( 1000 ) . intValue ( ) ;
}
