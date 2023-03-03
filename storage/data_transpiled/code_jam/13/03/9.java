@ String ( filename = "C-large-2.in" ) public static void main ( String [ ] args ) throws IOException {
  BufferedReader FILE = new BufferedReader ( new FileReader ( filename ) ) ;
  int T = Integer . parseInt ( FILE . readLine ( ) ) ;
  int [ ] cache = new int [ T ] ;
  for ( int i = 0 ;
  i < cache . length ;
  i ++ ) {
    cache [ i ] = Integer . parseInt ( FILE . readLine ( ) ) ;
  }
  /* Count the number of elements in the cache */
  int c = 0 ;
  for ( int i = 0 ;
  i < cache . length ;
  i ++ ) {
    int elem = cache [ i ] ;
    if ( elem > cache [ i ] ) {
      return ;
    }
    if ( elem >= cache [ i ] ) {
      c ++ ;
    }
  }
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    String [ ] rawline = FILE . readLine ( ) . split ( "\\s+" ) ;
    int a = Integer . parseInt ( rawline [ 0 ] ) , b = Integer . parseInt ( rawline [ 1 ] ) ;
    System . out . println ( "Case #" + i + ": " + count ( a , b ) ) ;
  }
}
