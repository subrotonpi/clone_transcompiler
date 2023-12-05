public static void print ( InputStream is ) throws IOException {
  BufferedReader br = new BufferedReader ( new InputStreamReader ( is ) ) ;
  String line ;
  int C = Integer . parseInt ( br . readLine ( ) ) ;
  int newY , newX , time ;
  int newTimeOffset ;
  int wait ;
  if ( cycleTime < S ) {
    wait = ( S + W ) - cycleTime ;
  }
  else {
    wait = S - cycleTime ;
  }
  newTime = time + wait ;
  boolean ok = minSeenTime [ newY ] [ newX ] == null || minSeenTime [ newY ] [ newX ] > newTime ;
  if ( ok ) {
    minSeenTime [ newY ] [ newX ] = newTime ;
    newStack . add ( new Pair < > ( newY , newX , newTimeOffset ) ) ;
  }
  stack = newStack ;
  System . out . println ( "Case #" + ( caseIndex + 1 ) + ": " + minSeenTime [ 0 ] [ ( M - 1 ) * 2 + 1 ] ) ;
}
