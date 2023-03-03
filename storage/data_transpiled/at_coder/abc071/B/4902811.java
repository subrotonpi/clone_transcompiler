public static String input ( ) {
  String S = input . readLine ( ) ;
  int [ ] element = new int [ 26 ] ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    element [ i ] = 0 ;
  }
  boolean zero = element [ 0 ] ;
  return zero ? "null" : ( char ) ( 'a' + element [ 0 ] ) ;
}
