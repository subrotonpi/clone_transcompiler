static final Map < Integer , Integer > AA = new HashMap < Integer , Integer > ( ) {
  private int [ ] [ ] a ;
  private int [ ] [ ] a ;
  private int [ ] [ ] b ;
  {
    int [ ] [ ] c = new int [ R ] [ C ] ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      c [ i ] = new int [ R ] ;
      for ( int j = 0 ;
      j < C ;
      j ++ ) {
        c [ i ] [ j ] = 0 ;
      }
      for ( int j = 0 ;
      j < C ;
      j ++ ) {
        int x = AA [ new Integer ( i ) ] [ R ] ;
        int y = AA [ new Integer ( j ) ] [ C ] ;
        int res = 0 ;
        for ( int i = 0 ;
        i < n ;
        i ++ ) {
          res += foo2 ( a , i , R , C ) ;
        }
        return res ;
      }
    }
    private int [ ] [ ] b = new int [ R ] [ C ] ;
    {
      for ( int i = 0 ;
      i < R ;
      i ++ ) {
        b [ i ] = new int [ C ] ;
      }
      int t = 0 ;
      while ( n > 0 ) {
        b [ t / C ] [ t % C ] = n % 2 ;
        n /= 2 ;
        t ++ ;
      }
      return foo3 ( a , b , R , C ) ;
    }
    private int fix ( int i , int j , int R , int C ) {
      if ( i == - 1 ) i = R - 1 ;
      if ( i == R ) i = 0 ;
      if ( j == - 1 ) j = C - 1 ;
      if ( j == C ) j = 0 ;
      return ( i ) ;
    }
    private int [ ] [ ] init ( ) ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      for ( int j = 0 ;
      j < C ;
      j ++ ) {
        int t = a [ i ] [ j ] ;
        switch ( t ) {
          case '|' : AA [ new Integer ( i ) ] [ R ] = fix ( i - 1 , j , R , C ) ;
          AA [ new Integer ( j ) ] [ R ] = fix ( i + 1 , j , R , C ) ;
          break ;
          case '-' : AA [ new Integer ( i ) ] [ R ] = fix ( i - 1 , j + 1 , R , C ) ;
          AA [ new