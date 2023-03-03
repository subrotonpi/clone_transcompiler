@ Nullable private static List < Pair < Integer , Integer >> solve ( @ NotNull final String input ) {
  final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int T = Integer . parseInt ( br . readLine ( ) ) ;
  final List < Pair < Integer , Integer >> y = new ArrayList < > ( ) ;
  for ( final String l : br ) {
    final List < Integer > x = new ArrayList < > ( ) ;
    for ( final String n : l . split ( " " ) ) {
      String v = Integer . toBinaryString ( Integer . parseInt ( n , 16 ) ) ;
      while ( v . length ( ) < 4 ) v = "0" + v ;
      x . addAll ( Arrays . asList ( v . split ( " " ) ) ) ;
    }
    y . add ( x ) ;
  }
  final List < Pair < Integer , Integer >> answers = null ;
  {
    final List < List < Pair < Integer , Integer >>> streaks = new ArrayList < > ( ) ;
    boolean nothingness = true ;
    for ( final int m : b ) {
      final List < Integer > s = new ArrayList < > ( ) ;
      final List < Integer > last = new ArrayList < > ( ) ;
      for ( final String n : m . split ( " " ) ) {
        if ( ( last . size ( ) == 0 ) || ( last . get ( last . size ( ) - 1 ) == n ) || ( n . isEmpty ( ) ) ) {
          while ( last . size ( ) > 0 ) {
            s . add ( last . size ( ) ) ;
            last . remove ( last . size ( ) - 1 ) ;
          }
        }
        if ( n . length ( ) != 0 ) {
          nothingness = false ;
          last . add ( n ) ;
        }
        else {
          s . add ( 0 ) ;
        }
      }
      while ( last . size ( ) > 0 ) {
        s . add ( last . size ( ) ) ;
        last . remove ( last . size ( ) - 1 ) ;
      }
      streaks . add ( s ) ;
    }
    if ( nothingness ) return null ;
    int largest = 0 ;
    final List < Pair < Integer , Integer >> cuts = new ArrayList < > ( ) ;
    for ( int m = 0 ;
    m < M ;
    m ++ ) {
      for ( int n = 0 ;
      n < N ;
      n ++ ) {
        final Integer want = b . get ( m ) . get ( n ) ;
        if