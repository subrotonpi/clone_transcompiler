static final Scanner getScanner ( ) throws FileNotFoundException {
  File file = new File ( "D-small-attempt1.in" ) ;
  String strWholeFile = file . getAbsolutePath ( ) ;
  String [ ] aStrLines = strWholeFile . split ( "\n" ) ;
  int nCases = Integer . parseInt ( aStrLines [ 0 ] ) ;
  String [ ] aStrLinesLeft = aStrLines . substring ( 1 ) . split ( "\n" ) ;
  for ( int nCase = 1 ;
  nCase <= nCases ;
  ++ nCase ) {
    System . out . println ( >> System . err . println ( "On case " + nCase + " of " + nCases ) ) ;
    String [ ] aStrLinesCur = aStrLinesLeft [ 0 ] . split ( " " ) ;
    aStrLinesLeft = aStrLinesLeft [ 2 ] . split ( " " ) ;
    String [ ] aStrToks = aStrLinesCur [ 0 ] . split ( " " ) ;
    int nPlanets = Integer . parseInt ( aStrToks [ 0 ] ) ;
    int nWormholes = Integer . parseInt ( aStrToks [ 1 ] ) ;
    boolean [ ] [ ] matAdj = CollectionUtils . getMatches ( new Predicate < String [ ] > ( ) {
      @ Override public boolean apply ( String [ ] foo ) {
        return map . get ( foo ) . equals ( Boolean . FALSE ) ;
      }
    }
    , nPlanets , nWormholes ) ;
    aStrToks = aStrLinesCur [ 1 ] . split ( " " ) ;
    for ( String tok : aStrToks ) {
      aStrPlanets = tok . split ( "," ) ;
      int i = Integer . parseInt ( aStrPlanets [ 0 ] ) ;
      int j = Integer . parseInt ( aStrPlanets [ 1 ] ) ;
      matAdj [ i ] [ j ] = true ;
      matAdj [ j ] [ i ] = true ;
    }
    List < List < Integer >> lPathQueue = new ArrayList < List < Integer >> ( ) ;
    List < List < Integer >> lPathSoln = new ArrayList < List < Integer >> ( ) ;
    while ( lPathSoln . size ( ) == 0 ) {
      List < Integer > lPathQueueNext = new ArrayList < List < Integer >> ( ) ;
      for ( List < Integer > path : lPathQueue