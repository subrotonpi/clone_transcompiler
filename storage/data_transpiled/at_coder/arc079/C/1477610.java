public static void check ( int [ ] _a ) {
  for ( int i = 0 ;
  i != _a . length ;
  ++ i ) {
    if ( N <= _a [ i ] ) {
      return ;
    }
  }
  else {
    return ;
  }
  if ( Class . forName ( "org.apache.commons.math.NumberUtils" ) . equals ( "NumberUtils" ) ) {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] a = new int [ N ] ;
    for ( int i = 0 ;
    i < a . length ;
    ++ i ) {
      a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    int [ ] divideNum = new int [ N ] ;
    for ( int i = 0 ;
    i < divideNum . length ;
    ++ i ) {
      divideNum [ i ] = 0 ;
    }
    int ans = 0 ;
    while ( check ( a ) ) {
      int sumNum = 0 ;
      for ( int i = 0 ;
      i != N ;
      ++ i ) {
        int tmp = a [ i ] / N ;
        divideNum [ i ] = tmp ;
        sumNum += tmp ;
        ans += tmp ;
      }
      a = new int [ N ] ;
      for ( int i = 0 ;
      i != N ;
      ++ i ) {
        a [ i ] = ( a [ i ] % N + sumNum - divideNum [ i ] ) ;
      }
    }
    System . out . println ( ans ) ;
  }
}
