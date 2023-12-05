public static int N = Integer . parseInt ( input ) {
  String S = input ;
  int ans = 0 ;
  int key = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == 'I' ) key ++ ;
    else key -- ;
    ans = Math . max ( ans , key ) ;
  }
  return ans ;
}
