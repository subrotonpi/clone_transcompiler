public static int [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( a [ 2 ] == 0 ) {
    int l = 1 ;
    int count = 0 ;
    while ( true ) {
      if ( l == 2 ) {
        System . out . println ( count ) ;
        break ;
      }
      else if ( a [ l - 1 ] == 0 ) {
        System . out . println ( - 1 ) ;
        break ;
      }
      int temp = l - 1 ;
      l = a [ l - 1 ] ;
      a [ temp ] = 0 ;
      count ++ ;
    }
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return a ;
}
