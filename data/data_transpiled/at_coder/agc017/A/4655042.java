public static int input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) , p = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] a = Integer . parseInt ( input . readLine ( ) ) ;
  int k = 0 ;
  for ( int a_ : a ) {
    if ( ! a_ % 2 == 0 ) {
      k = 1 ;
      break ;
    }
  }
  if ( k > 0 ) System . out . println ( 1 << ( n - 1 ) ) ;
  else System . out . println ( p == 1 ? 0 : 1 << n ) ;
  return n ;
}
