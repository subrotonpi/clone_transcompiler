public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int [ ] x = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < x . length ;
  i ++ ) {
    x [ i ] = Math . min ( i , Math . abs ( k - x [ i ] ) * 2 ) ;
  }
  System . out . println ( sum ( x ) ) ;
}
