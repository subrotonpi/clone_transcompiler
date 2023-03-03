private static int BT ( int t ) {
  if ( memo [ t ] != - 1 ) return memo [ t ] ;
  if ( t == ( 1 << N ) - 1 ) {
    memo [ t ] = new int [ N ] ;
    return new int [ N ] ;
  }
  int [ ] k = new int [ 201 ] ;
  for ( int x = 0 ;
  x < IK ;
  x ++ ) k [ x ] = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) if ( ( t >> i & 1 ) == 1 ) {
    k [ T [ i ] ] -- ;
    for ( int x = 0 ;
    x < K [ i ] ;
    x ++ ) k [ x ] ++ ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) if ( ( t >> i & 1 ) == 0 && k [ T [ i ] ] > 0 ) {
    int a = BT ( t | 1 << i ) ;
    if ( a != 0 ) {
      memo [ t ] = new int [ N ] ;
      memo [ t ] = new int [ N ] ;
      memo [ t ] = new int [ N ] ;
      memo [ t ] = new int [ N ] ;
      memo [ t ] = new int [ N ] ;
      memo [ t ] = new int [ N ] ;
      for ( int x = 0 ;
      x < N ;
      x ++ ) {
        T [ x ] = Integer . parseInt ( readLine ( ) ) ;
        K [ x ] = Integer . parseInt ( readLine ( ) ) ;
      }
    }
  }
  memo [ t ] = 0 ;
  return 0 ;
}
for ( int test = 0 ;
test < input . nextInt ( ) ;
test ++ ) {
  int [ ] K = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] IK = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] T = new int [ N ] ;
  K = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T [ i ] = Integer . parseInt ( readLine ( ) ) ;
    K [ i ] = Integer . parseInt ( readLine ( ) ) ;
  }
  memo [ t ] = - 1 ;
  int a = BT ( 0 ) ;
  String ans ;
  if ( a == 0 ) ans = "IMPOSSIBLE" ;
  else ans = Arrays . toString ( a ) ;
  System . out . println (