@ GwtIncompatible ( "decimal" ) public static void input ( String ... digits ) {
  String S = input ( ) ;
  int N = Integer . parseInt ( S ) ;
  BigDecimal sq = new BigDecimal ( N * N ) ;
  String Q = sq . toString ( ) ;
  MathContext cx = getMathContext ( ) ;
  cx . setRoundingMode ( RoundingMode . DOWN ) ;
  int p = 10 * Q . length ( ) ;
  while ( p > 0 ) {
    int a = ( sq . subtract ( BigDecimal . ONE ) ) . intValue ( ) / p + 1 ;
    BigDecimal rt = cx . sqrt ( a ) ;
    String rts = rt . toString ( ) . replace ( "." , "" ) ;
    if ( rts . length ( ) > S . length ( ) ) {
      while ( a % 100 == 0 ) {
        a /= 100 ;
      }
      System . out . println ( a ) ;
      exit ( ) ;
    }
    if ( ( rts . length ( ) > 5 ) && rts . substring ( 0 , 5 ) . equals ( S . substring ( 0 , 5 ) ) ) {
      p /= 100 ;
    }
    else {
      p /= 10 ;
    }
  }
  assert false ;
}
