public static void print ( String input , int a , int b ) {
  int a_line = ( a - 1 ) / 50 + 1 ;
  int b_line = ( b - 1 ) / 50 + 1 ;
  System . out . println ( a_line * 2 + b_line * 2 + 99 ) ;
  for ( int i = 0 ;
  i < a_line ;
  i ++ ) {
    if ( i == a_line - 1 ) {
      System . out . println ( ( ".#" + ( ( a - 1 ) % 50 ) + "#" + ( 99 - 2 * ( ( a - 1 ) % 50 ) ) ) ) ;
    }
    else {
      System . out . println ( ( ".#" + 49 + "." ) ) ;
    }
    System . out . println ( "#" ) ;
  }
  for ( int i = 0 ;
  i < b_line ;
  i ++ ) {
    System . out . println ( "." + 99 ) ;
    if ( i == b_line - 1 ) {
      System . out . println ( ( "#." + ( ( b - 1 ) % 50 ) + "." + ( 99 - 2 * ( ( b - 1 ) % 50 ) ) ) ) ;
    }
    else {
      System . out . println ( ( "#." + 49 + "#" ) ) ;
    }
  }
}
