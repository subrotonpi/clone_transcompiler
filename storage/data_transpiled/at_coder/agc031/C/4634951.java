public static int removeBit ( int num , int i ) {
  int high = ( num >>> ( i + 1 ) ) << i ;
  int low = num & ( ( 1 << i ) - 1 ) ;
  return high + low ;
}
