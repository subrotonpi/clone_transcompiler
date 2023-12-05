static final int [ ] binarySearch ( int n ) {
  class BITree {
    int [ ] tree = new int [ n + 1 ] ;
    int i ;
    public int query ( int i ) {
      int s = 0 ;
      while ( i > 0 ) {
        s = Math . max ( tree [ i ] , s ) ;
        i -= i & - i ;
      }
      return s ;
    }
    public int update ( int i , int x ) {
      while ( i <= size ) {
        tree [ i ] = Math . max ( tree [ i ] , x ) ;
        i += i & - i ;
      }
      return i ;
    }
  }
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int h = Integer . parseInt ( input ( ) ) ;
    int w = Integer . parseInt ( input ( ) ) ;
    X [ i ] = new int [ ] {
      h , - w }
      ;
    }
    Arrays . sort ( X ) ;
    int [ ] h0 = new int [ N ] ;
    int [ ] w0 = new int [ N ] ;
    for ( int i = 0 ;
    i < X . length ;
    i ++ ) {
      h0 [ i ] = X [ i ] [ 0 ] ;
    }
    int [ ] h1 = new int [ N ] ;
    Arrays . sort ( h0 ) ;
    int [ ] w1 = new int [ N ] ;
    Arrays . sort ( w0 ) ;
    h = new int [ N ] ;
    for ( int i = 0 ;
    i < h . length ;
    i ++ ) {
      w1 [ i ] = h [ i ] ;
    }
    int [ ] dp = new int [ N ] ;
    BITree bit = new BITree ( N ) ;
    for ( i = 0 ;
    i < N ;
    i ++ ) {
      dp [ i ] = bit . query ( w [ i ] - 1 ) + 1 ;
      bit . update ( w [ i ] , dp [ i ] ) ;
    }
    System . out . println ( max ( dp ) ) ;
  }
  