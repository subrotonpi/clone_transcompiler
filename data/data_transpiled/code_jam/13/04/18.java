@ VisibleForTesting static final Map < Integer , Integer > getPossibleKeys = new LinkedHashMap < Integer , Integer > ( ) {
  private final int n = Integer . MIN_VALUE ;
  private int numOnes = n ;
  private int cur = 0 ;
  private int n = 0 ;
  @ Override public boolean addchest ( Map < Integer , Integer > keys , ChestChest chest ) {
    keys . put ( chest . _1 , -- cur ) ;
    for ( int k = chest . _1 ;
    k != 0 ;
    k = chest . _2 ) keys . put ( k , ++ cur ) ;
    return ! StringUtil . isEmpty ( keys . values ( ) ) ;
  }
  @ Override public boolean canchest ( Map < Integer , Integer > keys , ChestChest chest ) {
    Map < Integer , Integer > map = new HashMap < Integer , Integer > ( keys ) ;
    for ( int k = chest . _1 ;
    k != 0 ;
    k = chest . _2 ) keys . put ( chest . _1 , -- cur ) ;
    return ! StringUtil . isEmpty ( map . values ( ) ) ;
  }
  @ Override public String getName ( ) {
    return "PossibleKeys" ;
  }
}
