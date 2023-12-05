@ GwtIncompatible ( "System.out.println" ) private static int [ ] readInts ( ) {
  int [ ] ints = new int [ N ] ;
  int i ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  ints [ 0 ] = Integer . parseInt ( input . readLine ( ) ) ;
  ints [ 1 ] = Integer . parseInt ( input . readLine ( ) ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  ints [ 2 ] = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] L = new int [ N + 1 ] ;
  int [ ] R = new int [ N + 1 ] ;
  for ( ;
  i < N ;
  i ++ ) {
    final int l = ints [ i ] ;
    final int r = ints [ i ] ;
    L [ i ] = l ;
    R [ i ] = - r ;
  }
  Arrays . sort ( L ) ;
  Arrays . sort ( R ) ;
  int [ ] psumL = new int [ N + 1 ] ;
  psumR = new int [ N + 1 ] ;
  for ( i = 0 ;
  i < N ;
  i ++ ) psumL [ i ] = psumL [ i ] + L [ i ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) psumR [ j ] = R [ j ] ;
  return psumL ;
}
