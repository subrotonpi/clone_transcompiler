@ Sys public static void solve ( int tc ) throws Exception {
  int c = Integer . parseInt ( stdin . readLine ( ) ) ;
  int d = Integer . parseInt ( stdin . readLine ( ) ) ;
  int v = Integer . parseInt ( stdin . readLine ( ) ) ;
  List < Integer > coins = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < d ;
  i ++ ) {
    coins . add ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
  }
  int current = 0 ;
  int result = 0 ;
  for ( int i = 0 ;
  i < v ;
  i ++ ) {
    int coin = coins . get ( i ) ;
    while ( current + 1 < coin && current < v ) {
      result ++ ;
      current += ( current + 1 ) * c ;
    }
    if ( current + 1 >= coin ) {
      current += coin * c ;
    }
  }
  while ( current < v ) {
    current += ( current + 1 ) * c ;
    result ++ ;
  }
  System . out . println ( "Case #" + tc + ": " + result ) ;
}
