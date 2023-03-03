static final int solve ( int i , int s , int k , int sign ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  final int len = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] A = new int [ len ] ;
  for ( int j = 0 ;
  j < len ;
  j ++ ) {
    A [ j ] = i ;
  }
  return solve ( i , s , k , sign * - 1 ) ;
}
