public static String solve ( String string ) {
  int a = Integer . parseInt ( string ) ;
  int b = Integer . parseInt ( string ) ;
  if ( b == 0 ) {
    return "0" ;
  }
  String binA = a + "" ;
  String binB = b + "" ;
  int [ ] aa = new int [ 40 ] ;
  for ( int i = 0 ;
  i < aa . length ;
  i ++ ) {
    String _a = binA . substring ( i , i + 1 ) ;
    String _b = binB . substring ( i , i + 1 ) ;
    aa [ i ] = _a . equals ( "0" ) ? - 1 : Integer . parseInt ( binA . substring ( i + 1 , i + 1 ) , 2 ) ;
  }
  int [ ] bb = new int [ 40 ] ;
  for ( int i = 0 ;
  i < bb . length ;
  i ++ ) {
    String _b = binB . substring ( i , i + 1 ) ;
    bb [ i ] = _b . equals ( "0" ) ? - 1 : Integer . parseInt ( binB . substring ( i , i + 1 ) , 2 ) ;
  }
  int index = 0 ;
  do {
    if ( bb [ index ] != - 1 ) {
      break ;
    }
    index ++ ;
  }
  StringBuilder ans = new StringBuilder ( ) ;
  while ( index < 40 ) {
    if ( aa [ index ] == bb [ index ] == - 1 ) {
      ans . append ( "0" ) ;
    }
    else if ( aa [ index ] == - 1 ) {
      ans . append ( String . valueOf ( ( bb [ index ] + 1 ) % 2 ) ) ;
    }
    else if ( bb [ index ] == - 1 ) {
      ans . append ( String . valueOf ( aa [ index ] % 2 ) ) ;
    }
    else {
      ans . append ( String . valueOf ( ( bb [ index ] + 1 - aa [ index ] ) % 2 ) ) ;
    }
    index ++ ;
  }
  ans . setLength ( ans . length ( ) - 1 ) ;
  ans . append ( a % 2 == b % 2 == 0 ? String . valueOf ( ( b - a ) / 2 ) : String . valueOf ( ( ( b - a ) / 2 + 1 ) % 2 ) ) ;
  return String . valueOf ( Long . parseLong ( ans . toString ( ) , 2 ) ) ;
}
