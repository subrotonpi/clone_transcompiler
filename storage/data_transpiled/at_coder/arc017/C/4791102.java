static final int [ ] binarySearch ( int N , int T ) {
  int [ ] L = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) L [ i ] = Integer . parseInt ( input ( ) ) ;
  List < Integer > zen = new ArrayList < Integer > ( ) ;
  {
    int X , n ;
    int [ ] STR ;
    int N = 2 ;
    int [ ] P = new int [ N ] ;
    int [ ] Q = new int [ N ] ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < N / 2 ;
    i ++ ) P [ i ] = L [ i ] ;
    for ( int j = N / 2 ;
    j < N ;
    j ++ ) Q [ j ] = L [ j ] ;
    if ( N % 2 == 0 ) {
      for ( int X = 0 ;
      X < n * ( N / 2 ) ;
      X ++ ) {
        STR = Base_10_to_n ( X , n ) . zfill ( N / 2 ) ;
        int cur = 0 ;
        for ( int i = 0 ;
        i < N / 2 ;
        i ++ ) if ( STR [ i ] == '1' ) cur += P [ i ] ;
        zen . add ( cur ) ;
      }
    }
    zen . sort ( ) ;
    for ( int X = 0 ;
    X < n * ( N / 2 ) ;
    X ++ ) {
      STR = Base_10_to_n ( X , n ) . zfill ( N / 2 ) ;
      int sub = 0 ;
      for ( int i = 0 ;
      i < N / 2 ;
      i ++ ) if ( STR [ i ] == '1' ) sub += Q [ i ] ;
      int k = binarySearch ( zen , T - sub ) ;
      int l = binarySearch ( zen , T - sub ) ;
      ans += l - k ;
    }
  }
  else {
    for ( int X = 0 ;
    X < n * ( N / 2 ) ;
    X ++ ) {
      STR = Base_10_to_n ( X , n ) . zfill ( N / 2 ) ;
      int cur = 0 ;
      for ( int i = 0 ;
      i < N / 2 ;
      i ++ ) if ( STR [ i ] == '1' ) cur += P [ i ] ;
      zen . add ( cur ) ;
    }
    zen . sort ( ) ;
    for ( int X = 0 ;
    X < n * ( N / 2 + 1 ) ;
    X ++ ) {
      STR = Base_10_to_n ( X , n ) . zfill ( N