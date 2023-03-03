public static void main ( String [ ] args ) {
  String s = input ( ) ;
  int n = s . length ( ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    char cur = s . charAt ( i - 1 ) ;
    int upper ;
    if ( cur == 'U' ) upper = 1 ;
    else upper = 2 ;
    ans += ( n - i ) * upper ;
    int lower ;
    if ( cur == 'U' ) lower = 2 ;
    else lower = 1 ;
    ans += ( i - 1 ) * lower ;
  }
  System . out . println ( ans ) ;
  if ( getClass ( ) . isClassPresent ( Main . class ) ) {
    Main . main ( ) ;
  }
}
