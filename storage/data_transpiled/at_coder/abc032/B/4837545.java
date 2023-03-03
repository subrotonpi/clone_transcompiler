public static int input ( ) {
  String s = input ( ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  Map < String , Integer > dict = new HashMap < String , Integer > ( ) ;
  for ( int l = 0 ;
  l < s . length ( ) ;
  l ++ ) {
    for ( int r = l + 1 ;
    r <= s . length ( ) ;
    r ++ ) {
      if ( ( r - l ) != k ) continue ;
      dict . put ( s . substring ( l , r ) , 1 ) ;
    }
  }
  int ans = dict . size ( ) ;
  System . out . println ( ans ) ;
  return ans ;
}
