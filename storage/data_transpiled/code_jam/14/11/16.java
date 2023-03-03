public static BufferedReader reader ( File f ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( f ) ) ;
  String line ;
  StringBuilder sb = new StringBuilder ( ) ;
  while ( ( line = br . readLine ( ) ) != null ) {
    sb . append ( line . trim ( ) ) ;
  }
  br . close ( ) ;
  return new BufferedReader ( new FileReader ( f ) ) {
    @ Override public void write ( BufferedWriter bw , StringBuilder sb ) throws IOException {
      for ( int i = 0 ;
      i < xrange ( sb . length ( ) ) ;
      i ++ ) {
        sb . append ( "Case #" ) . append ( i + 1 ) . append ( ": " ) . append ( sb . toString ( ) ) ;
      }
    }
  }
  ;
}
