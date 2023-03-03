public static void main ( String [ ] args ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] a = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] sumMax = new int [ n + 1 ] , sumMin = new int [ n + 1 ] ;
  final int [ ] mxPes = new int [ n + 1 ] , mnPes = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    heapInsert ( mxPes , a [ i ] ) ;
    heapInsert ( mnPes , - a [ 3 * n - i - 1 ] ) ;
  }
  sumMax [ 0 ] = Integer . MAX_VALUE ;
  sumMin [ n ] = Integer . MAX_VALUE ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( mxPes [ 0 ] < a [ n + i - 1 ] ) {
      sumMax [ i ] = sumMax [ i - 1 ] + a [ n + i - 1 ] - heapInsert ( mxPes ) ;
      heapInsert ( mxPes , a [ n + i - 1 ] ) ;
    }
    else {
      sumMax [ i ] = sumMax [ i - 1 ] ;
    }
    if ( mnPes [ 0 ] < - a [ 2 * n - i ] ) {
      sumMin [ n - i ] = sumMin [ n - i + 1 ] + a [ 2 * n - i ] + heapInsert ( mnPes ) ;
      heapInsert ( mnPes , - a [ 2 * n - i ] ) ;
    }
    else {
      sumMin [ n - i ] = sumMin [ n - i + 1 ] ;
    }
  }
  int ans = - 10 * 16 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) ans = Math . max ( ans , sumMax [ i ] - sumMin [ i ] ) ;
  System . out . println ( ans ) ;
}
