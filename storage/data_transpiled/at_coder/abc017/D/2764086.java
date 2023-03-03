@ VisibleForTesting static int solve ( int [ ] fs , int m ) {
  final long MOD = 1000000007 ;
  PriorityQueue < Integer > queue = new PriorityQueue < > ( ) ;
  queue . add ( new Integer ( 1 ) ) ;
  queue . add ( new Integer ( 1 ) ) ;
  Set < Integer > flavorSet = new HashSet < > ( ) ;
  flavorSet . add ( 0 ) ;
  flavorSet . add ( fs [ 0 ] ) ;
  int ans = 1 ;
  for ( int i = 1 ;
  i < fs . length ;
  i ++ ) {
    ans = ans * 2 ;
    if ( flavorSet . contains ( fs [ i ] ) ) {
      while ( flavorSet . contains ( fs [ i ] ) ) {
        int point = queue . poll ( ) ;
        int f0 = flavorSet . remove ( point ) ;
        if ( f0 != fs [ i ] ) {
          ans -= point ;
        }
        else {
          queue . add ( new Integer ( point ) ) ;
          flavorSet . add ( 0 ) ;
        }
        flavorSet . remove ( f0 ) ;
      }
    }
    ans %= MOD ;
    queue . add ( new Integer ( ans ) ) ;
    flavorSet . add ( fs [ i ] ) ;
  }
  if ( Class . isPrimitive ( "java.util.concurrent.atomic.AtomicInteger" ) ) {
    int n = Integer . parseInt ( input ( ) ) ;
    int m = Integer . parseInt ( input ( ) ) ;
    int [ ] fs = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      fs [ i ] = Integer . parseInt ( input ( ) ) ;
    }
    System . out . println ( solve ( fs , m ) ) ;
  }
  return ans ;
}
