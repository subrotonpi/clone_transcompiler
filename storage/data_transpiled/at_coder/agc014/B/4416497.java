private static String input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) , m = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] p = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    p [ i ] = i ;
  }
  String ans = "YES" ;
  for ( int i = 0 ;
  i < p . length ;
  i ++ ) {
    if ( i % 2 == 1 ) ans = "NO" ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
