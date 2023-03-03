public static int N = Integer . parseInt ( input ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /*if (a % b == 0) {
  return (b);
  } else {
  return (gcd(b,a%b));
  }*/
  int gcd_num = A [ 0 ] ;
  for ( int a = 0 ;
  a < A . length ;
  a ++ ) {
    gcd_num = gcd ( A [ a ] , gcd_num ) ;
  }
  if ( K % gcd_num == 0 && K <= max ( A ) ) {
    System . out . println ( "POSSIBLE" ) ;
  }
  else {
    System . out . println ( "IMPOSSIBLE" ) ;
  }
  return gcd_num ;
}
