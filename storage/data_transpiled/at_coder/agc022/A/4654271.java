public static void input ( ) {
  Scanner s = new Scanner ( System . in ) ;
  LinkedList < String > l = new LinkedList < String > ( ) ;
  l . add ( "abcdefghijklmnopqrstuvwxyz" ) ;
  for ( String s_ : s ) {
    l . remove ( s_ ) ;
  }
  if ( l . isEmpty ( ) ) {
    l . add ( s . charAt ( s . length ( ) - 1 ) ) ;
    for ( int i = s . length ( ) - 2 ;
    i >= 0 ;
    i -- ) {
      if ( s . charAt ( i ) < Math . max ( l . size ( ) , s . charAt ( i ) ) ) {
        for ( int k = 0 ;
        k < l . size ( ) ;
        k ++ ) {
          if ( l . get ( k ) . compareTo ( s . charAt ( i ) ) > 0 ) {
            System . out . println ( s . substring ( 0 , i ) + l . get ( k ) ) ;
            exit ( ) ;
          }
        }
      }
      l . add ( s . charAt ( i ) ) ;
    }
    System . out . println ( - 1 ) ;
  }
  else {
    System . out . println ( s + l . get ( 0 ) ) ;
  }
}
