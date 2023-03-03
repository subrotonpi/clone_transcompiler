public static void input ( ) {
  String sa = input . nextLine ( ) ;
  String sb = input . nextLine ( ) ;
  String sc = input . nextLine ( ) ;
  @ SuppressWarnings ( "unchecked" ) Queue < String > a = ( Queue < String > ) sa ;
  Queue < String > b = ( Queue < String > ) sb ;
  Queue < String > c = ( Queue < String > ) sc ;
  String x = a . poll ( ) ;
  while ( true ) {
    switch ( x ) {
      case "a" : if ( ! a . isEmpty ( ) ) {
        System . out . println ( "A" ) ;
        break ;
      }
      x = a . poll ( ) ;
      break ;
      case "b" : if ( ! b . isEmpty ( ) ) {
        System . out . println ( "B" ) ;
        break ;
      }
      x = b . poll ( ) ;
      break ;
      case "c" : if ( ! c . isEmpty ( ) ) {
        System . out . println ( "C" ) ;
        break ;
      }
      x = c . poll ( ) ;
      break ;
    }
  }
}
