public static int [ ] solve ( int h , int w ) {
  int [ ] result = new int [ h ] ;
  int [ ] a = new int [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) {
    a [ i ] = i ;
  }
  {
    if ( a [ i ] % 2 == 0 || b [ i ] % 2 == 0 ) {
      result [ i ] = a [ i ] * b [ i ] / 2 ;
    }
  }
  {
    result [ i ] = Math . min ( a [ i ] , b [ i ] ) * ( Math . max ( a [ i ] , b [ i ] ) / 2 ) ;
  }
  {
    result [ i ] = Math . min ( a [ i ] , b [ i ] ) * ( 1 + Math . max ( a [ i ] , b [ i ] ) / 2 ) ;
  }
}
