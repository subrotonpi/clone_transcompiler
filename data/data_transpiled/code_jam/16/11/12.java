public static String solve ( String s ) {
  String pre = "" ;
  String post = "" ;
  String part = s ;
  while ( part . length ( ) > 0 ) {
    String c = Collections . max ( new StringBuilder ( part ) . toString ( ) ) ;
    int i = part . length ( ) - 1 - part . substring ( 0 , part . length ( ) - 1 ) . indexOf ( c ) ;
    pre += c ;
    post = part . substring ( i + 1 ) + post ;
    part = part . substring ( 0 , i ) ;
  }
  return pre + post ;
}
