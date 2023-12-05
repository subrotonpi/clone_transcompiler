public static String reader ( BufferedReader inFile ) throws IOException {
  return inFile . readLine ( ) ;
  @ SuppressWarnings ( "resource" ) LineNumberReader < String > reader = new LineNumberReader < String > ( inFile ) {
    @ Override public String read ( String [ ] gonds ) throws IOException {
      int n = gonds . length ;
      int k = Integer . valueOf ( 1 << i ) ;
      double [ ] exps = new double [ 1 << n ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        if ( ( gonds [ i ] . equals ( "X" ) ) ) {
          exps [ i ] = 0.0 ;
        }
      }
      return exps [ k ] ;
    }
  }
  ;
  if ( getClass ( ) . getName ( ) . equals ( "org.apache.commons.logging.gcj.GCJ" ) ) {
    Class < ? > gcj = Class . forName ( "org.apache.commons.logging.gcj.GCJ" ) ;
    GCJ < String > gcj = new GCJ < String > ( reader , gcj , "/Users/lpebody/gcj/2013_3/d/" , "d" ) ;
    return gcj . run ( ) ;
  }
  else {
    return reader . read ( ) ;
  }
}
