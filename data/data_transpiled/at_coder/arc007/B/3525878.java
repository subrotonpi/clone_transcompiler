public static String bCdCase ( int N , int M , int [ ] Disk ) {
  StringBuilder ans = new StringBuilder ( N + 1 ) ;
  for ( int d : Disk ) {
    ans . delete ( ans . indexOf ( d ) , ans . length ( ) ) ;
    ans . delete ( ans . indexOf ( d ) , ans . length ( ) ) ;
  }
  ans . delete ( ) ;
  return ans . toString ( ) ;
}
