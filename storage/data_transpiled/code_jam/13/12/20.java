static final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( int index = 1 ;
index <= T ;
index ++ ) {
  final int E = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int R = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int [ ] V = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    V [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  }
  final int [ ] ue = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ue [ i ] = E ;
  }
  final int [ ] le = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    le [ i ] = 0 ;
  }
  int ans = 0 ;
  while ( true ) {
    final int maxval = Collections . max ( V ) ;
    if ( maxval == 0 ) break ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( V [ i ] == maxval ) {
        ans += V [ i ] * ( ue [ i ] - le [ i ] ) ;
        V [ i ] = 0 ;
        for ( int j = i + 1 ;
        j < N ;
        j ++ ) {
          if ( V [ j ] == 0 ) break ;
          if ( R * ( j - i ) >= E ) break ;
          ue [ j ] = R * ( j - i ) ;
          le [ j ] = Math . min ( le [ j ] , ue [ j ] ) ;
        }
        for ( int j = i - 1 ;
        j >= 0 ;
        j -- ) {
          if ( V [ j ] == 0 ) break ;
          if ( ue [ i ] - R * ( i - j ) <= 0 ) break ;
          le [ j ] = ue [ i ] - R * ( i - j ) ;
        }
        break ;
      }
    }
  }
  System . out . println ( "Case #" + index + ": " + ans ) ;
  return ans ;
}
