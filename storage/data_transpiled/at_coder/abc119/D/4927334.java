static final int [ ] binarySearch ( int x , int y , int z , int a , int b , int q ) {
  Scanner input = new Scanner ( System . in ) ;
  int a = input . nextInt ( ) ;
  int b = input . nextInt ( ) ;
  int q = input . nextInt ( ) ;
  final double INF = Double . POSITIVE_INFINITY ;
  int [ ] S = new int [ a ] ;
  int [ ] T = new int [ b ] ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) S [ i ] = - INF ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) T [ i ] = - INF ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) T [ i ] = INF ;
  {
    int res = INF ;
    int s = Arrays . binarySearch ( S , x ) ;
    for ( int i = 0 ;
    i < 2 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 2 ;
      j ++ ) {
        int t = Arrays . binarySearch ( T , S [ s - i ] ) ;
        int ans = Math . abs ( x - S [ s - i ] ) + Math . abs ( S [ s - i ] - T [ t - j ] ) ;
        if ( ans < res ) res = ans ;
      }
    }
  }
  return S ;
}
