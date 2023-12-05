public static int A = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A <= B ) A = B ;
  @ SuppressWarnings ( "unused" ) int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A <= C && B <= D ) return 1 ;
  float left = 0.0f ;
  float right = 0.0f ;
  float r = B / Math . sqrt ( A * A + B * B ) ;
  if ( A * cos ( 0 ) + B * sin ( 0 ) > A * cos ( r ) + B * sin ( r ) || C < A ) return 0 ;
  while ( right - left > 1e-6 ) {
    float mid = ( left + right ) / 2 ;
    if ( A * cos ( mid ) + B * sin ( mid ) <= C ) left = mid ;
    else right = mid ;
  }
  return A * sin ( mid ) + B * cos ( mid ) <= D ;
}
