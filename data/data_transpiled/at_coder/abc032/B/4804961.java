public static String [ ] S ( ) {
  int k = Integer . parseInt ( input ( ) ) ;
  String [ ] ansArray = new String [ S . length - k + 1 ] ;
  for ( int i = 0 ;
  i < ansArray . length ;
  i ++ ) {
    ansArray [ i ] = "" + S [ i ] ;
  }
  return ansArray ;
}
