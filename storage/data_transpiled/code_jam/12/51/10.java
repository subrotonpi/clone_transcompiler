public static void fin ( File file ) throws IOException {
  FileWriter fout = new FileWriter ( file ) ;
  int numcases = Integer . parseInt ( fin . readLine ( ) ) ;
  numcases ++ ;
  for ( int cas = xrange ( 1 , numcases ) ;
  cas <= 0 ;
  cas ++ ) {
    fout . write ( "Case #" + cas + ":" ) ;
    int n = Integer . parseInt ( fin . readLine ( ) ) ;
    double [ ] l = map . getVal ( ) ;
    double [ ] p = map . getVal ( ) ;
    double [ ] q = new double [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) q [ i ] = p [ i ] / l [ i ] ;
    ArrayList < Integer > r = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) r . add ( new Integer ( q [ i ] ) ) ;
    Collections . sort ( r ) ;
    Collections . reverse ( r ) ;
    for ( Integer i : r ) fout . write ( " " + - i . intValue ( ) ) ;
    fout . write ( "\n" ) ;
  }
}
