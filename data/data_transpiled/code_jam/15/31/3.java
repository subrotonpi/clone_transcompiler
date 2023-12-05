static int solve ( int r , int c , int w ) {
  return r * ( c / w ) + ( c % w == 0 ? w - 1 : w ) ;
}
