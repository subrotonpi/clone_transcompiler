public static void print ( String a ) {
  String b = input . next ( ) ;
  String c = input . next ( ) ;
  String x = a . charAt ( 0 ) ;
  for ( int i = 0 ;
  i < a . length ( ) + b . length ( ) + c . length ( ) ;
  i ++ ) {
    switch ( x ) {
      case "a" : if ( a . length ( ) == 0 ) {
        System . out . println ( "A" ) ;
        break ;
      }
      else {
        x = a . substring ( 0 , a . length ( ) ) ;
      }
      break ;
      case "b" : if ( b . length ( ) == 0 ) {
        System . out . println ( "B" ) ;
        break ;
      }
      else {
        x = b . substring ( 0 , b . length ( ) ) ;
      }
      break ;
      default : if ( c . length ( ) == 0 ) {
        System . out . println ( "C" ) ;
        break ;
      }
      else {
        x = c . substring ( 0 , c . length ( ) ) ;
      }
      break ;
    }
  }
}
