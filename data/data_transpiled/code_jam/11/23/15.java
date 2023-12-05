@ VisibleForTesting static List < List < Integer >> splitRooms ( List < List < Integer >> rooms , List < Integer > wall ) throws IOException {
  List < Integer > theRoom = new ArrayList < > ( ) ;
  for ( List < Integer > r : rooms ) {
    if ( wall . contains ( r . get ( 0 ) ) && wall . contains ( r . get ( 1 ) ) ) {
      theRoom . remove ( r . get ( 0 ) ) ;
    }
  }
  Collections . sort ( theRoom ) ;
  {
    int numVertices = 0 ;
    for ( int v = 0 ;
    v < numVertices ;
    v ++ ) {
      result . add ( Integer . toString ( vertexColors . get ( v + 1 ) ) ) ;
    }
    System . out . println ( " " + result ) ;
  }
  BufferedReader inputIn = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int numCases = Integer . parseInt ( inputIn . readLine ( ) ) ;
  for ( int c = 0 ;
  c < numCases ;
  c ++ ) {
    solveCase ( c , inputIn . readLine ( ) , inputIn . readLine ( ) ) ;
  }
  List < Integer > newLeft = new ArrayList < > ( ) ;
  for ( int v = 0 ;
  v < numVertices ;
  v ++ ) {
    if ( ! theRoom . contains ( v ) ) {
      newLeft . add ( vertexColors . get ( v ) ) ;
    }
  }
  List < Integer > possibilities = new ArrayList < > ( ) ;
  for ( int x : xrange ( 1 , maxNum + 1 ) ) {
    if ( ! currentColors . contains ( x ) ) {
      possibilities . add ( x ) ;
    }
  }
  if ( possibilities . size ( ) == 0 ) {
    return 0 ;
  }
  else {
    return new ArrayList < > ( possibilities ) ;
  }
}
