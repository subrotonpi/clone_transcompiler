public static void print ( int n ) {
  String s = Integer . toBinaryString ( n ) ;
  int cnt = 0 ;
  int [ ] ls = new int [ s . length ( ) ] ;
  for ( int i = s . length ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    if ( s . charAt ( i ) == '1' ) {
      cnt ++ ;
      ls [ i ] = ( 2 * ( s . length ( ) - 1 - i ) ) ;
    }
  }
  System . out . println ( cnt ) ;
  for ( int i = 0 ;
  i < cnt ;
  i ++ ) {
    System . out . println ( ls [ i ] ) ;
  }
}
