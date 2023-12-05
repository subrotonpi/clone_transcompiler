public static void UnionFind ( ) {
  int [ ] par = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) par [ i ] = i ;
  /* find the first element */
  if ( par [ i ] == 0 ) {
    /* return the first element */
  }
  else {
    par [ i ] = find ( par [ i ] ) ;
    /* unite the first element */
    int x = par [ i ] ;
    int y = par [ i ] ;
    if ( x == y ) return ;
    if ( x < y ) par [ i ] = x ;
    else par [ i ] = y ;
  }
  /* same as the first element */
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  UnionFind pq = new UnionFind ( n ) ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int q = Integer . parseInt ( input . nextLine ( ) ) ;
    pq . unite ( p - 1 , q - 1 ) ;
  }
  UnionFind rs = new UnionFind ( n ) ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    rs . unite ( r - 1 , s - 1 ) ;
  }
  HashMap < Integer , Integer > map = new HashMap < Integer , Integer > ( ) ;
  for ( int x = 0 ;
  x < n ;
  x ++ ) {
    int a = pq . find ( x ) ;
    int b = rs . find ( x ) ;
    if ( ( a < b ) || ( b < a ) ) map . put ( new Integer ( a ) , 0 ) ;
    map . put ( new Integer ( a ) , 1 ) ;
  }
  String [ ] ret = new String [ n ] ;
  for ( int x = 0 ;
  x < n ;
  x ++ ) {
    int a = pq . find ( x ) ;
    int b = rs . find ( x ) ;
    ret [ x ] = Integer . toString ( map . get ( new Integer ( a ) ) , b ) ;
  }
  System . out . println ( Arrays