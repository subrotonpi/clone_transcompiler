public static int [ ] [ ] ints ( int a , int b ) {
  int [ ] [ ] ints = new int [ b ] [ a ] ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) {
    ints [ i ] = ints [ i ] ;
  }
  if ( ( a * b ) % 2 == 0 ) {
    System . out . println ( "Even" ) ;
  }
  else {
    System . out . println ( "Odd" ) ;
  }
  return ints ;
}
