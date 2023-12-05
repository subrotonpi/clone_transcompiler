public static int executeCommand ( List < Pair < String , Integer >> commands ) {
  int bPos = 0 ;
  int oPos = 1 ;
  int bTime = 0 ;
  int oTime = 0 ;
  int time = 0 ;
  for ( Pair < String , Integer > c : commands ) {
    if ( c . first ( ) . equals ( "O" ) ) {
      int minTime = Math . abs ( oPos - c . second ( ) ) - time + oTime ;
      time += Math . max ( minTime , 0 ) + 1 ;
      oTime = time ;
      oPos = c . second ( ) ;
    }
    else {
      int minTime = Math . abs ( bPos - c . second ( ) ) - time + bTime ;
      time += Math . max ( minTime , 0 ) + 1 ;
      bTime = time ;
      bPos = c . second ( ) ;
    }
  }
  return time ;
}
public static int readInput ( ) {
  String [ ] line = readLine ( ) . split ( " " ) ;
  List < Pair < String , Integer >> commands = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < line . length / 2 ;
  i ++ ) {
    commands . add ( new Pair < > ( line [ 2 * i ] , Integer . parseInt ( line [ 2 * i + 1 ] ) ) ) ;
  }
  return executeCommand ( commands ) ;
}
