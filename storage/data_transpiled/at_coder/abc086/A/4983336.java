public static int [ ] [ ] ints ( int a , int b ) {
  int [ ] [ ] ints = new int [ b ] [ a ] ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) {
    ints [ i ] = ints [ i ] ;
  }
  if ( a % 2 == 1 && b % 2 == 1 ) {
    System . out . println ( "Odd" ) ;
  }
  else {
    System . out . println ( "Even" ) ;
  }
  return ints ;
}
