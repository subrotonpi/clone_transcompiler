public static int countValids ( int n ) {
  final String nStr = String . valueOf ( n ) ;
  if ( nStr . contains ( "4" ) ) {
    final Matcher result = Pattern . compile ( "4[0-9]*" ) . matcher ( nStr ) ;
    final int s = result . find ( ) ;
    final int e = result . find ( ) ;
    nStr = nStr . substring ( 0 , s ) + "3" + "8" * ( e - s - 1 ) ;
  }
  if ( nStr . contains ( "9" ) ) {
    final Matcher result = Pattern . compile ( "9[0-9]*" ) . matcher ( nStr ) ;
    final int s = result . find ( ) ;
    final int e = result . find ( ) ;
    nStr = nStr . substring ( 0 , s ) + "8" * ( e - s ) ;
  }
  return Integer . parseInt ( nStr , 8 ) ;
}
