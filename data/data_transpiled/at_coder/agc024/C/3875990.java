public static int getN ( ) {
  int ans = 0 ;
  boolean bool1 = false ;
  int a0 = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == 1 ) {
    if ( a0 != 0 ) {
      System . out . println ( - 1 ) ;
    }
    else {
      System . out . println ( 0 ) ;
    }
  }
  else {
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      int a1 = Integer . parseInt ( input . nextLine ( ) ) ;
      if ( i == 0 && a0 != 0 ) {
        bool1 = true ;
        break ;
      }
      if ( a1 - a0 > 1 ) {
        bool1 = true ;
        break ;
      }
      else if ( a1 - a0 == 1 ) {
        a0 = a1 ;
        continue ;
      }
      else {
        ans += a0 ;
        a0 = a1 ;
      }
    }
    if ( bool1 == true ) {
      System . out . println ( - 1 ) ;
    }
    else {
      System . out . println ( ans + a1 ) ;
    }
  }
  return ans ;
}
