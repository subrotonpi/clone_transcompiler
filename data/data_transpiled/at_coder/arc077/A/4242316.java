public static String print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  String [ ] a = Lists . newArrayList ( ) . toArray ( String [ ] :: new ) ;
  String s ;
  if ( n % 2 != 1 ) {
    s = Lists . reverse ( a ) . toString ( ) ;
  }
  else {
    s = a ;
  }
  return s ;
}
