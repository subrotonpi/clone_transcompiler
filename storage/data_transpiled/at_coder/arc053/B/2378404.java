public static void input ( Scanner s ) {
  String [ ] lis = new String [ s . countMatches ( ) ] ;
  int [ ] num = new int [ s . countMatches ( ) ] ;
  int cou = 0 ;
  int even = 0 ;
  for ( int n = 0 ;
  n < s . countMatches ( ) ;
  n ++ ) {
    if ( lis [ n ] != null ) continue ;
    else {
      num [ n ] = s . countMatches ( ) ;
      lis [ n ] = s . substring ( n ) ;
    }
  }
  for ( int i = 0 ;
  i < num . length ;
  i ++ ) {
    cou += num [ i ] % 2 ;
    even += num [ i ] ;
  }
  even -= cou ;
  if ( cou == 0 ) System . out . println ( ( int ) s . countMatches ( ) ) ;
  else System . out . println ( ( int ) ( even / ( 2 * cou ) ) * 2 + 1 ) ;
}
