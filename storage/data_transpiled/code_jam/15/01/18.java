public static void fIn ( File file ) throws IOException {
  File f_in = new File ( file . getAbsolutePath ( ) ) ;
  File f_out = new File ( file . getAbsolutePath ( ) ) ;
  int cases = Integer . parseInt ( f_in . readLine ( ) ) ;
  for ( int i = 1 ;
  i <= cases ;
  i ++ ) {
    String shynesses = f_in . readLine ( ) . split ( " " ) [ 1 ] ;
    int len = Integer . parseInt ( shynesses ) ;
    int friends = 0 ;
    int current = 0 ;
    for ( int j = 0 ;
    j <= len ;
    j ++ ) {
      if ( current < j && shynesses . charAt ( j ) != 0 ) {
        friends += j - current ;
        current += j - current ;
      }
      current += shynesses . charAt ( j ) ;
    }
    f_out . append ( "Case #" + i + ": " + friends ) ;
  }
  f_out . deleteOnExit ( ) ;
}
