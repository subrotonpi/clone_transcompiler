@ VisibleForTesting static final LinkedHashMap < Integer , Double > getSolutionMap ( ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final List < Integer > li = ContainerUtil . newArrayList ( ) ;
  for ( String line : stdin . readLine ( ) . split ( " " ) ) {
    li . add ( Integer . parseInt ( line ) ) ;
  }
  class Solution implements Solution {
    @ Override public int [ ] getSolution ( ) {
      return new int [ ] {
        0 }
        ;
      }
    }
    public void dijkstra ( int [ ] distances , Map < Integer , List < Point >> edgeMap ) {
      distances [ 0 ] = 0 ;
      List < Point > sortedQ = new ArrayList < Point > ( ) ;
      sortedQ . add ( new Point ( 0 , 0 ) ) ;
      Set < Point > searched = new HashSet < Point > ( ) ;
      while ( sortedQ . size ( ) > 0 ) {
        Point costToCur = heapq . get ( sortedQ ) ;
        Point cur = sortedQ . get ( 0 ) ;
        if ( searched . contains ( cur ) ) {
          continue ;
        }
        else {
          searched . add ( cur ) ;
        }
        for ( Point destCost : edgeMap . get ( cur ) ) {
          int oldDisToNei = distances [ destCost . x ] ;
          int newDisToNei = costToCur . add ( destCost . y ) ;
          if ( oldDisToNei > newDisToNei ) {
            distances [ destCost . x ] = newDisToNei ;
          }
          heapq . heapSort ( sortedQ , new Point ( distances [ destCost . x ] , destCost . y ) ) ;
        }
      }
    }
    public int [ ] treasureHunt ( int [ ] params , int [ ] treasurePoints , List < Point > edges ) {
      int numTotowns = params [ 0 ] ;
      int numEdges = params [ 1 ] ;
      int timeLimit = params [ 2 ] ;
      int [ ] distances = new int [ numTotowns ] ;
      int [ ] revDis = new int [ numTotowns ] ;
      float inf = Float . parseFloat ( "INF" ) ;
      for ( int i = 0 ;
      i < numTotowns ;
      i ++ ) {
        distances [ i ] = inf ;
        revDis [ i ] = inf ;
      }
      edgeMap = new TreeMap < Integer , Point > ( ) ;
      revEdgeMap = new TreeMap < Integer , Point > ( ) ;
      for (