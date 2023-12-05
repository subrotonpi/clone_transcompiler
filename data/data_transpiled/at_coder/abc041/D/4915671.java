public static int [ ] readInput ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] fastRabbit = new int [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int y = Integer . parseInt ( input . readLine ( ) ) ;
    fastRabbit [ y - 1 ] += 1 << ( x - 1 ) ;
  }
  int bitMax = 1 << N ;
  int [ ] dp = new int [ bitMax ] ;
  dp [ 0 ] = 1 ;
  for ( int bitSet = 0 ;
  bitSet < bitMax ;
  bitSet ++ ) {
    for ( int rabbitNum = 0 ;
    rabbitNum < N ;
    rabbitNum ++ ) {
      int rabbit = 1 << rabbitNum ;
      if ( ( bitSet & rabbit ) != 0 ) {
        int others = bitSet - rabbit ;
        if ( fastRabbit [ rabbitNum ] & others == fastRabbit [ rabbitNum ] ) {
          dp [ bitSet ] += dp [ bitSet - rabbitNum ] ;
        }
      }
    }
  }
  System . out . println ( dp [ bitMax - 1 ] ) ;
  return dp ;
}
