public static int size ( ) {
  String s = input ( ) ;
  int n = Integer . parseInt ( input ( ) ) ;
  int ans ;
  if ( s . length ( ) >= n ) {
    String [ ] a = new String [ s . length ( ) - n + 1 ] ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) a [ i ] = s . substring ( i , i + n ) ;
    ans = new HashSet ( a ) . size ( ) ;
  }
  else {
    ans = 0 ;
  }
  return ans ;
}
