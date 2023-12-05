public static void do ( ) {
  int times = input . nextInt ( ) ;
  for ( int i : xrange ( times ) ) {
    System . out . printf ( "Case #%d:%n" , i + 1 ) ;
    calculate ( ) ;
  }
  final List < Integer > list = new ArrayList < > ( ) ;
  final List < Integer > twice = new ArrayList < > ( ) ;
  for ( final Integer i : list ) {
    list . add ( i ) ;
  }
  for ( final Integer i : list ) {
    list . add ( i ) ;
  }
  final Comparator < Integer > counterClock = new Comparator < > ( ) {
    @ Override public int compare ( final Integer A , final Integer B ) {
      return A . intValue ( ) * B . intValue ( ) - A . intValue ( ) * B . intValue ( ) > 0 ? 1 : 0 ;
    }
  }
  ;
  final List < Integer > list = new ArrayList < > ( ) ;
  for ( final Integer i : xrange ( input . nextInt ( ) ) ) {
    list . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  System . out . println ( list ) ;
  for ( final Integer I : list ) {
    final List < Integer > angle = new ArrayList < > ( ) ;
    for ( final Integer I1 : list ) {
      if ( I == I1 ) continue ;
      final int sub = I1 . intValue ( ) - I . intValue ( ) , sub = I1 . intValue ( ) - I . intValue ( ) ;
      angle . add ( new Integer ( Math . atan2 ( sub , sub ) ) ) ;
    }
    Collections . sort ( angle ) ;
    final Queue < Integer > q = new ArrayDeque < > ( ) ;
    int maxLen = 0 ;
    for ( final Integer I : twice ) {
      final int at = I . intValue ( ) ;
      final int ang = I . intValue ( ) ;
      final int tar = I . intValue ( ) ;
      while ( q . size ( ) > 0 ) {
        if ( q . get ( 0 ) == I || counterClock . compare ( tar , q . get ( 0 ) . intValue ( ) ) ) {
          q . remove ( 0 ) ;
        }
        else {
          break ;
        }
      }
      q . add ( I ) ;
      maxLen = Math . max ( maxLen , q . size ( ) ) ;
    }
    System . out . println ( list . size ( ) - maxLen - 1 ) ;
  }
}
