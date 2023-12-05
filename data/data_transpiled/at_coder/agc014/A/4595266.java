public static int rec ( int x , int y , int z ) {
  if ( ( x | y | z ) & 1 != 0 ) return 0 ;
  if ( x == y == z ) return - INF ;
  int nx = ( y + z ) >> 1 ;
  int ny = ( z + x ) >> 1 ;
  int nz = ( x + y ) >> 1 ;
  return rec ( nx , ny , nz ) + 1 ;
}
