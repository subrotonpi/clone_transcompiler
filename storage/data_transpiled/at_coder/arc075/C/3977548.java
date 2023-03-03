@ VisibleForTesting static int [ ] [ ] bitSets ( int n , int k ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input ( ) ) - k ;
  int [ ] rui = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) rui [ i + 1 ] = rui [ i ] + a [ i ] ;
  final int [ ] [ ] press = new int [ n ] [ ] ;
  {
    int n = a . length ;
    Set < Integer > b = new HashSet < Integer > ( a ) ;
    int len = b . size ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) c [ i ] = Arrays . binarySearch ( b , a [ i ] ) ;
  }
  final Set < Integer > b = press ( rui ) ;
  final class BIT {
    int _node ;
    int index ;
    public int [ ] bit = new int [ n + 1 ] ;
    @ Override public void add ( int index , int addVal ) {
      while ( index < _node ) {
        bit [ index ] += addVal ;
        index += index & - index ;
      }
    }
  }
  ;
  bit = new BIT ( n + 2 ) ;
  int ans = 0 ;
  for ( int i : c ) {
    ans += bit . sum ( i + 1 ) ;
    bit . add ( i + 1 , 1 ) ;
  }
  System . out . println ( ans ) ;
  return b ;
}
