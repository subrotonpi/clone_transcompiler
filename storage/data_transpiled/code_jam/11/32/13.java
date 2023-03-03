@ java . lang . Deprecated public static int twoStation ( String [ ] fullGapList , int pos1 , int pos2 ) throws IOException {
  String filename = "B-large.in" ;
  String outputname = filename + "out.txt" ;
  BufferedReader in = new BufferedReader ( new FileReader ( filename ) ) ;
  PrintWriter out = new PrintWriter ( outputname ) ;
  int numCases = Integer . parseInt ( in . readLine ( ) ) ;
  /* First sample time is the highest score of the first station */
  int afterBoost = 0 ;
  int counter = 0 ;
  while ( currTime < ttb && counter < fullGapList . length ) {
    afterBoost = priorTime + 2 * fullGapList [ pos1 ] ;
  }
  /* Second sample time is the highest score of the second station */
  int afterBoost = priorTime + ( ttb - priorTime ) / 2 + fullGapList [ pos1 ] ;
  /* Third sample time is the highest score of the second station */
  if ( afterBoost > 0 ) {
    afterBoost = afterBoost + 2 * fullGapList [ pos2 ] ;
  }
  /* Second sample time is the highest score of the second station */
  int afterBoost = afterBoost + ( ttb - priorTime ) / 2 ;
  /* Second sample time is the highest score of the second station */
  int afterBoost = afterBoost + ( ttb - priorTime ) / 2 ;
  /* Third sample time is the highest score of the second station */
  int afterBoost = afterBoost + ( ttb - priorTime ) / 2 ;
  /* Second sample time is the highest score of the second station */
  int [ ] newGapList = Arrays . copyOfRange ( fullGapList , afterBoost , afterBoost ) ;
  /* Second sample time is the highest score of the second station */
  int [ ] stations = new int [ numStations ] ;
  for ( int i = 0 ;
  i < numCases ;
  i ++ ) {
    System . out . println ( i ) ;
  }
  String [ ] nextLine = in . readLine ( ) . split ( "