static final int factorial ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  int inf = ( 10 * * 9 ) + 7 ;
  if ( Math . abs ( N - M ) == 0 ) {
    ans = 2 * Math . factorial ( N ) * Math . factorial ( M ) ;
  }
  else {
    ans = 0 ;
  }
  System . out . println ( ans % inf ) ;
  return ans ;
}
