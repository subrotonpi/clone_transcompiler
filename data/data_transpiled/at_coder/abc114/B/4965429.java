public static int [ ] input ( ) {
  s = input ;
  int [ ] X = new int [ s . length ( ) ] ;
  for ( int i = 0 ;
  i <= s . length ( ) - 2 ;
  i ++ ) {
    int x = Math . abs ( 753 - ( int ) s . charAt ( i ) + s . charAt ( i + 1 ) + s . charAt ( i + 2 ) ) ;
    X [ i ] = x ;
  }
  System . out . println ( min ( X ) ) ;
  return X ;
}
