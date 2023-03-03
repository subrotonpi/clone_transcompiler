@ VisibleForTesting static final LinkedHashMap < Integer , Double > getSolutionMap ( ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final List < Integer > li = ContainerUtil . newArrayList ( ) ;
  for ( String line = stdin . readLine ( ) . split ( " " ) ) {
    li . add ( Integer . parseInt ( line ) ) ;
  }
  class Solution {
    @ Override public int size ( ) {
      return li . size ( ) ;
    }
  }
  public Solution < Integer , Double > make ( ) {
    return new Solution < Integer , Double > ( ) {
      @ Override public int size ( ) {
        return li . get ( 0 ) ;
      }
    }
    ;
  }
  public Solution < Integer , Double > make ( ) {
    return new Solution < Integer , Double > ( ) {
      @ Override public int size ( ) {
        return li . get ( 0 ) ;
      }
    }
    ;
  }
  public Solution < Integer , Double > make ( Map < Integer , Double > distances , Map < Integer , List < Point >> edgeMap ) {
    distances . put ( 0 , 0 ) ;
    List < Point > sortedQ = new ArrayList < Point > ( ) ;
    sortedQ . add ( new Point ( 0 , 0 ) ) ;
    while ( sortedQ . size ( ) > 0 ) {
      int costToCur = heapq . get ( sortedQ ) ;
      Point cur = sortedQ . get ( cur ) ;
      for ( Point destCost : edgeMap . get ( cur ) ) {
        double oldDisToNei = distances . get ( destCost . x ) ;
        double newDisToNei = costToCur + destCost . y ;
        if ( oldDisToNei > newDisToNei ) {
          distances . put ( destCost . x , newDisToNei ) ;
          heapq . add ( sortedQ ) ;
        }
      }
      return distances ;
    }
    public double [ ] treasureHunt ( int [ ] params , Map < Integer , Double > treasurePoints , List < Point > edges ) {
      int numToKnons = params [ 0 ] ;
      int numEdges = params [ 1 ] ;
      int timeLimit = params [ 2 ] ;
      double [ ] distances = new double [ numToKnons ] ;
      double [ ] revDisToNei = new double [ numToKnons ] ;
      double inf = Double . POSITIVE_INFINITY ;
      for ( int i = 0 ;
      i < numToKnons ;
      i ++ ) {
        int townId = params [ i ] ;
        edgeMap . put