public static int n = Integer . parseInt ( input ) {
  List < Integer > slime = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    slime . add ( i ) ;
  }
  int stack = 0 ;
  int count = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < slime . size ( ) ;
  i ++ ) {
    if ( i != stack ) {
      stack = i ;
      ans += ( ( count + 1 ) / 2 ) ;
      count = 0 ;
      continue ;
    }
    count ++ ;
    stack = i ;
  }
  ans += ( ( count + 1 ) / 2 ) ;
  return ans ;
}
