public static int [ ] [ ] ints ( int a , int b ) {
  if ( a % 2 == 0 || b % 2 == 0 ) {
    System . out . println ( "Even" ) ;
  }
  else {
    System . out . println ( "Odd" ) ;
  }
  return ints ( a , b ) ;
}
