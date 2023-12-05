public static void print ( String s ) {
  s = input . nextLine ( ) ;
  int [ ] cnt = new int [ 26 ] ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    s . charAt ( i ) - 97 ++ ;
  }
  int a = 0 ;
  int b = 0 ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    a += cnt [ i ] % 2 ;
    b += cnt [ i ] / 2 ;
  }
  if ( a > 0 ) {
    int res = 1 ;
    res += ( b / a ) * 2 ;
    System . out . println ( res ) ;
  }
  else {
    System . out . println ( s . length ( ) ) ;
  }
}
