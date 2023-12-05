public static int N ( int x ) {
  int [ ] candies = new int [ N ] ;
  for ( int i = 0 ;
  i < x ;
  i ++ ) {
    candies [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int count = 0 ;
  for ( int i = 0 ;
  i < candies . length ;
  i ++ ) {
    if ( i == 0 ) {
      if ( candies [ i ] > x ) {
        count += candies [ i ] - x ;
        candies [ i ] = x ;
      }
    }
    else {
      if ( candies [ i - 1 ] + candies [ i ] > x ) {
        count += candies [ i - 1 ] + candies [ i ] - x ;
        candies [ i ] = candies [ i ] - ( candies [ i - 1 ] + candies [ i ] - x ) ;
      }
    }
  }
  System . out . println ( count ) ;
  return count ;
}
