static final String getLines ( ) {
  String ls = System . console ( ) . readLine ( ) ;
  String L = "" ;
  Map < Integer , Integer > cache = new HashMap < > ( ) ;
  int a , b ;
  int ans ;
  if ( a + 1 == b ) {
    return 0 ;
  }
  if ( ( a = cache . containsKey ( new Integer ( a ) ) ) ) {
    return cache . get ( new Integer ( a ) ) ;
  }
  ans = 0 ;
  for ( int i = a + 1 ;
  i < b ;
  i += 2 ) {
    int x = L . charAt ( a ) == L . charAt ( i ) ? 10 : 5 ;
    ans = Math . max ( ans , x + f ( a + 1 , i ) + f ( i + 1 , b ) ) ;
  }
  cache . put ( new Integer ( a ) , ans ) ;
  return ans ;
}
