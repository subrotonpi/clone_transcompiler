public static String print ( ) {
  String s = list ( input ( ) ) ;
  String t = list ( input ( ) ) ;
  s = StringUtils . sort ( s ) ;
  t = StringUtils . sort ( t ) ;
  return s < t ? "Yes" : "No" ;
}
