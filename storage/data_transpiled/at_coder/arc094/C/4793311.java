public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  int temp = 10 * 10 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . substring ( 0 , i ) ) ;
    b [ i ] = Integer . parseInt ( input . substring ( i + 1 , i + 1 ) ) ;
    if ( a [ i ] > b [ i ] ) {
      temp = Math . min ( temp , b [ i ] ) ;
    }
  }
  if ( temp == 10 * 10 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( Arrays . toString ( a ) - temp ) ;
  }
}
