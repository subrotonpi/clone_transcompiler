@ VisibleForTesting static void solve ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int K = Integer . parseInt ( input . nextLine ( ) ) ;
  final String S = input . nextLine ( ) ;
  final PriorityQueue < Integer > q = new PriorityQueue < > ( ) ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    q . add ( S . charAt ( i ) == 'A' ? 1 : 0 ) ;
  }
  int cb = 0 ;
  for ( int i = 0 ;
  i < Math . min ( K , 2 * N + K % 2 ) ;
  i ++ ) {
    if ( q . getFirst ( ) == ( cb ^ 1 ) ) {
      q . getFirst ( ) ^ = 1 ;
    }
    else {
      q . removeFirst ( ) ;
      q . add ( cb ) ;
      cb ^= 1 ;
    }
  }
  final StringBuilder ans = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < q . size ( ) ;
  i ++ ) {
    ans . append ( ( q . getFirst ( ) ^ cb ) ? 'A' : 'B' ) ;
  }
  System . out . println ( ans . toString ( ) ) ;
}
