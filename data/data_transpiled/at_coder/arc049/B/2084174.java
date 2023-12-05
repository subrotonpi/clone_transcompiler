public static boolean binSearch ( int t ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ N ] ;
  int [ ] y = new int [ N ] ;
  int [ ] c = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    y [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    c [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final int INF = 10 * 9 ;
  {
    int mid ;
    int left = 0 ;
    int bottom = - INF ;
    int right = 0 ;
    int top = INF ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      left = Math . max ( left , x [ i ] - t / c [ i ] ) ;
      right = Math . min ( right , x [ i ] + t / c [ i ] ) ;
      top = Math . min ( top , y [ i ] + t / c [ i ] ) ;
      if ( bottom > top ) return false ;
    }
    return true ;
  }
}
