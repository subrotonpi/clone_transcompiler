public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int Q = Integer . parseInt ( input ) ;
  List < Integer > As = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N - Q - K + 2 ;
  i ++ ) {
    int Y = Ordering . natural ( ) . sortedCopy ( As . get ( i ) ) ;
    List < Integer > cands = new ArrayList < > ( ) ;
    List < Integer > cs = new ArrayList < > ( ) ;
    for ( int A : As . subList ( 0 , i + 1 ) ) {
      if ( A < Y ) {
        if ( cs . size ( ) >= K ) cands . addAll ( Arrays . asList ( cs . subList ( 0 , cs . size ( ) - K + 1 ) ) ) ;
        cs . clear ( ) ;
      }
      else cs . add ( A ) ;
    }
    if ( cands . size ( ) < Q ) continue ;
    int X = Ordering . natural ( ) . sortedCopy ( cands . subList ( Q - 1 , X ) ) ;
    ans = Math . min ( ans , X - Y ) ;
  }
  System . out . println ( ans ) ;
}
