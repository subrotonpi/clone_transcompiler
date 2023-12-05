public static void fin ( File file ) throws IOException {
  FileWriter fout = new FileWriter ( file ) ;
  int numtests = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int cas = xrange ( 1 , numtests + 1 ) ;
  cas <= 0 ;
  cas ++ ) {
    fout . write ( "Case #" + cas + ": " ) ;
    int a = Integer . parseInt ( fin . readLine ( ) ) ;
    int n = Integer . parseInt ( fin . readLine ( ) ) ;
    int [ ] s = ArrayUtil . split ( fin . readLine ( ) ) ;
    Arrays . sort ( s ) ;
    int [ ] cost = new int [ n + 1 ] ;
    for ( int i : xrange ( n + 1 ) ) {
      cost [ i + 1 ] = cost [ i ] ;
    }
  }
  fin . close ( ) ;
  fout . close ( ) ;
}
