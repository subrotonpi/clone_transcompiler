static final Scanner in = new Scanner ( System . in ) {
  private final int MAX = 1 << 50 ;
  private final int T = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int cas : xrange ( 1 , T + 1 ) ) {
    System . out . printf ( "Case #%d:%n" , cas ) ;
    String [ ] parts = in . nextLine ( ) . split ( "\\s+" ) ;
    final int C = Integer . parseInt ( parts [ 0 ] ) ;
    final int D = Integer . parseInt ( parts [ 1 ] ) * 2 ;
    final List < Integer > points = new ArrayList < > ( ) ;
    final Map < Integer , Integer > vends = Maps . newHashMap ( ) ;
    for ( int i : xrange ( C ) ) {
      parts = in . nextLine ( ) . split ( "\\s+" ) ;
      final int P = Integer . parseInt ( parts [ 0 ] ) * 2 ;
      final int V = Integer . parseInt ( parts [ 1 ] ) ;
      points . add ( P ) ;
      vends . put ( P , V ) ;
    }
    Collections . sort ( points ) ;
    final int lowest = points . get ( 0 ) ;
    final int highest = points . get ( points . size ( ) - 1 ) ;
    int b = MAX ;
    int l = - 1 ;
    while ( b > 0 ) {
      final int x = l + b ;
      int target = - ( 1 << 100 ) ;
      boolean ok = true ;
      for ( final int p : points ) {
        if ( ! ok ) break ;
        for ( final int i : xrange ( vends . get ( p ) ) ) {
          if ( target < p ) target = Math . max ( target , p - x ) ;
          else {
            if ( p + x < target ) {
              ok = false ;
              break ;
            }
          }
          target += D ;
        }
      }
      if ( ! ok ) l = x ;
      b >>= 1 ;
    }
    final int ans = l + 1 ;
    assert ans < MAX / 2 ;
    System . out . printf ( "%.1f" , ans * 0.5 ) ;
  }
  return new Scanner ( in ) ;
}
