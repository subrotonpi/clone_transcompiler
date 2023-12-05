public static int N = Integer . parseInt ( input ) {
  StringBuilder src = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    src . append ( new String ( input ) ) . append ( "." ) ;
  }
  int remain = src . length ( ) ;
  int ans = 0 ;
  int now = 0 ;
  while ( remain > 0 ) {
    while ( src . charAt ( now ) == 'o' ) now ++ ;
    ans ++ ;
    remain -= src . substring ( now , now + N + 1 ) . length ( ) ;
    now += N + 1 ;
  }
  return ans ;
}
