public static void main ( String [ ] args ) {
  Scanner buf = new Scanner ( System . in ) ;
  String [ ] bufArray = buf . nextLine ( ) . split ( " " ) ;
  int N = Integer . parseInt ( bufArray [ 0 ] ) ;
  int T = Integer . parseInt ( bufArray [ 1 ] ) ;
  buf = new Scanner ( System . in ) ;
  bufArray = buf . nextLine ( ) . split ( " " ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( bufArray [ i ] ) ;
  }
  int minPrice = A [ 0 ] ;
  int maxPriceDiff = 0 ;
  int maxDiffCount = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( A [ i ] < minPrice ) {
      minPrice = A [ i ] ;
    }
    else if ( A [ i ] - minPrice > maxPriceDiff ) {
      maxPriceDiff = A [ i ] - minPrice ;
      maxDiffCount = 1 ;
    }
    else if ( A [ i ] - minPrice == maxPriceDiff ) {
      maxDiffCount ++ ;
    }
  }
  System . out . println ( maxDiffCount ) ;
}
