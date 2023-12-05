@ Sys public static String [ ] [ ] main ( ) {
  int n = Integer . parseInt ( stdin . readLine ( ) ) ;
  int m = Integer . parseInt ( stdin . readLine ( ) ) ;
  int [ ] [ ] c = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( "Case #" + i + ": " + main ( ) ) ;
  }
  int [ ] [ ] d = new int [ 2 * m ] [ n ] ;
  for ( int i = 0 ;
  i < d . length ;
  i ++ ) {
    d [ i ] = new int [ 2 * m ] ;
    for ( int j = 0 ;
    j < d [ i ] . length ;
    j ++ ) {
      d [ i ] [ j ] = 10 * j ;
    }
  }
  {
    int w = Integer . parseInt ( stdin . readLine ( ) ) ;
    int z = Integer . parseInt ( stdin . readLine ( ) ) ;
    int t = Integer . parseInt ( stdin . readLine ( ) ) ;
    if ( t < d [ w ] [ z ] ) {
      d [ w ] [ z ] = t ;
      heappush ( h , ( d [ w ] [ z ] = ( w = z ) ) ) ;
    }
  }
  {
    int a = s + w ;
    int y = ( x - t ) % a ;
    if ( y < s ) {
      return d [ x ] ;
    }
    else {
      return d [ x ] [ a - y ] ;
    }
  }
  {
    int cnx = x / 2 , cny = y / 2 ;
    int dx = 1 - 2 * ( x % 2 ) ;
    int dy = 1 - 2 * ( y % 2 ) ;
    int t = d [ x ] [ y ] ;
    if ( 0 <= x + dx && x - dx < 2 * n ) {
      int cs = c [ cnx ] [ cny ] ;
      int cw = c [ cnx ] [ cny ] ;
      int ct = c [ cnx ] [ cny ] ;
      relax ( x + dx , y , ctime ( t , cs , cw , ct ) + 1 ) ;
    }
    if ( 0 <= y + dy && y - dy < 2 * m ) {
      int cs = c [ cnx ] [ cny ] ;
      int cw = c [ cnx ] [ cny ] ;
      int ct = c [ cnx ] [ cny ] ;
      relax ( x , y + dy , ctime (