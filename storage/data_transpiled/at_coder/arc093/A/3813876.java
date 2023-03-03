public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( A ) ;
  int [ ] result = new int [ N + 1 ] ;
  result [ 0 ] = 0 ;
  int defaultCost = 0 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    defaultCost += ( Math . abs ( A [ i + 1 ] - A [ i ] ) ) ;
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int cost = defaultCost - Math . abs ( A [ i + 1 ] - A [ i ] ) - Math . abs ( A [ i ] - A [ i - 1 ] ) + Math . abs ( A [ i + 1 ] - A [ i - 1 ] ) ;
    System . out . println ( cost ) ;
  }
}
