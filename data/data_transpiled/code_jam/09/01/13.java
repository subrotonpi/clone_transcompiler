static final String [ ] args = new String [ ] {
  "" }
  ;
  final String L = readLine ( ) ;
  final String D = readLine ( ) ;
  final String N = readLine ( ) ;
  String S = "" ;
  for ( int i = 0 ;
  i < Integer . parseInt ( D ) ;
  i ++ ) S = S + readLine ( ) + "\n" ;
  for ( int j = 0 ;
  j < Integer . parseInt ( N ) ;
  j ++ ) {
    final String R = "^" + readLine ( ) . replace ( "(" , "[" ) . replace ( ")" , "]" ) + "$" ;
    final String [ ] m = S . split ( R ) ;
    System . out . println ( "Case #" + ( j + 1 ) + ": " + m . length ) ;
  }
  if ( getClass ( ) . equals ( Main . class ) ) {
    Main . main ( ) ;
  }
  return null ;
}
