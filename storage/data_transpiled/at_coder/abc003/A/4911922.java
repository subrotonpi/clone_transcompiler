public static long enter ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  long ans = 0 ;
  if ( n == 0 ) {
    System . out . println ( n ) ;
  }
  else if ( n != 0 ) {
    for ( int i = 0 ;
    i < n + 1 ;
    i ++ ) {
      ans += ( i * 10000 ) ;
    }
    ans = ans / n ;
    System . out . println ( ans ) ;
  }
  return ans ;
}
