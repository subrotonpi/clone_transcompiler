static final int factorial ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Math . abs ( n - m ) > 1 ) System . out . println ( 0 ) ;
  exit ( ) ;
  int ans = ( int ) ( Math . factorial ( n ) * Math . factorial ( m ) ) ;
  return ans ;
}
