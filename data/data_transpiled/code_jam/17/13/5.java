static final Scanner input = new Scanner ( System . in ) {
  @ Override public void close ( ) throws IOException {
    System . out . println ( "data.txt" ) ;
    System . out . println ( "out.txt" ) ;
    String input = System . getProperty ( "line.separator" ) ;
    for ( int cnum = 0 ;
    cnum < Integer . parseInt ( input ) ;
    cnum ++ ) {
      long hd = Long . parseLong ( input . nextLine ( ) ) ;
      long ad = Long . parseLong ( input . nextLine ( ) ) ;
      long hk = Long . parseLong ( input . nextLine ( ) ) ;
      long ak = Long . parseLong ( input . nextLine ( ) ) ;
      long b = Long . parseLong ( input . nextLine ( ) ) ;
      long d = Long . parseLong ( input . nextLine ( ) ) ;
      long hits = ( hk - 1 ) / ( ad ) ;
      if ( b > 0 ) for ( long x = 0 ;
      x <= hits ;
      x ++ ) hits = Math . min ( hits , x + ( hk - 1 ) / ( ad + x * b ) ) ;
    }
    long ans = 10 * 4 ;
    for ( long dcount = 0 ;
    d > 0 ? ak + 1 : 1 ;
    ) {
      long tick = 0 ;
      long hp = hd ;
      long ak2 = ak ;
      while ( dcount > 0 && tick < 10 * 4 ) {
        if ( hp > ak2 - d ) {
          ak2 -= d ;
          dcount -- ;
          hp -= ak2 ;
        }
        else hp = hd - ak2 ;
      }
      tick ++ ;
      long hitsleft = hits ;
      while ( hitsleft > 0 && tick < 10 * 4 ) {
        if ( hp > ak2 ) {
          hitsleft -- ;
          hp -= ak2 ;
        }
        else hp = hd - ak2 ;
      }
      tick ++ ;
    }
    ans = Math . min ( ans , tick ) ;
    if ( ak2 <= 0 ) break ;
  }
  if ( ans == 10 * 4 ) System . out . println ( "Case #" + ( cnum + 1 ) + ": IMPOSSIBLE" ) ;
  else System . out . println ( "Case #" + ( cnum + 1 ) + ": " + ( ans + 1 ) ) ;
}
