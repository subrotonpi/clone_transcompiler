public static int [ ] getN ( ) {
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l_list = new int [ D ] ;
  int [ ] r_list = new int [ D ] ;
  for ( int i = 0 ;
  i < D ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    l_list [ i ] = l ;
    r_list [ i ] = r ;
  }
  int [ ] ans = new int [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( s < t ) {
      for ( int j = 0 ;
      j < D ;
      j ++ ) {
        if ( l_list [ j ] <= s && s <= r_list [ j ] ) {
          s = r_list [ j ] ;
          if ( s >= t ) {
            ans [ i ] = j + 1 ;
            break ;
          }
        }
      }
    }
    else {
      for ( int j = 0 ;
      j < D ;
      j ++ ) {
        if ( l_list [ j ] <= s && s <= r_list [ j ] ) {
          s = l_list [ j ] ;
          if ( s <= t ) {
            ans [ i ] = j + 1 ;
            break ;
          }
        }
      }
    }
  }
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    System . out . println ( ans [ i ] ) ;
  }
  return ans ;
}
