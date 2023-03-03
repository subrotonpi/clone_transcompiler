static final String solve ( ) throws IOException {
  final int CC = 0 ;
  final Map < String , String > Chest_type = new HashMap < String , String > ( ) ;
  final Map < String , String > Chest_keys = new HashMap < String , String > ( ) ;
  final Map < String , String > type_chests = new LinkedHashMap < String , String > ( ) ;
  final Set < String > keysCount = new TreeSet < String > ( ) ;
  final Set < String > total_keysCount = new TreeSet < String > ( ) ;
  final Set < String > keys_typeSet = new TreeSet < String > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Solve s = new Solve ( ) ;
    s . readProblem ( fin ) ;
    String sol ;
    if ( s . solve ( ) ) sol = " " . concat ( map ( String :: valueOf ) ) ;
    else sol = "IMPOSSIBLE" ;
    for ( String ctp : Chest_keys . keySet ( ) ) {
      keys_typeSet . add ( ctp ) ;
      ++ c ;
    }
    for ( String chest : Chest_type . keySet ( ) ) {
      assert ( c . length ( ) >= 1 ) ;
      String tp = Chest_type . get ( chest ) ;
      keys = map ( String :: valueOf ) ;
      assert ( keys . length ( ) == kc ) ;
      for ( String kt : keys ) {
        keysCount . add ( kt ) ;
        ++ c ;
        keys_typeSet . add ( kt ) ;
        ++ c ;
      }
      for ( int ci = 0 ;
      ci < CC ;
      ci ++ ) {
        int chest = ci + 1 ;
        List < String > l = map ( String :: valueOf , c ) ;
        String tp = l . get ( 0 ) ;
        int cnt = l . get ( 1 ) ;
        assert ( l . subList ( 2 , l . size ( ) ) . size ( ) == cnt ) ;
        Chest_type . put ( chest , tp ) ;
        Chest_keys . put ( chest , l . subList ( 2 , l . size ( ) ) ) ;
        type_chests . get ( tp ) . add ( chest ) ;
        for ( String kt : Chest_keys . get ( chest ) ) {
          total_keysCount . add ( kt ) ;
        }
      }
    }
  }
  return solve ( ) ;
}
