private static Map < String , String > players = new HashMap < String , String > ( ) {
  private static final long serialVersionUID = 1L ;
  {
    players . put ( "A" , input . nextString ( ) ) ;
    players . put ( "B" , input . nextString ( ) ) ;
    players . put ( "C" , input . nextString ( ) ) ;
  }
  private static String nextString ( ) {
    String nowPlay = "A" ;
    do {
      if ( players . get ( nowPlay ) . length ( ) == 0 ) {
        System . out . println ( nowPlay ) ;
        break ;
      }
      String trushedCard = players . get ( nowPlay ) . substring ( 0 , 1 ) . toUpperCase ( ) ;
      players . put ( nowPlay , players . get ( nowPlay ) . substring ( 1 ) ) ;
      nowPlay = trushedCard ;
    }
    while ( true ) ;
  }
  private static void nextString ( ) {
    players . put ( nowPlay , players . get ( nowPlay ) ) ;
  }
}
