public static int solve ( int n , int [ ] aaa ) {
  int odd_idx [ ] = new int [ n ] , even_idx [ ] = new int [ n ] ;
  int odd_sum = 0 , even_sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i += 2 ) {
    if ( aaa [ i ] > 0 ) {
      even_idx [ i ] = i ;
      even_sum += aaa [ i ] ;
    }
  }
  for ( int i = 1 ;
  i < n ;
  i += 2 ) {
    if ( aaa [ i ] > 0 ) {
      odd_idx [ i ] = i ;
      odd_sum += aaa [ i ] ;
    }
  }
  int ans ;
  int idx [ ] = even_idx ;
  if ( odd_sum < even_sum ) {
    ans = even_sum ;
    idx = even_idx ;
  }
  else {
    ans = odd_sum ;
    idx = odd_idx ;
  }
  if ( ans == 0 ) {
    final int i = Integer . parseInt ( input . nextLine ( ) ) ;
    ans = aaa [ i ] ;
    buf = new LinkedList < Integer > ( ) ;
    buf . add ( 1 ) ;
    return ans ;
  }
  int j = idx [ idx . length - 1 ] ;
  buf = new LinkedList < Integer > ( ) ;
  for ( int i = idx [ j ] ;
  i < buf . size ( ) ;
  i ++ ) {
    buf . add ( 1 ) ;
  }
  return ans ;
}
