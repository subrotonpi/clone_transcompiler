static final Scanner getScanner ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int T = Integer . parseInt ( scanner . nextLine ( ) , 10 ) ;
  for ( int tt = 1 ;
  tt < T ;
  tt ++ ) {
    final String l = scanner . nextLine ( ) ;
    String pancakes = l . trim ( ) ;
    boolean done = false ;
    int flips = 0 ;
    while ( true ) {
      final int index = pancakes . lastIndexOf ( "-" ) ;
      if ( index == - 1 ) break ;
      flips ++ ;
      String newCakes = "" ;
      for ( int i : xrange ( index + 1 ) ) {
        if ( pancakes . charAt ( i ) == '+' ) newCakes += "-" ;
        else if ( pancakes . charAt ( i ) == '-' ) newCakes += "+" ;
        else throw new IllegalStateException ( "wtf" ) ;
      }
      pancakes = newCakes + pancakes . substring ( index + 1 ) ;
    }
    System . out . println ( "Case #" + ( tt + 1 ) + ":" + flips ) ;
    scanner . close ( ) ;
  }
  return scanner ;
}
