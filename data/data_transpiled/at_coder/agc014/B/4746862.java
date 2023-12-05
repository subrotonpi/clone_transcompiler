private static int n = Integer . parseInt ( input ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , Integer > map = Maps . newHashMap ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    map . put ( i , 0 ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int [ ] a = map . get ( input . nextLine ( ) ) ;
    for ( int x : a ) {
      map . put ( x , 1 ) ;
      map . put ( x , 2 ) ;
    }
  }
  if ( CollectionUtils . isEmpty ( map . values ( ) ) ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
  return m ;
}
