public static int [ ] [ ] x ( ) {
  int [ ] [ ] y = new int [ n ] [ n ] ;
  int [ ] tx = new int [ n ] ;
  int [ ] ty = new int [ n ] ;
  int [ ] mx = new int [ 2 ] ;
  int [ ] my = new int [ 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    y [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    tx [ i ] = x [ i ] + y [ i ] ;
    ty [ i ] = x [ i ] - y [ i ] ;
  }
  mx [ 0 ] = Math . min ( tx [ 0 ] , 2 ) ;
  mx [ 1 ] = Math . max ( tx [ 0 ] , 2 ) ;
  my [ 0 ] = Math . min ( ty [ 0 ] , 2 ) ;
  my [ 1 ] = Math . max ( ty [ 0 ] , 2 ) ;
  int D = Math . max ( mx [ 1 ] - mx [ 0 ] , my [ 1 ] - my [ 0 ] ) / 2 ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    for ( int j = - 1 ;
    j <= 1 ;
    j ++ ) {
      int tax = mx [ i ] + D * j ;
      int tay = my [ i ] + D * j ;
      int ax = ( int ) ( ( tax + tay ) / 2 ) ;
      int ay = ( int ) ( ( tax - tay ) / 2 ) ;
      int d = Math . abs ( ax - x [ 0 ] ) + Math . abs ( ay - y [ 0 ] ) ;
      boolean flag = true ;
      for ( int k = 1 ;
      k < n ;
      k ++ ) {
        if ( d != Math . abs ( ax - x [ k ] ) + Math . abs ( ay - y [ k ] ) ) {
          flag = false ;
          break ;
        }
      }
      if ( flag ) {
        System . out . println ( ax + " " + ay ) ;
        exit ( ) ;
      }
    }
  }
  return x ;
}
