public static String S ( ) {
  StringBuilder S = new StringBuilder ( ) ;
  S . append ( S ) ;
  S . append ( "8" ) ;
  S = "" . join ( S ) ;
  return S . toString ( ) ;
}
