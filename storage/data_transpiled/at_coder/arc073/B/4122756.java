@ VisibleForTesting static int [ ] [ ] binarySearch ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = input . nextInt ( ) , W = input . nextInt ( ) ;
  final TreeMap < Integer , Integer > map = new TreeMap < > ( ) ;
  int w1 = 0 ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    int w = input . nextInt ( ) , v = input . nextInt ( ) ;
    map . put ( w , v ) ;
    if ( n == 0 ) {
      w1 = w ;
    }
  }
  final TreeMap < Integer , ArrayList < Integer >> bestks = new TreeMap < > ( ) ;
  for ( int w = w1 ;
  w < w + 4 ;
  w ++ ) {
    final ArrayList < Integer > vs = new ArrayList < > ( map . get ( w ) ) ;
    Collections . sort ( vs ) ;
    int s = 0 ;
    ArrayList < Integer > bestK = new ArrayList < > ( ) ;
    for ( int v : vs ) {
      s += v ;
      bestK . add ( s ) ;
    }
    bestks . put ( w , bestK ) ;
  }
  int ans = 0 ;
  for ( int w1Num = 0 ;
  w1Num <= map . get ( w1 ) . size ( ) ;
  w1Num ++ ) {
    for ( int w2Num = 0 ;
    w2Num <= map . get ( w1 + 1 ) . size ( ) ;
    w2Num ++ ) {
      for ( int w3Num = 0 ;
      w3Num <= map . get ( w1 + 2 ) . size ( ) ;
      w3Num ++ ) {
        for ( int w4Num = 0 ;
        w4Num <= map . get ( w1 + 3 ) . size ( ) ;
        w4Num ++ ) {
          final int weight = w1Num * w1 + w2Num * ( w1 + 1 ) + w3Num * ( w1 + 2 ) + w4Num * ( w1 + 3 ) ;
          if ( weight > W ) {
            continue ;
          }
          final int value = bestks . get ( w1 ) . get ( w1Num ) + bestks . get ( w1 + 1 ) . get ( w2Num ) + bestks . get ( w1 + 2 ) . get ( w3Num ) + bestks . get ( w1 + 3 ) . get ( w4Num ) ;
          ans = Math . max ( ans , value ) ;
        }
      }
    }
  }
  return ans ;
}
