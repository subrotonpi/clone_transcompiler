@ VisibleForTesting static boolean print ( String patternText ) throws Exception {
  VERBOSE = true ;
  VERBOSE = false ;
  class Pattern {
    private final int idx ;
    private final int lpat = patternText . length ( ) ;
    private final List < String > items = new ArrayList < String > ( ) ;
    @ Override public void add ( String line ) {
      int idx = 0 ;
      final int lpat = line . length ( ) ;
      items . add ( line . substring ( idx , idx + 1 ) ) ;
      while ( idx < lpat ) {
        if ( line . charAt ( idx ) != '(' ) {
          items . add ( line . substring ( idx ) ) ;
          idx = idx + 1 ;
        }
        else {
          final int rpos = line . indexOf ( ')' , idx + 1 ) ;
          items . add ( line . substring ( idx + 1 , rpos ) ) ;
          idx = rpos + 1 ;
        }
      }
      this . items = items . toArray ( new String [ items . size ( ) ] ) ;
    }
  }
  class Solver {
    int l ;
    private final List < String > knownWords ;
    {
      super ( l ) ;
      this . knownWords = knownWords ;
    }
    @ Override public void addToTree ( Map < Character , Tree > tree , String word ) {
      if ( word . length ( ) == 0 ) return ;
      char c = word . charAt ( 0 ) ;
      if ( ! ( tree . containsKey ( c ) ) ) tree . put ( c , Collections . < Character , Tree > emptyMap ( ) ) ;
      addToTree ( tree . get ( c ) , word . substring ( 1 ) ) ;
    }
    @ Override public Map < Character , Tree > wordTree ( ) {
      return Collections . < Character , Tree > emptyMap ( ) ;
    }
  }
  int howMany ( String patternText ) {
    if ( VERBOSE ) System . out . println ( "Testing pattern" + patternText ) ;
    Pattern pattern = new Pattern ( patternText ) ;
    List < Tree > trees = new ArrayList < Tree > ( ) ;
    trees . add ( wordTree ) ;
    for ( String patelem : pattern . items ) {
      if ( VERBOSE ) System . out . println ( "... elem" + patelem + ", " ) ;
      List < Tree > newTrees = new ArrayList < Tree > ( ) ;
      for ( String letter : patelem . split ( " " ) ) {
        for ( Tree tree : trees ) {
          if ( tree . containsKey ( letter ) ) newTrees . add