public static void input ( Scanner in ) {
  int n = in . nextInt ( ) ;
  String s = in . nextLine ( ) ;
  String [ ] l = s . split ( " " ) ;
  String [ ] r = s . split ( " " ) ;
  HashMap hashl = new HashMap ( ) ;
  HashMap hashr = new HashMap ( ) ;
  for ( int i = 0 ;
  i < 1 << n ;
  i ++ ) {
    StringBuilder llr = new StringBuilder ( ) ;
    StringBuilder llb = new StringBuilder ( ) ;
    StringBuilder lrr = new StringBuilder ( ) ;
    StringBuilder lrb = new StringBuilder ( ) ;
    for ( int k = 0 ;
    k < n ;
    k ++ ) {
      if ( ( i & ( 1 << k ) ) != 0 ) {
        llr . append ( l [ k ] ) ;
        lrr . append ( r [ k ] ) ;
      }
      else {
        llb . append ( l [ k ] ) ;
        lrb . append ( r [ k ] ) ;
      }
    }
    String sl = ( new String ( llr . toString ( ) ) ) ;
    String sr = ( new String ( llb . toString ( ) ) ) ;
    if ( ! hashl . containsKey ( sl ) ) hashl . put ( sl , 1 ) ;
    else hashl . put ( sl , ++ i ) ;
    if ( ! hashr . containsKey ( sr ) ) hashr . put ( sr , 1 ) ;
    else hashr . put ( sr , ++ i ) ;
  }
  int ret = 0 ;
  for ( Map . Entry < String , Integer > strPair : hashl . entrySet ( ) ) {
    if ( hashr . containsKey ( strPair . getKey ( ) ) ) ret += hashr . get ( strPair . getKey ( ) ) * c ;
  }
  System . out . println ( ret ) ;
}
