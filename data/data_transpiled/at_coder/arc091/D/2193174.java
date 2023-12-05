public static int extgcd ( int a , int b ) {
  if ( b > 0 ) {
    int d = extgcd ( b , a % b ) ;
    int y = extgcd ( b , a % b ) ;
    int x = extgcd ( b , a % b ) ;
    y -= ( a / b ) * x ;
    return d + x + y ;
  }
  else {
    return a + 1 ;
  }
}
