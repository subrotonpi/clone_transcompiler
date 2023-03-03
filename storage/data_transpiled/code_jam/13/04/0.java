static final int [ ] [ ] getKeys ( ) {
  final int timeit = 1 ;
  final int debugv = 0 ;
  {
    int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    for ( int i = 1 ;
    i <= T ;
    i ++ ) {
      doCase ( i ) ;
    }
  }
  {
    int K = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int [ ] keyArray = new int [ N ] ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) keyArray [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    if ( keyArray [ i ] != K ) throw new IllegalStateException ( "expected " + K + " keys but found " + keyArray . length ) ;
    Map < Integer , Integer > keys = new HashMap < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( keyArray [ i ] == 0 ) return keyArray [ i ] ;
    }
    if ( okay_to_open ( shut , keys , i ) ) {
      int [ ] newShut = new int [ N ] ;
      System . arraycopy ( keys , 0 , newShut , 0 , keys . length ) ;
      newShut [ i ] = i ;
      newShut [ i ] -= 1 ;
      for ( int k : chestContents [ i ] ) if ( ! k . equals ( k ) ) keys . put ( k , 0 ) ;
      newShut [ i ] += 1 ;
    }
    return keyArray ;
  }
}
