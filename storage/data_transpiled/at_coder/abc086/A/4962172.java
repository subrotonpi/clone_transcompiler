public static int [ ] [ ] ints ( int a , int b ) {
  if ( a % 2 == 1 && b % 2 == 1 ) {
    System . out . println ( "Odd" ) ;
  }
  else {
    System . out . println ( "Even" ) ;
  }
  return ints ( a , b ) ;
}
