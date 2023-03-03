@ VisibleForTesting static void main ( String argv [ ] ) {
  if ( argv . length == 0 ) {
    System . err . println ( "Usage: java -jar file [-d <filename>]" ) ;
    System . exit ( 1 ) ;
  }
  String filename = argv . length > 0 ? argv [ 0 ] : "test.in" ;
  try {
    BufferedReader br = new BufferedReader ( new FileReader ( filename ) ) ;
    int numCases = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int caseNo : xrange ( 1 , numCases + 1 ) ) {
      String [ ] toks = br . readLine ( ) . split ( " " ) ;
      int N = Integer . parseInt ( toks [ 0 ] ) ;
      int PD = Integer . parseInt ( toks [ 1 ] ) ;
      int PG = Integer . parseInt ( toks [ 2 ] ) ;
      boolean poss = solve ( N , PD , PG ) ;
      String st = poss ? "Possible" : "Broken" ;
      System . out . println ( "Case #" + caseNo + ": " + st ) ;
    }
  }
  catch ( Exception e ) {
    e . printStackTrace ( ) ;
  }
  finally {
    if ( br != null ) {
      br . close ( ) ;
    }
  }
  if ( className . equals ( "org.apache.commons.math.BigDecimalMath" ) ) {
    System . exit ( 0 ) ;
  }
}
