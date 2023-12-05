public static int numCases = Integer . parseInt ( Scanner in ) {
  for ( int caseNum = xrange ( 1 , numCases + 1 ) ;
  caseNum <= xrange ( 1 , numCases + 1 ) ;
  caseNum ++ ) {
    String [ ] line = in . nextLine ( ) . split ( " " ) ;
    int N = Integer . parseInt ( line [ 0 ] ) ;
    Stack < Integer > colors = new Stack < > ( ) ;
    Stack < Integer > moves = new Stack < > ( ) ;
    moves . push ( 'O' ) ;
    moves . push ( new ArrayList < > ( ) ) ;
    moves . push ( new ArrayList < > ( ) ) ;
    Map < Integer , Integer > positions = new HashMap < > ( ) ;
    positions . put ( 'O' , 1 ) ;
    positions . put ( 'B' , 1 ) ;
    int count = 0 ;
    for ( int i : xrange ( N ) ) {
      int r = line [ 2 * i + 1 ] , p = Integer . parseInt ( line [ 2 * i + 2 ] ) ;
      colors . push ( r ) ;
      moves . get ( r ) . add ( p ) ;
    }
    colors . clear ( ) ;
    colors . push ( 0 ) ;
    moves . pop ( ) ;
    moves . pop ( ) ;
    colors . push ( 0 ) ;
    moves . pop ( ) ;
    moves . pop ( ) ;
    int color = colors . pop ( ) ;
    int otherColor = color == 'O' ? 'O' : 'B' ;
    int current = positions . get ( color ) ;
    int otherCurrent = positions . get ( otherColor ) ;
    int target = moves . get ( color ) . remove ( ) ;
    if ( moves . get ( otherColor ) != null ) {
      otherTarget = moves . get ( otherColor ) . get ( moves . get ( otherColor ) . size ( ) - 1 ) ;
    }
    int timeToPush = Math . abs ( target - current ) + 1 ;
    count += timeToPush ;
    positions . put ( color , target ) ;
    int delta = otherTarget - otherCurrent ;
    if ( Math . abs ( delta ) <= timeToPush ) {
      positions . put ( otherColor , otherTarget ) ;
    }
    else {
      int sign = delta < 0 ? - 1 : 1 ;
      positions . put ( otherColor , sign * timeToPush ) ;
    }
  }
  System . out . println ( "Case #" + caseNum + ": " + count ) ;
  return count ;
}
