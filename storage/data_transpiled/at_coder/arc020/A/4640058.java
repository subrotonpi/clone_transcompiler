public static int [ ] [ ] ints ( int a , int b ) {
  a = Math . min ( a , b ) ;
  b = Math . max ( b , a ) ;
  if ( a < b ) {
    System . out . println ( "Ant" ) ;
  }
  else if ( a == b ) {
    System . out . println ( "Draw" ) ;
  }
  else {
    System . out . println ( "Bug" ) ;
  }
  return ints ( a , b ) ;
}
