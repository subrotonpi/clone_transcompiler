@ VisibleForTesting static void solve ( int x , int count ) {
  int A = Integer . parseInt ( input ( ) ) ;
  int B = Integer . parseInt ( input ( ) ) ;
  int mod = Integer . parseInt ( input ( ) ) ;
  int g = gcd ( A , B ) ;
  /* matmul */
  for ( int [ ] _a1 : Arrays . asList ( a1 ) ) {
    for ( int k = 0 ;
    k < _a1 [ 0 ] . length ;
    k ++ ) {
      for ( int j = 0 ;
      j < _a2 [ 0 ] . length ;
      j ++ ) {
        int [ ] _a2 [ k ] = _a1 [ k ] [ j ] ;
        for ( int k = 0 ;
        k < _a2 [ 0 ] . length ;
        k ++ ) {
          _a2 [ k ] [ j ] = _a1 [ k ] [ j ] ;
        }
      }
    }
  }
  /* solve */
  int [ ] [ ] a = new int [ ] [ ] {
    {
      1 , 0 }
      , {
        0 , 1 }
      }
      ;
      int [ ] [ ] _a = new int [ ] [ ] {
        {
          x , 1 }
          , {
            0 , 1 }
          }
          ;
          while ( count > 0 ) {
            if ( count & 1 ) {
              a = matmul ( a , _a ) ;
            }
            _a = matmul ( _a , _a ) ;
            count >>= 1 ;
          }
          System . out . println ( solve ( 10 , A ) * solve ( pow ( 10 , g , mod ) , B / g ) % mod ) ;
        }
        