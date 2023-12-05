@ VisibleForTesting static Comparator < Map < String , Integer >> sub ( final Collection < String > prefers , final Set < String > canceled ) {
  return new Comparator < Map < String , Integer >> ( ) {
    @ Override public int compare ( Map < String , Integer > o1 , Map < String , Integer > o2 ) {
      final Map < String , Integer > res = new HashMap < > ( ) ;
      for ( String pref : prefers ) {
        int pt = - 1 ;
        while ( canceled . contains ( pref . get ( pt ) ) ) {
          pt -- ;
        }
        res . put ( pref . get ( pt ) , 1 ) ;
      }
      return Math . max ( res . entrySet ( ) . size ( ) , res . entrySet ( ) . size ( ) ) ;
    }
  }
  ;
}
