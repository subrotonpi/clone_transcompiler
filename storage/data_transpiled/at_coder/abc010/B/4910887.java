public static void n ( ) {
  int [ ] flowers = new int [ input . nextInt ( ) ] ;
  for ( int i = 0 ;
  i < flowers . length ;
  i ++ ) {
    flowers [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i : flowers ) {
    while ( i % 2 == 0 || i % 3 == 2 ) {
      ans ++ ;
      i -- ;
    }
  }
  System . out . println ( ans ) ;
}
