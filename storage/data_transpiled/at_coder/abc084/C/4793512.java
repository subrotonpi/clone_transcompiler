public static int [ ] getTimes ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] c = new int [ n ] ;
  int [ ] s = new int [ n ] ;
  int [ ] f = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int y = Integer . parseInt ( input . readLine ( ) ) ;
    int z = Integer . parseInt ( input . readLine ( ) ) ;
    c [ i ] = x ;
    s [ i ] = y ;
    f [ i ] = z ;
  }
  int T ;
  if ( s [ i ] >= t ) T = s [ i ] ;
  else {
    if ( ( t - s [ i ] ) % f [ i ] == 0 ) T = t ;
    else T = t + f [ i ] - ( t - s [ i ] ) % f [ i ] ;
  }
  return T + c [ i ] ;
}
