public static void input ( ) {
  String s = input ( ) ;
  int n = s . length ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    char c = s . charAt ( i ) ;
    ans += n - 1 ;
    if ( c == 'U' ) {
      ans += i ;
    }
    else {
      ans += n - 1 - i ;
    }
  }
  System . out . println ( ans ) ;
}
