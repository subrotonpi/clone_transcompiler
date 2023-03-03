static void print ( ) {
  final int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) , s = Integer . parseInt ( System . console ( ) . readLine ( ) ) , t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int w = 0 ;
  int ans = 0 ;
  for ( ;
  ;
  ) {
    int a = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    w += a ;
    if ( s <= w && w <= t ) ans ++ ;
  }
  System . out . println ( ans ) ;
}
