public static void readInput ( File input ) throws IOException {
  File f1 = new File ( input . getPath ( ) ) ;
  FileWriter f1 = new FileWriter ( "output.txt" ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  for ( int i : xrange ( n ) ) {
    int p = Integer . parseInt ( input . readLine ( ) ) ;
    int k = Integer . parseInt ( input . readLine ( ) ) ;
    int l = Integer . parseInt ( input . readLine ( ) ) ;
    int [ ] d = map . values ( ) ;
    if ( p * k < l ) {
      f1 . write ( "Case #" + ( i + 1 ) + ": Impossible" ) ;
    }
    else {
    }
  }
}
