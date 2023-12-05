public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] n = Lists . newArrayList ( ) ;
  for ( int i = Math . min ( n . length - 1 , Math . max ( n . length + 1 , N ) ) ;
  i < N ;
  i ++ ) {
    n [ i ] = i ;
  }
  ArrayList < Integer > costlist = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cost = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      cost += ( n [ j ] - i ) * ( n [ j ] - i ) ;
    }
    costlist . add ( cost ) ;
  }
  int ans = Math . min ( costlist . size ( ) , N ) ;
  System . out . println ( ans ) ;
  return ans ;
}
