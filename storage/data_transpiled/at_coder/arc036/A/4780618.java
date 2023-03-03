public static int n ( ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] sleeptime = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int time = Integer . parseInt ( input . nextLine ( ) ) ;
    sleeptime [ i ] = time ;
  }
  int ans = - 1 ;
  for ( int i = 0 ;
  i < n - 2 ;
  i ++ ) {
    if ( sleeptime [ i ] + sleeptime [ i + 1 ] + sleeptime [ i + 2 ] < k ) {
      ans = i + 3 ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
