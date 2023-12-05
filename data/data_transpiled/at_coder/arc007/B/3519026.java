private static void print ( String input ) {
  int n = Integer . parseInt ( input . substring ( 0 , 1 ) ) ;
  int m = Integer . parseInt ( input . substring ( 1 , n ) ) ;
  Map < Integer , Integer > map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    map . put ( i , i ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int disk = Integer . parseInt ( input . substring ( 0 , i ) ) ;
    int pos = map . keySet ( ) . stream ( ) . filter ( k -> k == 0 ) . findFirst ( ) . get ( ) ;
    map . put ( disk , map . get ( pos ) ) ;
  }
  for ( Map . Entry < Integer , Integer > entry : map . entrySet ( ) ) {
    System . out . println ( entry . getKey ( ) ) ;
  }
}
