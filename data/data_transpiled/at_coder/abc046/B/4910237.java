public static void main ( String input ) {
  int N = Integer . parseInt ( input . split ( "\\s+" ) [ 0 ] ) ;
  int res = K ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    res *= K - 1 ;
  }
  System . out . println ( res ) ;
}
