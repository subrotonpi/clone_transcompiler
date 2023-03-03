public static int N = Integer . parseInt ( input ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x [ i ] = Math . abs ( X - Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  x = new int [ x . length ] ;
  for ( int i = 0 ;
  i < x . length ;
  i ++ ) {
    x [ i ] = Math . abs ( X - Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  /*if (x[0] == 0) {
  return x[0];
  } else {
  return gcd(y,x[0] % y);
  }*/
  if ( x . length < 2 ) {
    System . out . println ( x [ 0 ] ) ;
  }
  else {
    int D = gcd ( x [ 0 ] , x [ 1 ] ) ;
    for ( int i = 2 ;
    i < N ;
    i ++ ) {
      D = gcd ( D , x [ i ] ) ;
    }
    System . out . println ( D ) ;
  }
  return x [ 0 ] ;
}
