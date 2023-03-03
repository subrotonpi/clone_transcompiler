private static void solveCase ( int caseIndex , BufferedReader br ) throws IOException {
  int numWires = Integer . parseInt ( br . readLine ( ) ) ;
  HashMap < Integer , Integer > h1ToWireIndex = new HashMap < Integer , Integer > ( ) ;
  HashMap < Integer , Integer > h2ToWireIndex = new HashMap < Integer , Integer > ( ) ;
  for ( int wireIndex : xrange ( numWires ) ) {
    int h1 = Integer . parseInt ( br . readLine ( ) ) ;
    int h2 = Integer . parseInt ( br . readLine ( ) ) ;
    h1ToWireIndex . put ( h1 , wireIndex ) ;
    h2ToWireIndex . put ( h2 , wireIndex ) ;
  }
  Set < Integer > h1s = h1ToWireIndex . keySet ( ) ;
  Set < Integer > h2s = h2ToWireIndex . keySet ( ) ;
  Collections . sort ( h1s ) ;
  Collections . sort ( h2s ) ;
  HashMap < Integer , Integer > wireIndexToH1index = new HashMap < Integer , Integer > ( ) ;
  HashMap < Integer , Integer > wireIndexToH2index = new HashMap < Integer , Integer > ( ) ;
  for ( int heightIndex = 0 ;
  heightIndex < numWires ;
  heightIndex ++ ) {
    int w = h1ToWireIndex . get ( heightIndex ) ;
    wireIndexToH1index . put ( w , heightIndex ) ;
  }
  for ( int heightIndex = 0 ;
  heightIndex < numWires ;
  heightIndex ++ ) {
    int w = h2ToWireIndex . get ( heightIndex ) ;
    wireIndexToH2index . put ( w , heightIndex ) ;
  }
  int numCrossings = 0 ;
  for ( int wireIndex : xrange ( numWires ) ) {
    int h1index = wireIndexToH1index . get ( wireIndex ) ;
    int h2index = wireIndexToH2index . get ( wireIndex ) ;
    if ( h2index > h1index ) {
      numCrossings += h2index - h1index ;
    }
  }
  System . out . println ( "Case #" + caseIndex + ": " + numCrossings ) ;
}
