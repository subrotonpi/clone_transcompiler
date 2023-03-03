static final int [ ] getAttacks ( ) {
  final int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    final int N = Integer . parseInt ( readLine ( ) ) ;
    final Map < Integer , Attack > attacks = new LinkedHashMap < > ( N ) ;
    final Map < Integer , Integer > height = new LinkedHashMap < > ( N ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final int d = Integer . parseInt ( readLine ( ) ) ;
      final int n = Integer . parseInt ( readLine ( ) ) ;
      final int w = Integer . parseInt ( readLine ( ) ) ;
      final int e = Integer . parseInt ( readLine ( ) ) ;
      final int s = Integer . parseInt ( readLine ( ) ) ;
      final int delta_d = Integer . parseInt ( readLine ( ) ) ;
      final int delta_p = Integer . parseInt ( readLine ( ) ) ;
      final int delta_s = Integer . parseInt ( readLine ( ) ) ;
      for ( int k = 0 ;
      k < n ;
      k ++ ) {
        final int day = d + k * delta_d ;
        final int west = w + k * delta_p ;
        final int east = e + k * delta_p ;
        final int strength = s + k * delta_s ;
        attacks . put ( day , new Attack ( west , east , strength ) ) ;
      }
    }
    final List < Integer > days = new ArrayList < > ( attacks . keySet ( ) ) ;
    Collections . sort ( days ) ;
    int res = 0 ;
    for ( final Integer day : days ) {
      final Map < Integer , Integer > newHeight = new HashMap < > ( height ) ;
      for ( final Attack attack : attacks . get ( day ) ) {
        boolean wasSuccessful = false ;
        final int west = attack . getWorld ( ) . ordinal ( ) ;
        final int east = attack . getWorld ( ) . ordinal ( ) ;
        final int strength = attack . getStrength ( ) ;
        for ( int pos = west ;
        pos < east ;
        pos ++ ) {
          if ( strength > height . get ( pos ) ) {
            wasSuccessful = true ;
            newHeight . put ( pos , Math . max ( strength , newHeight . get ( pos ) ) ) ;
          }
        }
        if ( wasSuccessful ) {
          res ++ ;
        }
      }
      height = newHeight . values ( ) ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + res ) ;
  }
  return null ;
}
