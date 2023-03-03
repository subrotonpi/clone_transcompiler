public static String solve ( String string ) {
  int a = Integer . parseInt ( string ) ;
  int b = Integer . parseInt ( string ) ;
  if ( b == 0 ) {
    return "0" ;
  }
  String binA = a + "" ;
  String binB = b + "" ;
  int [ ] aa = new int [ a ] ;
  int [ ] bb = new int [ b ] ;
  for ( int i = 0 ;
  i < aa . length ;
  i ++ ) {
    aa [ i ] = binA . equals ( "0" ) ? - 1 : Integer . parseInt ( binA . substring ( i + 1 ) . equals ( "0" ) ? Integer . parseInt ( binA . substring ( i + 1 ) ) : Integer . parseInt ( binA . substring ( i + 1 ) ) , 2 ) ;
    bb [ i ] = binB . equals ( "0" ) ? - 1 : Integer . parseInt ( binB . substring ( i + 1 ) . equals ( "0" ) ? Integer . parseInt ( binB . substring ( i + 1 ) ) : Integer . parseInt ( binB . substring ( i + 1 ) ) , 2 ) ;
  }
  int index = 0 ;
  do {
    if ( bb [ index ] != - 1 ) {
      break ;
    }
    index ++ ;
  }
  while ( index < 40 ) ;
  StringBuilder ans = new StringBuilder ( ) ;
  while ( index < 40 ) {
    int tmp = 0 ;
    tmp += ( bb [ index ] >= 0 ) ? ( bb [ index ] + 1 ) % 2 : 0 ;
    tmp += aa [ index ] > 0 ? aa [ index ] : 0 ;
    ans . append ( String . valueOf ( tmp % 2 ) ) ;
    index ++ ;
  }
  ans . setLength ( ans . length ( ) - 1 ) ;
  ans . append ( a % 2 == b % 2 == 0 ? String . valueOf ( ( b - a ) / 2 ) : String . valueOf ( ( ( b - a ) / 2 + 1 ) % 2 ) ) ;
  return String . valueOf ( Long . parseLong ( ans . toString ( ) , 2 ) ) ;
}
