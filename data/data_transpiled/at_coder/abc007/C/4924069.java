public static void print ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int sx = Integer . parseInt ( input ) ;
  int sy = Integer . parseInt ( input ) ;
  int gx = Integer . parseInt ( input ) ;
  int gy = Integer . parseInt ( input ) ;
  char [ ] [ ] c = new char [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) c [ i ] = new char [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) c [ i ] [ i ] = new char [ w ] ;
  sx -- ;
  sy -- ;
  gx -- ;
  gy -- ;
  int ans = 0 ;
  char [ ] [ ] temp = new char [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) temp [ i ] [ 0 ] = new char [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) temp [ i ] [ 1 ] = new char [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) temp [ i ] [ 0 ] = new char [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) temp [ i ] [ 0 ] = new char [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) temp [ i ] [ 1 ] = new char [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) temp [ i ] [ 0 ] = new char [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) temp [ i ] [ 0 ] = new char [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) temp [ i ] [ 0 ] = new char [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) temp [ i ] [ 1 ] = new char [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) temp [ i ] [ 0 ] = new char [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) temp [ i ] [ 0 ] = new char [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) temp [ i ] [ 0 ] = new char [ w ] ;
}