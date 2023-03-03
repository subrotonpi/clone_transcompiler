public static int a ( int a , int b ) {
  if ( a == b ) {
    System . out . println ( "Draw" ) ;
  }
  else if ( a == 1 ) {
    System . out . println ( "Alice" ) ;
  }
  else if ( b == 1 ) {
    System . out . println ( "Bob" ) ;
  }
  else if ( a > b ) {
    System . out . println ( "Alice" ) ;
  }
  else if ( a < b ) {
    System . out . println ( "Bob" ) ;
  }
  return a ;
}
