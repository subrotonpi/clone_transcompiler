static void print ( int n , int m ) {
  Scanner input = new Scanner ( System . in ) ;
  int [ ] [ ] s = new int [ m ] [ n + 2 ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) s [ i ] [ 0 ] = input . nextInt ( ) ;
  int [ ] x = new int [ n + 2 ] , y = new int [ n + 2 ] , ans = new int [ n + 2 ] ;
  for ( int i = 0 , j = 0 ;
  i < s . length ;
  i ++ ) x [ i ] = s [ i ] [ 0 ] + 1 ;
  for ( int i = 1 ;
  i < n + 2 ;
  i ++ ) {
    x [ i ] += x [ i - 1 ] ;
    if ( x [ i ] == 1 ) y [ i ] ++ ;
  }
  @ SuppressWarnings ( "unused" ) for ( int i = 0 ;
  i < m ;
  i ++ ) ans [ i ] = i + 1 ;
}
