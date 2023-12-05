public static int solve ( int R , int C , int N ) {
  int z = N - ( R * C + 1 ) / 2 ;
  if ( z <= 0 ) return 0 ;
  int y = 0 ;
  if ( R == 1 || C == 1 ) {
    if ( R * C % 2 == 0 ) {
      y ++ ;
      z -- ;
    }
    y += 2 * z ;
    return y ;
  }
  if ( R * C % 2 == 0 ) {
    int dz = Math . min ( z , 2 ) ;
    y += 2 * dz ;
    z -= dz ;
    dz = Math . min ( z , R + C - 4 ) ;
    y += 3 * dz ;
    z -= dz ;
    y += 4 * z ;
    return y ;
  }
  if ( z == 1 ) return 3 ;
  z ++ ;
  int dz = Math . min ( z , 4 ) ;
  y += 2 * dz ;
  z -= dz ;
  dz = Math . min ( z , R + C - 6 ) ;
  y += 3 * dz ;
  z -= dz ;
  y += 4 * z ;
  return y ;
}
for ( int x = 1 ;
x <= Integer . parseInt ( input ( ) ) ;
x ++ ) {
  int y = solve ( ( Integer ) Integer . parseInt ( input ( ) ) ) ;
  System . out . println ( "Case #" + x + ":" + y ) ;
}
