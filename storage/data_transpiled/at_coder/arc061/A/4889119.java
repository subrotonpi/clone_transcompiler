public static int input ( ) {
  int addition = 0 ;
  for ( int i = 0 ;
  i < 2 * ( S . length - 1 ) ;
  i ++ ) {
    String a = new String ( S . charAt ( i ) + ( j < S . length - 1 && ( i & 2 * j == 2 * j ) ? "+" : "" ) ) ;
    for ( String k : a . split ( "\\+" ) ) {
      addition += Integer . parseInt ( k ) ;
    }
  }
  System . out . println ( addition ) ;
  return addition ;
}
