@ Nullable public static String getDecimalString ( ) throws IOException {
  getcontext ( ) . setDecimalSeparator ( " " ) ;
  BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int C = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int c = 0 ;
  c < C ;
  c ++ ) {
    int n = Integer . parseInt ( br . readLine ( ) ) ;
    BigDecimal a = new BigDecimal ( 3 ) ;
    BigDecimal b = new BigDecimal ( 5 ) ;
    a = ( ( a . add ( b . sqrt ( ) ) ) . pow ( n ) ) % 1000 ;
    System . out . format ( "Case #%d: %03d%n" , c + 1 , ( int ) a ) ;
  }
  return null ;
}
