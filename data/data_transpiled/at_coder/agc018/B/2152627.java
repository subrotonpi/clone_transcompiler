@ VisibleForTesting static Comparator < Map < Integer , Integer >> sub ( List < List < Integer >> prefers , Set < Integer > canceled ) {
  return new Comparator < Map < Integer , Integer >> ( ) {
    @ Override public int compare ( Map < Integer , Integer > o1 , Map < Integer , Integer > o2 ) {
      Map < Integer , Integer > res = new HashMap < > ( ) ;
      for ( List < Integer > pref : prefers ) {
        int p = pref . get ( pref . size ( ) - 1 ) ;
        while ( canceled . contains ( p ) ) {
          pref . remove ( pref . size ( ) - 1 ) ;
          p = pref . get ( pref . size ( ) - 1 ) ;
        }
        res . put ( p , 1 ) ;
      }
      return Math . max ( res . entrySet ( ) . size ( ) , Comparator . comparing ( Map . Entry :: getValue ) . getKey ( ) ) ;
    }
  }
  ;
}
