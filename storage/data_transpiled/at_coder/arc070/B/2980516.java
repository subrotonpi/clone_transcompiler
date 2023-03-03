static int solve ( int k , List < Integer > aaa ) {
  aaa = aaa . subList ( 0 , Math . min ( k , aaa . size ( ) ) ) ;
  boolean [ ] dp = new boolean [ k ] ;
  Arrays . fill ( dp , true ) ;
  int curr_max = 0 ;
  int ans = aaa . size ( ) ;
  for ( int i = 0 ;
  i < ans ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( curr_max + a >= k ) ans = i ;
    boolean f = true ;
    for ( int j = Math . min ( curr_max , k - a - 1 ) ;
    j >= 0 ;
    j -- ) {
      if ( dp [ j ] ) {
        dp [ j + a ] = true ;
        if ( f ) {
          curr_max = Math . max ( curr_max , j + a ) ;
          f = false ;
        }
      }
    }
  }
  return ans ;
}
