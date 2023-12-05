public static int T = Integer . parseInt ( Scanner in ) {
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    int j = Integer . parseInt ( in . nextLine ( ) ) ;
    int p = Integer . parseInt ( in . nextLine ( ) ) ;
    int s = Integer . parseInt ( in . nextLine ( ) ) ;
    int k = Integer . parseInt ( in . nextLine ( ) ) ;
    System . out . println ( "Case #" + i + ":" + j * p * Math . min ( s , k ) ) ;
    List < Integer > ans = new ArrayList < Integer > ( ) ;
    for ( int x = 1 ;
    x <= j ;
    x ++ ) for ( int y = 1 ;
    y <= p ;
    y ++ ) for ( int t = 0 ;
    t < Math . min ( s , k ) ;
    t ++ ) ans . add ( new Integer ( x ) ) ;
    int now = 0 ;
    int last = - 1 ;
    for ( Integer i : ans ) {
      if ( i . intValue ( ) != last ) {
        now = i . intValue ( ) - 1 ;
        last = i . intValue ( ) ;
      }
      System . out . println ( i . intValue ( ) + " " + i . intValue ( ) + " " + ( now % s + 1 ) ) ;
      now ++ ;
    }
  }
  return T ;
}
