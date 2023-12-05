@ Function public static void from ( ) {
  Map < Integer , Integer > map = new LinkedHashMap < > ( ) ;
  map . put ( 0 , 1 ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int ans = 0 ;
  int f = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    f = ( f + a [ i - 1 ] ) % m ;
    map . put ( f , 1 ) ;
  }
  for ( int i = 0 ;
  i < map . size ( ) ;
  i ++ ) {
    ans += map . get ( i ) * ( map . get ( i ) - 1 ) / 2 ;
  }
  System . out . println ( ans ) ;
}
