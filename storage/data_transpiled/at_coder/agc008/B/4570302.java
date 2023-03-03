public static void input ( Scanner in ) {
  int N = in . nextInt ( ) , K = in . nextInt ( ) ;
  int [ ] A = in . nextInt ( ) ;
  int [ ] plusminus = new int [ A . length ] ;
  int [ ] plusor0 = new int [ A . length ] ;
  plusminus [ 0 ] = A [ 0 ] ;
  plusor0 [ 0 ] = Math . max ( 0 , A [ 0 ] ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    plusminus [ i ] = plusminus [ i - 1 ] + A [ i ] ;
    plusor0 [ i ] = plusor0 [ i - 1 ] + Math . max ( 0 , A [ i ] ) ;
  }
  plusminus [ 0 ] = 0 ;
  plusor0 [ 0 ] = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N - K + 1 ;
  i ++ ) {
    int s = plusminus [ i + K ] - plusminus [ i ] ;
    if ( i == 0 ) s += plusor0 [ N ] - plusor0 [ K ] ;
    else if ( i == N - K ) s += plusor0 [ N - K ] ;
    else s += plusor0 [ i ] + plusor0 [ N ] - plusor0 [ i + K ] ;
    if ( ans <= s ) ans = s ;
  }
  for ( int i = 0 ;
  i < N - K + 1 ;
  i ++ ) {
    int s = 0 ;
    if ( i == 0 ) s += plusor0 [ N ] - plusor0 [ K ] ;
    else if ( i == N - K ) s += plusor0 [ N - K ] ;
    else s += plusor0 [ i ] + plusor0 [ N ] - plusor0 [ i + K ] ;
    if ( ans <= s ) ans = s ;
  }
  System . out . println ( ans ) ;
}
