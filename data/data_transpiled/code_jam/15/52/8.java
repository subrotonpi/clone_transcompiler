@ VisibleForTesting static Iterable < String > solve ( ) throws IOException {
  String [ ] lines = Files . readAllLines ( Paths . get ( "b.in" ) ) ;
  final int T = Integer . parseInt ( lines [ 0 ] ) ;
  return new Iterable < String > ( ) {
    int N = Integer . parseInt ( lines [ 0 ] ) ;
    int K = Integer . parseInt ( lines [ 1 ] ) ;
    @ Override public Iterator < String > iterator ( ) {
      return new Iterator < String > ( ) {
        int [ ] minDiff = new int [ K ] ;
        int [ ] maxDiff = new int [ K ] ;
        int [ ] currDiff = new int [ K ] ;
        int firstSum = Integer . parseInt ( lines [ 0 ] ) ;
        int lastThing = firstSum ;
        for ( int i = 1 ;
        i < sumI . length ;
        i ++ ) {
          currDiff [ i % K ] += Integer . parseInt ( lines [ i ] ) - lastThing ;
          lastThing = Integer . parseInt ( lines [ i ] ) ;
          maxDiff [ i % K ] = Math . max ( currDiff [ i % K ] , maxDiff [ i % K ] ) ;
          minDiff [ i % K ] = Math . min ( currDiff [ i % K ] , minDiff [ i % K ] ) ;
        }
        List < Integer > diff = Lists . newArrayList ( ) ;
        for ( int i = 0 ;
        i < diff . size ( ) ;
        i ++ ) diff . add ( diff . get ( i ) - n ) ;
        int worstDiff = Collections . max ( diff ) ;
        int moveUpMin = 0 ;
        int moveUpMax = 0 ;
        int moveDownMin = 0 ;
        int moveDownMax = 0 ;
        for ( int i : xrange ( K ) ) {
          if ( minDiff [ i ] < 0 ) {
            moveUpMin += - minDiff [ i ] ;
            moveUpMax += worstDiff - maxDiff [ i ] ;
          }
          else if ( maxDiff [ i ] > worstDiff ) {
            moveDownMin += maxDiff [ i ] - worstDiff ;
            moveDownMax += minDiff [ i ] ;
          }
          else {
            moveUpMax += worstDiff - maxDiff [ i ] ;
            moveDownMax += minDiff [ i ] ;
          }
        }
        int moveUpD = moveUpMax - moveUpMin ;
        moveDownD = moveDownMax - moveDownMin ;
        moveMin = moveUpMin - moveDownMax ;
        moveUp