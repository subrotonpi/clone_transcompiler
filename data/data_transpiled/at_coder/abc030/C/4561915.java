public static int [ ] solve ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  int i = 0 ;
  int j = 0 ;
  int ans = 0 ;
  int start_a = a [ i ] ;
  do {
    do {
      if ( b [ j ] < x + a [ i ] ) {
        j = j + 1 ;
        if ( j == m ) {
          System . out . println ( ans ) ;
          exit ( ) ;
        }
      }
      else {
        end_b = b [ j ] ;
        ans ++ ;
        break ;
      }
    }
    while ( end_b < end_b ) ;
  }
  while ( i < n ) ;
  return a ;
}
