@ VisibleForTesting static Comparator < Map < Integer , List < Integer >>> sub ( ) {
  return ( prefers , canceled ) -> {
    Map < Integer , Integer > res = new HashMap < > ( ) ;
    for ( Map < Integer , List < Integer >> pref : prefers ) {
      int p = pref . size ( ) - 1 ;
      while ( canceled . contains ( p ) ) {
        pref . remove ( pref . size ( ) - 1 ) ;
        p = pref . get ( pref . size ( ) - 1 ) ;
      }
      res . put ( p , 1 ) ;
    }
    return Collections . max ( res . entrySet ( ) , new Comparator < Map . Entry < Integer , List < Integer >>> ( ) {
      @ Override public int compare ( Map . Entry < Integer , List < Integer >> o1 , Map . Entry < Integer , List < Integer >> o2 ) {
        return o1 . getValue ( ) . compareTo ( o2 . getValue ( ) ) ;
      }
    }
    ) ;
  }
  ;
}
