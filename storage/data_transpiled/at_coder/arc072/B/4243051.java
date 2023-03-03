public static void main ( String input ) {
  int x = Integer . parseInt ( input ) , y = Integer . parseInt ( input ) ;
  int m = Math . min ( x , y ) ;
  x -= m ;
  y -= m ;
  if ( x == y ) {
    System . out . println ( "Brown" ) ;
  }
  else {
    if ( Math . max ( x , y ) == 1 ) {
      System . out . println ( "Brown" ) ;
    }
    else {
      System . out . println ( "Alice" ) ;
    }
  }
}
