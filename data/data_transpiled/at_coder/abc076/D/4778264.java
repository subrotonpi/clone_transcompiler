public static double getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  List < Integer > T = Lists . newArrayList ( ) ;
  List < Integer > V = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    V . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  double [ ] vtmax = new double [ T . size ( ) ] ;
  double tmp = 0 ;
  double Tsum = sum ( T ) ;
  for ( int t = 0 ;
  t < T . size ( ) ;
  t ++ ) {
    double v = T . get ( t ) ;
    vtmax [ T . size ( ) - 1 ] = Math . min ( tmp , v ) ;
    vtmax [ T . size ( ) ] = v ;
    tmp = v ;
  }
  vtmax [ V . size ( ) - 1 ] = 0 ;
  for ( int i = 1 ;
  i < 2 * Tsum ;
  i ++ ) {
    vtmax [ V . size ( ) - 1 ] = Math . min ( vtmax [ i ] , vtmax [ V . size ( ) - 1 ] + 0.5 ) ;
  }
  for ( int i = 2 * Tsum - 1 ;
  i > 0 ;
  i -- ) {
    vtmax [ V . size ( ) - 1 ] = Math . min ( vtmax [ i ] , vtmax [ V . size ( ) ] ) ;
  }
  double area = 0 ;
  for ( int i = 0 ;
  i < vtmax . length ;
  i ++ ) {
    if ( i == 0 ) continue ;
    area += 0.5 * ( vtmax [ V . size ( ) - 1 ] + vtmax [ i ] ) / 2 ;
  }
  System . out . println ( area ) ;
  return area ;
}
