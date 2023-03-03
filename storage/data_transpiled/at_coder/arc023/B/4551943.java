static final int [ ] getNegativeInstances ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean even = ( D % 2 == 0 ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    List < Integer > l = new LinkedList < Integer > ( ) ;
    for ( int j = 0 ;
    j < l . size ( ) ;
    j ++ ) {
      if ( i + j <= D ) {
        if ( even ) {
          if ( ( i + j ) % 2 == 0 ) ans = Math . max ( ans , l . get ( j ) ) ;
        }
      }
      else {
        if ( ( i + j ) % 2 == 1 ) ans = Math . max ( ans , l . get ( j ) ) ;
      }
    }
    else {
      break ;
    }
  }
  System . out . println ( ans ) ;
  return l ;
}
