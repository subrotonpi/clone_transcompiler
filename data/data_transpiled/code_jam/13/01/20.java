public static void input ( ) {
  T = input . nextInt ( ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    ArrayList < String > B = new ArrayList < String > ( ) ;
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      B . add ( input . nextLine ( ) ) ;
    }
    input . nextLine ( ) ;
    ArrayList < String > L = B ;
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      L . add ( "" . concat ( B . get ( i ) ) ) ;
    }
    L . add ( B . get ( 0 ) . charAt ( 0 ) + B . get ( 1 ) . charAt ( 1 ) + B . get ( 2 ) . charAt ( 2 ) + B . get ( 3 ) . charAt ( 3 ) ) ;
    L . add ( B . get ( 3 ) . charAt ( 0 ) + B . get ( 2 ) . charAt ( 1 ) + B . get ( 1 ) . charAt ( 2 ) + B . get ( 0 ) . charAt ( 3 ) ) ;
    String ans = "Game has not completed" ;
    for ( String p : "OX" ) {
      for ( String l : L ) {
        if ( l . indexOf ( p ) == 4 || l . indexOf ( p ) == 3 && l . indexOf ( "T" ) == 1 ) {
          ans = p + " won" ;
        }
      }
    }
    if ( ans . equals ( "Game has not completed" ) && ! B . contains ( "." ) ) {
      ans = "Draw" ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + ans ) ;
  }
}
