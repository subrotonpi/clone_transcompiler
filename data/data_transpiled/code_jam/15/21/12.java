static final int [ ] solve ( int [ ] input ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int tc = Integer . parseInt ( input [ 0 ] ) ;
  int maxN = 1000 ;
  int [ ] bests = new int [ maxN + 1 ] ;
  Arrays . fill ( bests , null ) ;
  bests [ 1 ] = 1 ;
  for ( int N = 2 ;
  N <= maxN ;
  N ++ ) {
    String strN = Integer . toString ( N ) ;
    int revN = Integer . parseInt ( new String ( strN ) ) ;
    if ( revN < N && strN . charAt ( strN . length ( ) - 1 ) != '0' ) {
      bests [ N ] = Math . min ( bests [ N - 1 ] , bests [ revN ] ) + 1 ;
    }
    else {
      bests [ N ] = bests [ N - 1 ] + 1 ;
    }
  }
  final int [ ] cache = new int [ tc ] ;
  {
    if ( N <= maxN ) return bests [ N ] ;
    if ( cache [ N ] >= 0 ) return cache [ N ] ;
    if ( N % 10 == 0 ) return 1 + walk ( input [ 0 ] - 1 ) ;
    int d = 1 ;
    int ten = 10 ;
    while ( ten < input [ 0 ] ) {
      d ++ ;
      ten *= 10 ;
    }
    int t = 10 * ( d - 1 ) - 1 ;
    int res_t = walk ( t ) ;
    int res = input [ 0 ] - t + res_t ;
    ten = 1 ;
    while ( ten < input [ 0 ] ) {
      int target = ( input [ 0 ] / ten ) * ten + 1 ;
      if ( target <= input [ 1 ] ) {
        int revTarget = Integer . parseInt ( new String ( new String ( new char [ ] {
          String . valueOf ( target ) }
          ) ) ) ;
          res = Math . min ( res , res_t + input [ 1 ] - target + 1 + revTarget - t ) ;
        }
        ten *= 10 ;
      }
      cache [ N ] = res ;
      return cache ;
    }
  }
  