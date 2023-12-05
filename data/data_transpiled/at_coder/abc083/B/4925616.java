public static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int L = Integer . parseInt ( input . nextLine ( ) ) ;
    int count = 0 ;
    for ( int j = 0 ;
    j < L ;
    j ++ ) {
      count = count + Integer . parseInt ( input . nextLine ( ) ) ;
    }
    if ( A <= count && count <= B ) {
      ans += i ;
    }
    else {
      continue ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
