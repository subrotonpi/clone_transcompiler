public static int [ ] getHoge ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] hoge = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    hoge [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  int punch = 1 ;
  while ( true ) {
    ans ++ ;
    punch = hoge [ punch - 1 ] ;
    if ( ( punch - 1 == 1 ) && ( punch == 1 ) ) {
      System . out . println ( ans ) ;
      break ;
    }
    if ( ( ans >= 100001 ) && ( punch == 1 ) ) {
      System . out . println ( - 1 ) ;
      break ;
    }
  }
  return hoge ;
}
