public static int T = Integer . parseInt ( Scanner in ) {
  for ( int t : xrange ( 1 , T + 1 ) ) {
    System . out . println ( "Case #" + t + ":" ) ;
    int N = Integer . parseInt ( in . nextLine ( ) ) ;
    int X = Integer . parseInt ( in . nextLine ( ) ) ;
    int [ ] sz = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) sz [ i ] = in . nextInt ( ) ;
    Arrays . sort ( sz ) ;
    int sm = 0 ;
    int l = sz . length - 1 ;
    int tot = 0 ;
    while ( l > sm ) {
      if ( sz [ l ] + sz [ sm ] <= X ) {
        l -- ;
        sm ++ ;
      }
      else l -- ;
      tot ++ ;
    }
    if ( l == sm ) tot ++ ;
    System . out . println ( tot ) ;
  }
  return T ;
}
