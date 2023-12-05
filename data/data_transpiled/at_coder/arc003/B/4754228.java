public static final InputSupplier < BufferedReader > IO_GENERATOR = new InputSupplier < BufferedReader > ( ) {
  @ Override public BufferedReader getInput ( ) {
    return new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  }
  @ Override public void main ( BufferedReader io ) throws IOException {
    int n = Integer . parseInt ( io . readLine ( ) ) ;
    List < String > ll = new ArrayList < String > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      ll . add ( io . readLine ( ) ) ;
    }
    List < String > ll2 = new ArrayList < String > ( ) ;
    for ( String l : ll ) {
      ll2 . add ( l . substring ( 0 , l . length ( ) - 1 ) ) ;
    }
    Collections . sort ( ll2 ) ;
    for ( String l : ll2 ) {
      System . out . println ( l . substring ( 0 , l . length ( ) - 1 ) ) ;
    }
  }
}
