public static void init ( int [ ] par , int n ) {
  par = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    par [ i ] = i ;
    rank = new int [ n ] ;
  }
  /* find the first element in the array */
  int x , y ;
  /* unite the first element in the array */
  x = find ( par , x ) ;
  y = find ( par , y ) ;
  if ( x == y ) return ;
  if ( rank [ x ] < rank [ y ] ) {
    par [ x ] = y ;
  }
  else {
    par [ y ] = x ;
    if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
  }
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  K = Integer . parseInt ( input . nextLine ( ) ) ;
  L = Integer . parseInt ( input . nextLine ( ) ) ;
  roads = new int [ N ] ;
  rank = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    roads [ i ] = i ;
  }
  rank = new int [ N ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int q = Integer . parseInt ( input . nextLine ( ) ) ;
    unite ( roads , p - 1 , q - 1 ) ;
  }
  rails = new int [ N ] ;
  rank = new int [ N ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int q = Integer . parseInt ( input . nextLine ( ) ) ;
    unite ( rails , p - 1 , q - 1 ) ;
  }
  HashMap < Integer , Integer > map = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    map . put ( find ( roads , i ) , find ( rails , i ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . print ( map . get ( find ( roads , i ) ) + " " ) ;
  }
  System . out . println ( ) ;
}
