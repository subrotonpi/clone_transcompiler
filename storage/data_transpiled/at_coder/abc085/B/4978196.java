public static int N = Integer . parseInt ( input ) {
  int [ ] di = new int [ N ] ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) di [ n ] = Integer . parseInt ( input ) ;
  int ans = 0 ;
  ans = new HashSet ( di ) . size ( ) ;
  System . out . println ( ans ) ;
  return ans ;
}
