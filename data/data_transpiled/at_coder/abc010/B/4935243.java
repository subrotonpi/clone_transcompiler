public static int N = Integer . parseInt ( input ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    switch ( A [ i ] ) {
      case 2 : case 4 : case 8 : res ++ ;
      break ;
      case 5 : res += 2 ;
      break ;
      case 6 : res += 3 ;
      break ;
    }
  }
  System . out . println ( res ) ;
  return res ;
}
