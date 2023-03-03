public static int f ( int a , int b ) {
  a = Math . min ( a , b ) ;
  b = Math . max ( a , b ) ;
  if ( b % a == 0 ) {
    return ( 2 * b / a - 1 ) * a ;
  }
  else {
    return 2 * a * ( b / a ) + f ( a , b % a ) ;
  }
}
