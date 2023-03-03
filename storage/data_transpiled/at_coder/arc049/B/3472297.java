public static int [ ] [ ] getXYC ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] XYC = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    XYC [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int L = 0 ;
  int U = 10 * 9 ;
  while ( ( U - L ) >= 1e-4 ) {
    int t = ( U + L ) / 2 ;
    int [ ] mx = new int [ N ] ;
    int [ ] Mx = new int [ N ] ;
    int [ ] my = new int [ N ] ;
    int [ ] My = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      mx [ i ] = XYC [ i ] [ 0 ] - t / c ;
      Mx [ i ] = XYC [ i ] [ 1 ] + t / c ;
      my [ i ] = XYC [ i ] [ 2 ] - t / c ;
      My [ i ] = XYC [ i ] [ 3 ] + t / c ;
    }
    if ( max ( mx ) <= min ( Mx ) && max ( my ) <= min ( My ) ) U = t ;
    else L = t ;
  }
  System . out . println ( U ) ;
  return XYC ;
}
