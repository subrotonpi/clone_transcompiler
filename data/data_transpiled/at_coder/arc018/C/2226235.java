public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int p = Integer . parseInt ( input ) ;
  RankInt [ ] rank = new RankInt [ N * M ] ;
  for ( int i = 0 ;
  i < N * M ;
  i ++ ) {
    rank [ i ] = new RankInt ( x , i / M , i % M ) ;
    x = ( x + a ) % p ;
  }
  Arrays . sort ( rank ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    List < Integer > xs = new ArrayList < Integer > ( ) ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      int s = rank [ i * M + j ] ;
      int y = s * s ;
      res += Math . abs ( y - i ) ;
      xs . add ( x ) ;
    }
    xs = new ArrayList < Integer > ( xs ) ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      res += Math . abs ( xs . get ( j ) - j ) ;
    }
  }
  System . out . println ( res ) ;
}
