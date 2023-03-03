@ Sys public static void solve ( int T , int N , String P ) {
  int [ ] count = new int [ N ] ;
  StringBuffer result = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    count [ i ] = Integer . parseInt ( P . substring ( i , i + 1 ) ) ;
  }
  while ( count . length > 0 ) {
    boolean maxBool = ( count == count . max ( ) ) ;
    int [ ] maxIndex = ArrayHelper . getSortedIntArray ( N ) ;
    if ( maxBool . length != 2 ) {
      maxIndex = new int [ ] {
        maxIndex [ 0 ] }
        ;
      }
      for ( int index : maxIndex ) {
        result . append ( ( char ) ( 'A' + index ) ) ;
      }
      result . append ( ' ' ) ;
      count [ maxIndex . length ] -- ;
    }
    System . out . println ( "Case #" + ( T + 1 ) + ": " + result ) ;
    int cases = Integer . parseInt ( readLine ( ) ) ;
    for ( int T : xrange ( cases ) ) {
      N = Integer . parseInt ( readLine ( ) ) ;
      String [ ] P = readLine ( ) . split ( " " ) ;
      solve ( T , N , P ) ;
    }
  }
  