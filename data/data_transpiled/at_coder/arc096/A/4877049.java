public static int A , int B , int C , int X , int Y ) {
  int a = 0 , b = 0 , c = 0 ;
  if ( ( A + B ) / 2 > C ) {
    c = Math . min ( X , Y ) * 2 ;
    a = X - Math . min ( X , Y ) ;
    b = Y - Math . min ( Y , X ) ;
    if ( a * A > a * 2 * C ) {
      c += a * 2 ;
      a = 0 ;
    }
    if ( b * B > b * 2 * C ) {
      c += b * 2 ;
      b = 0 ;
    }
  }
  else {
    a = X ;
    b = Y ;
  }
  return a ;
}
