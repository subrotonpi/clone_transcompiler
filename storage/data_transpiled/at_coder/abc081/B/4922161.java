public static int N = Integer . parseInt ( input ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  boolean flag = false ;
  int ans = 0 ;
  while ( true ) {
    for ( int i = 0 ;
    i < A . length ;
    i ++ ) {
      int j = A [ i ] ;
      if ( j % 2 != 0 ) {
        System . out . println ( ans ) ;
        flag = true ;
        break ;
      }
      else {
        A [ i ] = j / 2 ;
      }
    }
    ans ++ ;
    if ( flag ) break ;
  }
  return ans ;
}
