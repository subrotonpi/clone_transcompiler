static final int [ ] getZero ( ) {
  int [ ] s = new int [ input . length ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) s [ i ] = ( int ) input . charAt ( i ) ;
  int [ ] array = new int [ s . length ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) array [ i ] = s [ i ] ;
  int zero = 0 ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) zero = array [ i ] == 0 ;
  int one = array [ i ] == 1 ;
  System . out . println ( 2 * Math . min ( zero , one ) ) ;
}
