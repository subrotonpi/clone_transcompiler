public static void inFile ( File inFile ) throws IOException {
  File outFile = new File ( "C-large.in" ) ;
  File [ ] lines = inFile . listFiles ( ) ;
  int cases = Integer . parseInt ( lines [ 0 ] . toString ( ) ) ;
  for ( int caseNum = 1 ;
  caseNum <= cases ;
  caseNum ++ ) {
    int shipCount = Integer . parseInt ( lines [ caseNum ] . toString ( ) ) ;
    List < String [ ] > shipList = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < shipCount ;
    i ++ ) {
      String ship = lines [ i ] . toString ( ) ;
      ship = ship . split ( "\\s+" ) ;
      ship = ArrayUtil . toDoubleArray ( ship ) ;
      shipList . add ( ship ) ;
    }
    double maxPower = 0.0 ;
    for ( int i = 0 ;
    i < shipCount ;
    i ++ ) {
      for ( int j = i + 1 ;
      j < shipCount ;
      j ++ ) {
        double taxiDist = Math . abs ( shipList . get ( i ) [ 0 ] - shipList . get ( j ) [ 0 ] ) + Math . abs ( shipList . get ( i ) [ 1 ] - shipList . get ( j ) [ 1 ] ) + Math . abs ( shipList . get ( i ) [ 2 ] - shipList . get ( j ) [ 2 ] ) ;
        double power = taxiDist / powerSum ;
        if ( power > maxPower ) {
          maxPower = power ;
        }
      }
    }
    String outputString = "Case #" + caseNum + ": " + maxPower + "\n" ;
    System . out . println ( outputString . toString ( ) ) ;
    outFile . delete ( ) ;
  }
  inFile . close ( ) ;
  outFile . close ( ) ;
}
