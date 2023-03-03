public static int [ ] bitSum ( int N ) {
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  List < Integer > order = new ArrayList < Integer > ( Arrays . asList ( B ) ) ;
  Collections . sort ( order ) ;
  final int MAX = N + 2 ;
  int [ ] bit = new int [ MAX + 2 ] ;
  {
    int x = 0 ;
    while ( x <= MAX ) {
      bit [ x ] += w ;
      x += ( x & - x ) ;
    }
  }
  {
    int x = 0 ;
    int ret = 0 ;
    while ( x > 0 ) {
      ret += bit [ x ] ;
      x -= ( x & - x ) ;
    }
    return ret ;
  }
  {
    int [ ] bitRangeSum ( int l , int r ) {
      return bitSum ( r ) - bitRangeSum ( l ) ;
    }
  }
  ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    bitAdd ( i , 1 ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += Math . min ( bitRangeSum ( 0 , i ) , bitRangeSum ( i + 1 , N ) ) ;
    bitAdd ( i + 1 , - 1 ) ;
  }
  System . out . println ( ans ) ;
  return bits ;
}
