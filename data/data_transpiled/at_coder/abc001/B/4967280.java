public static String print ( String input ) {
  int a = Integer . parseInt ( input ) ;
  String result = "" ;
  if ( a < 100 ) {
    result = "00" ;
  }
  else if ( 100 <= a && a <= 5000 ) {
    int resultTemp = ( int ) ( a * 10 / 1000 ) ;
    if ( resultTemp < 10 ) {
      result = "0" + resultTemp ;
    }
    else {
      result = String . valueOf ( resultTemp ) ;
    }
  }
  else if ( 6000 <= a && a <= 30000 ) {
    result = String . valueOf ( ( int ) ( ( a - 30000 ) / 5 / 1000 ) + 80 ) ;
  }
  else if ( a > 70000 ) {
    result = "89" ;
  }
  System . out . println ( result ) ;
  return result ;
}
