@ VisibleForTesting static void bfs ( ) {
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  int sy = Integer . parseInt ( input . readLine ( ) ) ;
  int sx = Integer . parseInt ( input . readLine ( ) ) ;
  sy -- ;
  sx -- ;
  int gy = Integer . parseInt ( input . readLine ( ) ) ;
  int gx = Integer . parseInt ( input . readLine ( ) ) ;
  gy -- ;
  gx -- ;
  int [ ] [ ] map = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) map [ i ] = new int [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) map [ i ] [ i ] = new int [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) map [ i ] [ i ] = new int [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) map [ i ] [ i ] = new int [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) map [ i ] [ i ] = new int [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) map [ i ] [ i ] = new int [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) map [ i ] [ i ] = new int [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) map [ i ] [ i ] = new int [ w ] ;
  for ( int j = 0 ;
  j < h ;
  j ++ ) map [ i ] [ j ] = new int [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) map [ i ] [ j ] = new int [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) map [ i ] [ j ] = new int [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) map [ i ] [ j ] = new int [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) map [ i ] [ i ] = new int [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) map [ i ] [ i ] = new int [ w ] ;
  