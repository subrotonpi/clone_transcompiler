static final String calc ( String [ ] a , int i , int j , int n ) {
  int dx = a [ j ] . charAt ( 0 ) - a [ i ] . charAt ( 0 ) ;
  return a [ j ] . charAt ( 0 ) + Math . min ( dx , a [ j ] . charAt ( 1 ) ) ;
}
