@ VisibleForTesting static int solve ( String code , List < Map < String , Integer >> oe ) throws IOException {
  String in = code + ".in" ;
  String out = code + ".out" ;
  final int MOD = 1000002013 ;
  {
    int n = Integer . parseInt ( in ) ;
    int m = Integer . parseInt ( in ) ;
    int e = Integer . parseInt ( in ) ;
    int d = e - o ;
    return n * d - d * ( d - 1 ) / 2 ;
  }
  {
    int n = Integer . parseInt ( in ) ;
    int m = Integer . parseInt ( in ) ;
    int e = Integer . parseInt ( in ) ;
    int p = Integer . parseInt ( in ) ;
    int expected = Integer . parseInt ( p * price ( n , o , e ) ) ;
    Map < String , Integer > enter = new HashMap < > ( ) ;
    Map < String , Integer > leave = new HashMap < > ( ) ;
    for ( Map . Entry < String , Integer > entry : oe ) {
      enter . put ( entry . getKey ( ) , entry . getValue ( ) ) ;
      leave . put ( entry . getKey ( ) , entry . getValue ( ) ) ;
    }
    List < String > stations = Lists . newArrayList ( ) ;
    stations . addAll ( enter . keySet ( ) ) ;
    stations . addAll ( leave . keySet ( ) ) ;
    List < Card > cards = new ArrayList < > ( ) ;
    int got = 0 ;
    for ( String s : stations ) {
      cards . add ( new Card ( s , enter . get ( s ) ) ) ;
      int p = leave . get ( s ) ;
      while ( p > 0 ) {
        int cs = cards . get ( cards . size ( ) - 1 ) ;
        int cp = cards . get ( cards . size ( ) - 1 ) ;
        int pp = Math . min ( p , cp ) ;
        got += pp * price ( n , cs , s ) ;
        if ( p >= cp ) {
          cards . remove ( cards . size ( ) - 1 ) ;
        }
        else {
          cards . set ( cards . size ( ) - 1 , new Card ( cs , cp - pp ) ) ;
        }
        p -= pp ;
      }
    }
    return ( expected - got ) % MOD ;
  }
  List < String > lines = Arrays . asList ( in . split ( "\n" ) ) ;
  int c = Integer . parseInt ( lines . get ( 0 ) ) ;
  PrintWriter pw = new PrintWriter ( out ) ;
  int lineno