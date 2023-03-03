public static boolean isPrime ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  /*for (int i=2; i++) {
  if (i*i>n) break;
  if (n%i==0) return false;
  }*/
  return n != 1 ;
  int res = 0 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    res += i ;
  }
  if ( isPrime ( res ) ) {
    System . out . println ( "WANWAN" ) ;
  }
  else {
    System . out . println ( "BOWWOW" ) ;
  }
  return true ;
}
