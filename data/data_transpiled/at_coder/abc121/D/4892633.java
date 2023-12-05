public static String solve ( String string ) {
  int a = Integer . parseInt ( string ) ;
  int b = Integer . parseInt ( string ) ;
  if ( b == 0 ) {
    return "0" ;
  }
  String binA = a + "" ;
  String binB = b + "" ;
  int [ ] aa = new int [ binA . length ( ) ] ;
  for ( int i = 0 ;
  i < aa . length ;
  i ++ ) {
    String _a = binA . substring ( i , i + 1 ) ;
    aa [ i ] = _a . equals ( "0" ) ? - 1 : Integer . parseInt ( binA . substring ( i + 1 , i + 1 ) . equals ( "0" ) ? Integer . parseInt ( binA . substring ( i + 1 , i + 1 ) ) : Integer . parseInt ( binA . substring ( i + 1 , i + 1 ) ) , 2 ) ;
  }
  int [ ] bb = new int [ binB . length ( ) ] ;
  for ( int i = 0 ;
  i < bb . length ;
  i ++ ) {
    String _b = binB . substring ( i , i + 1 ) ;
    bb [ i ] = _b . equals ( "0" ) ? - 1 : Integer . parseInt ( binB . substring ( i + 1 , i + 1 ) . equals ( "0" ) ? Integer . parseInt ( binB . substring ( i + 1 , i + 1 ) ) : Integer . parseInt ( binB . substring ( i + 1 , i + 1 ) ) , 2 ) ;
  }
  StringBuilder ans = new StringBuilder ( ) ;
  for ( int i = binB . indexOf ( "1" ) ;
  i < 40 ;
  i ++ ) {
    ans . append ( String . valueOf ( ( bb [ i ] + 1 + Math . max ( 0 , aa [ i ] ) ) % 2 ) ) ;
  }
  ans . setLength ( ans . length ( ) - 1 ) ;
  ans . append ( a % 2 == b % 2 == 0 ? String . valueOf ( ( b - a ) / 2 ) : String . valueOf ( ( ( b - a ) / 2 + 1 ) % 2 ) ) ;
  return String . valueOf ( Long . parseLong ( ans . toString ( ) , 2 ) ) ;
}
