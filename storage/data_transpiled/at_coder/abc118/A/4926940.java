public static int [ ] ints ( int a , int b ) {
  int [ ] ints = new int [ a ] ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    ints [ i ] = i ;
  }
  if ( b % a != 0 ) {
    System . out . println ( b - a ) ;
  }
  else {
    System . out . println ( a + b ) ;
  }
  return ints ;
}
