public static int f ( int level , int x ) {
  if ( level == 0 ) return x ;
  if ( x == 1 || x == 0 ) {
    return 0 ;
  }
  else if ( x == b [ level ] [ 0 ] ) {
    return b [ level ] [ 1 ] ;
  }
  else if ( 2 <= x && x < b [ level - 1 ] [ 0 ] + 2 ) {
    return f ( level - 1 , x - 1 ) ;
  }
  else if ( x == b [ level - 1 ] [ 0 ] + 2 ) {
    return b [ level - 1 ] [ 1 ] + 1 ;
  }
  else if ( b [ level - 1 ] [ 0 ] + 2 < x && x < b [ level ] [ 0 ] ) {
    return b [ level - 1 ] [ 1 ] + 1 + f ( level - 1 , x - ( b [ level - 1 ] [ 0 ] + 2 ) ) ;
  }
  return 0 ;
}
