static final void print ( int ans ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  System . setOut ( new PrintStream ( System . out ) {
    @ Override public int [ ] li ( ) {
      return map ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
    }
    @ Override public int [ ] li ( ) {
      return map ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
    }
    @ Override public int [ ] li ( ) {
      return map ( Integer . parseInt ( stdin . readLine ( ) ) - 1 ) ;
    }
    @ Override public float lf ( ) {
      return map ( Float . parseFloat ( stdin . readLine ( ) ) ) ;
    }
    @ Override public String [ ] ls ( ) {
      return stdin . readLine ( ) . split ( " " ) ;
    }
    @ Override public String [ ] ns ( ) {
      return stdin . readLine ( ) . split ( " " ) ;
    }
    @ Override public List < String > lc ( ) {
      return Collections . singletonList ( ns [ 0 ] ) ;
    }
    @ Override public int [ ] ni ( ) {
      return Integer . parseInt ( stdin . readLine ( ) ) ;
    }
    @ Override public float nf ( ) {
      return Float . parseFloat ( stdin . readLine ( ) ) ;
    }
    @ Override public List < Pair < Integer , Integer >> dijkstra ( @ Nonnull final List < Pair < Integer , Integer >> graph , int node , int start ) {
      final float INF = Float . POSITIVE_INFINITY ;
      final float [ ] dist = new float [ node ] ;
      Arrays . fill ( dist , INF ) ;
      Arrays . fill ( dist , INF ) ;
      Arrays . fill ( dist , INF ) ;
      final int [ ] heap = new int [ n ] ;
      heap [ 0 ] = new int [ n ] ;
      heap [ 0 ] = new int [ n ] ;
      heap [ 0 ] = new int [ n ] ;
      while ( heap . length > 0 ) {
        int cost = heap [ 0 ] ;
        final int curNode = heap [ 0 ] ;
        for ( int nexCost : graph . get ( curNode ) ) {
          int nexNode = heap [ 0 ] ;
          int distCand = dist [ curNode ] + nexCost ;
          if ( distCand < dist [ nexNode ] ) {
            dist [ nexNode ] = distCand ;
            heappush ( heap , new Pair < > ( dist [ nexNode ] , nexNode ) ) ;
          }
        }
      }
      return dist