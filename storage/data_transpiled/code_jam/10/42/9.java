public static double INF = Double . POSITIVE_INFINITY ;
final Scanner fin = new Scanner ( System . in ) ;
final int N = Integer . parseInt ( fin . nextLine ( ) ) ;
for ( int testCase = 1 ;
testCase <= N ;
testCase ++ ) {
  final int P = Integer . parseInt ( fin . nextLine ( ) ) ;
  final int M = Integer . parseInt ( fin . nextLine ( ) ) ;
  final int [ ] [ ] prices = new int [ P ] [ P ] ;
  for ( int i = 0 ;
  i < P ;
  i ++ ) prices [ i ] = Integer . parseInt ( fin . nextLine ( ) ) ;
  final List < List < Integer >> last = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 2 * P ;
  i ++ ) {
    final int m = M [ i ] ;
    final List < Integer > s = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < P + 2 ;
    j ++ ) {
      if ( j <= m ) s . add ( 0 ) ;
      else s . add ( INF ) ;
    }
    last . add ( s ) ;
  }
  final int n = last . size ( ) ;
  for ( int k = 0 ;
  k < P ;
  k ++ ) {
    n /= 2 ;
    final List < List < Integer >> next = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      final List < Integer > s = new ArrayList < > ( ) ;
      final int cost = prices [ k ] [ i ] ;
      for ( int j = 0 ;
      j < P + 1 ;
      j ++ ) {
        final int p = Math . min ( last . get ( 2 * i ) . get ( j ) + last . get ( 2 * i + 1 ) . get ( j ) + cost , last . get ( 2 * i ) . get ( j + 1 ) + last . get ( 2 * i + 1 ) . get ( j + 1 ) ) ;
        s . add ( p ) ;
      }
      s . add ( INF ) ;
      next . add ( s ) ;
    }
    last = next ;
  }
  System . out . println ( "Case #" + testCase + ": " + last . get ( 0 ) . get ( 0 ) ) ;
}
fin . close ( ) ;
return 0 ;
}
