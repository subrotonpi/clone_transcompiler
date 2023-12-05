static final int solve ( int n , int k ) {
  final Map < Integer , Integer > intervals = new HashMap < > ( ) ;
  intervals . put ( n , 1 ) ;
  final List < Integer > lens = new ArrayList < > ( ) ;
  lens . add ( - n ) ;
  int ls = 0 ;
  int rs = 0 ;
  while ( k > 0 ) {
    final int val = - heapq ( lens ) ;
    final int num = intervals . get ( val ) ;
    lens . remove ( val ) ;
    k = k - num ;
    ls = ( int ) ( ( val - 1 ) / 2 ) ;
    rs = val - ls - 1 ;
    if ( ! intervals . containsKey ( ls ) ) {
      intervals . put ( ls , 0 ) ;
      heapq ( lens , - ls ) ;
    }
    if ( ! intervals . containsKey ( rs ) ) {
      intervals . put ( rs , 0 ) ;
      heapq ( lens , - rs ) ;
    }
    intervals . put ( rs , intervals . get ( rs ) + num ) ;
    intervals . put ( ls , intervals . get ( ls ) + num ) ;
  }
  int t = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int i = 1 ;
  i <= t ;
  i ++ ) {
    n = scanner . nextInt ( ) ;
    m = scanner . nextInt ( ) ;
    final List < Integer > list = new ArrayList < > ( ) ;
    for ( final String a : Collections . list ( String . valueOf ( n ) ) ) {
      list . add ( Integer . parseInt ( a ) ) ;
    }
    final int [ ] result = solve ( Integer . parseInt ( n ) , Integer . parseInt ( m ) ) ;
    System . out . println ( "Case #" + i + ": " + result [ 0 ] + " " + result [ 1 ] ) ;
  }
  return t ;
}
