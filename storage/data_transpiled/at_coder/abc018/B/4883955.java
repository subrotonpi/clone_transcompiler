public static String input ( ) {
  String s = input ( ) ;
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] lr = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    lr [ i ] [ i ] = Integer . parseInt ( input ( ) ) - 1 ;
  }
  for ( int l = 0 , r = lr . length ;
  l < r ;
  l ++ ) {
    s = s . substring ( 0 , l ) + s . substring ( l , r + 1 ) . substring ( 0 , s . length ( ) - 1 ) + s . substring ( r + 1 ) ;
  }
  System . out . println ( s ) ;
  return s ;
}
