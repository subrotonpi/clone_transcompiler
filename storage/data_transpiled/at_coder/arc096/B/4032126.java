public static int [ ] [ ] getM ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  a [ n ] [ 0 ] = c ;
  int [ ] [ ] m = new int [ n + 1 ] [ n + 1 ] ;
  int [ ] [ ] h = new int [ n + 1 ] [ n + 1 ] ;
  int [ ] [ ] mb = new int [ n + 1 ] [ n + 1 ] ;
  int [ ] [ ] hb = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    m [ i ] [ 0 ] = m [ i - 1 ] - a [ i + 1 ] [ 0 ] + a [ i ] [ 0 ] + a [ i + 1 ] [ 1 ] ;
    mb [ i ] [ 0 ] = m [ i - 2 ] - a [ i + 1 ] [ 0 ] + a [ i ] [ 0 ] + a [ i + 1 ] [ 1 ] - a [ i + 1 ] [ 0 ] ;
    h [ i ] [ 0 ] = h [ i - 1 ] - a [ - i - 1 ] [ 0 ] + a [ - i - 2 ] [ 0 ] + a [ - i - 2 ] [ 1 ] ;
    hb [ i ] [ 1 ] = h [ i - 2 ] - a [ - i - 1 ] [ 0 ] + a [ - i - 2 ] [ 0 ] + a [ - i - 2 ] [ 1 ] - c + a [ - i - 2 ] [ 0 ] ;
  }
  int [ ] mm = new int [ n ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    mm [ i ] = Math . max ( mm [ i ] - 1 , m [ i + 1 ] ) ;
  }
  int [ ] hm = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    hm [ i ] = Math . max ( hm [ i ] - 1 , h [ i