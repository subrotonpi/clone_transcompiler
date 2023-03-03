public static int [ ] inputNums ( ) {
  int x = inputNums [ 0 ] ;
  int y = inputNums [ 1 ] ;
  int ad = 0 ;
  if ( x > y ) ad = 2 ;
  if ( ( x < 0 && y > 0 ) || ( x >= 0 && y <= 0 ) ) ad = 1 ;
  if ( x == y ) ad = 0 ;
  return ad ;
}
