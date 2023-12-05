static final < T > List < T > doit ( Map < Pair < T , T > , List < T >> combines , List < T > opposed , List < T > l ) throws IOException {
  final List < T > cur = new ArrayList < T > ( ) ;
  for ( T c : l ) {
    cur . add ( c ) ;
    while ( l . size ( ) > 2 && combines . containsKey ( Pair . of ( cur . subList ( l . size ( ) - 2 , l . size ( ) ) ) ) ) {
      final T newInstance = combines . get ( Pair . of ( cur . subList ( l . size ( ) - 2 , l . size ( ) ) ) ) ;
      cur . remove ( cur . size ( ) - 2 ) ;
      cur . add ( newInstance ) ;
    }
    final Set < T > cont = new HashSet < T > ( cur ) ;
    for ( T o : opposed ) {
      if ( cont . contains ( o . first ) && cont . contains ( o . second ) ) {
        cur = new ArrayList < T > ( ) ;
      }
    }
  }
  class Str implements String {
    public String toString ( ) {
      return "" ;
    }
    public String toString ( ) {
      return "" ;
    }
    public String toString ( ) {
      return "" ;
    }
  }
  if ( __name__ == null ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    int t = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _t = 0 ;
    _t < t ;
    ++ _t ) {
      final String [ ] s = br . readLine ( ) . split ( " " ) ;
      final int c = Integer . parseInt ( s [ 0 ] ) ;
      final List < T > combines = new ArrayList < T > ( ) ;
      for ( int i : xrange ( 1 , c + 1 ) ) {
        combines . add ( s [ i ] ) ;
      }
      combines = Collections . unmodifiableMap ( combines ) ;
      final int d = Integer . parseInt ( s [ c + 1 ] ) ;
      final List < T > opposed = new ArrayList < T > ( ) ;
      for ( int i : xrange ( 2 + c , 2 + c + d ) ) {
        opposed . add ( s [ i ] ) ;
      }
      final List < T > n =