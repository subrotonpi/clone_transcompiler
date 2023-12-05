public static int N = Integer . parseInt ( input ) {
  int prev = 0 ;
  int ans = 0 ;
  boolean able = true ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int now = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( now - prev > 1 || ( i == 0 && now != 0 ) ) {
      System . out . println ( - 1 ) ;
      able = false ;
      break ;
    }
    else if ( now - prev == 1 ) {
      ans ++ ;
    }
    else if ( now > 0 ) {
      ans += now ;
    }
    prev = now ;
  }
  if ( able ) {
    System . out . println ( ans ) ;
  }
  return ans ;
}
