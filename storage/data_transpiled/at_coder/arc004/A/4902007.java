public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] points = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) points [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  double ans = 0 ;
  for ( int x = 0 ;
  x < N ;
  x ++ ) for ( int y = 0 ;
  y < N ;
  y ++ ) for ( int dx = 0 ;
  dx < N ;
  dx ++ ) for ( int dy = 0 ;
  dy < N ;
  dy ++ ) ans = Math . max ( ans , ( ( x - dx ) * ( x - dx ) + ( y - dy ) * ( y - dy ) * ( y - dy ) ) * 0.5 ) ;
  return ans ;
}
