@ Sys public static void Sys ( ) throws IOException {
  int T = Integer . parseInt ( next ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int A = Integer . parseInt ( next ( ) ) ;
    int B = Integer . parseInt ( next ( ) ) ;
    List < String > Bl = new LinkedList < String > ( ) ;
    for ( String S : next ( ) . split ( " " ) ) {
      A = Integer . parseInt ( S ) ;
      B = Integer . parseInt ( S ) ;
    }
    List < String > Bl = new LinkedList < String > ( ) ;
    Bl . add ( String . valueOf ( B ) ) ;
    int count = 0 ;
    for ( int i = A ;
    i < B ;
    i ++ ) {
      List < String > l = new LinkedList < String > ( ) ;
      l . add ( String . valueOf ( i ) ) ;
      int ls = l . size ( ) ;
      Set < String > used = new THashSet < String > ( ) ;
      for ( int j = 0 ;
      j < l . size ( ) ;
      j ++ ) {
        l . set ( j , ls + 1 ) ;
        if ( l . size ( ) <= ls || l . size ( ) > Bl ) continue ;
        String lstr = new String ( l . get ( j ) ) ;
        if ( used . contains ( lstr ) ) continue ;
        used . add ( lstr ) ;
        count ++ ;
      }
    }
    System . out . println ( "Case #" + t + ":" + count ) ;
  }
}
