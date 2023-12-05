public static int n ( String input ) {
  int m = Integer . parseInt ( input . substring ( 0 , input . length ( ) ) ) ;
  int [ ] A = new int [ n ] ;
  for ( String s : input . split ( " " ) ) {
    A [ 0 ] = Integer . parseInt ( s ) ;
  }
  Arrays . sort ( A ) ;
  int end = A [ A . length - 1 ] ;
  int [ ] dist = new int [ m ] ;
  int cycles = 0 ;
  int x = 0 ;
  for ( int a = A . length - 1 , b = A . length ;
  a >= 0 ;
  a -- ) {
    cycles += b < a ;
    dist [ b ] += ( b - a ) % m ;
    x += Math . min ( ( b - a ) % m , 1 + b ) ;
  }
  dist [ 0 ] ++ ;
  int res = x ;
  for ( int k = 0 ;
  k < m ;
  k ++ ) {
    x += dist [ k ] ;
    x -= cycles + ( k <= end ) ;
    res = Math . min ( res , x ) ;
  }
  System . out . println ( res ) ;
  return cycles ;
}
