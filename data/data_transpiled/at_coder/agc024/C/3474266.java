public static int [ ] getA ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( A [ 0 ] != 0 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    int flag = 0 ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      if ( A [ i ] - A [ i - 1 ] > 1 ) {
        flag = 1 ;
        break ;
      }
    }
    if ( flag == 1 ) {
      System . out . println ( - 1 ) ;
    }
    else {
      int ans = 0 ;
      for ( int i = 1 ;
      i < N ;
      i ++ ) {
        if ( A [ i - 1 ] + 1 == A [ i ] ) {
          ans ++ ;
        }
        else {
          ans += A [ i ] ;
        }
      }
      System . out . println ( ans ) ;
    }
  }
  return A ;
}
