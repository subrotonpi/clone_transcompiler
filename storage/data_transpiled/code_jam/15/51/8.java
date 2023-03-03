static final int [ ] getStdOut ( ) {
  final int tc = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int tmpTC : xrange ( tc ) ) {
    Arrays . fill ( N , Integer . MAX_VALUE ) ;
    Arrays . fill ( D , Integer . MAX_VALUE ) ;
    Arrays . fill ( S0 , Integer . MAX_VALUE ) ;
    Arrays . fill ( AS , Integer . MAX_VALUE ) ;
    Arrays . fill ( CS , Integer . MAX_VALUE ) ;
    Arrays . fill ( RS , Integer . MAX_VALUE ) ;
    Arrays . fill ( M0 , Integer . MAX_VALUE ) ;
    Arrays . fill ( AM , Integer . MAX_VALUE ) ;
    Arrays . fill ( CM , Integer . MAX_VALUE ) ;
    Arrays . fill ( RM , Integer . MAX_VALUE ) ;
    int currentS = S0 , currentM = M0 ;
    int [ ] S = new int [ N ] , M = new int [ N ] ;
    Map < Integer , Integer > edges = new HashMap < Integer , Integer > ( ) ;
    for ( int i : xrange ( 1 , N ) ) {
      currentS = ( currentS * AS + CS ) % RS ;
      currentM = ( currentM * AM + CM ) % RM ;
      S [ i ] = currentS ;
      M [ i ] = currentM [ i ] % i ;
      edges . put ( currentM % i , edges . getOrDefault ( currentM % i , Integer . MAX_VALUE ) + i ) ;
    }
    final int [ ] cnt = new int [ N ] ;
    {
      int res = 1 ;
      for ( int n : edges . getOrDefault ( n , Integer . MAX_VALUE ) ) {
        res += collectCnt ( n ) ;
      }
      cnt [ n ] = res ;
    }
  }
  {
    int res = 0 ;
    for ( int n : xrange ( 0 , N ) ) {
      if ( S [ n ] < minS || S [ n ] > maxS ) return cnt [ n ] ;
      res = 0 ;
      for ( int n : edges . getOrDefault ( n , Integer . MAX_VALUE ) ) {
        res += walk ( n , minS , maxS ) ;
      }
    }
  }
  int res = 0 ;
  for ( int minS : xrange ( S0 - D , S0 + 1 ) ) {
    maxS = minS + D ;
    int tmp = walk ( 0 , minS , maxS ) ;
    if ( res == 0 || tmp < res ) res = tmp ;
  }
  res = N - res ;
  System . out . println ( "Case #" + ( ++ tmpTC )