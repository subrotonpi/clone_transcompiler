public static void print ( String input ) {
  int T = Integer . parseInt ( input ) ;
  int N = Integer . parseInt ( input ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] B = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) B [ i ] = Integer . parseInt ( input ) ;
  String ans = "yes" ;
  int i = 0 ;
  if ( N < M ) {
    ans = "no" ;
  }
  for ( int b : B ) {
    if ( ans . equals ( "no" ) ) break ;
    for ( int a = i ;
    a < N ;
    a ++ ) {
      if ( b >= A [ a ] && b - T ) {
        ans = "yes" ;
        i ++ ;
        break ;
      }
      else {
        ans = "no" ;
        i ++ ;
      }
    }
  }
  System . out . println ( ans ) ;
}
