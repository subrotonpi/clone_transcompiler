public static void input ( Scanner input , int r , int c , int k ) {
  int n = input . nextInt ( ) ;
  int [ ] [ ] RC = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    RC [ i ] = input . nextInt ( ) ;
  }
  int [ ] R = new int [ r ] ;
  int [ ] C = new int [ c ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    R [ RC [ i ] [ 0 ] - 1 ] ++ ;
    C [ RC [ i ] [ 1 ] - 1 ] ++ ;
  }
  int [ ] R2 = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    R2 [ i ] ++ ;
  }
  int [ ] C2 = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < c ;
  i ++ ) {
    C2 [ C [ i ] ] ++ ;
  }
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int j = k - i ;
    cnt += R2 [ i ] * C2 [ j ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( R [ RC [ i ] [ 0 ] - 1 ] + C [ RC [ i ] [ 1 ] - 1 ] == k ) cnt -- ;
    if ( R [ RC [ i ] [ 0 ] - 1 ] + C [ RC [ i ] [ 1 ] - 1 ] == k + 1 ) cnt ++ ;
  }
  System . out . println ( cnt ) ;
}
