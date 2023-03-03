@ VisibleForTesting static void from ( LinkedHashMap < String , Integer > s ) {
  int mod = 10 * 9 + 7 ;
  /* Check the string for the user */
  String [ ] ban = {
    "AGC" , "ACG" , "GAC" , "AGGC" , "ATGC" , "AGTC" }
    ;
    for ( String b : ban ) {
      if ( s . contains ( b ) ) {
        return ;
      }
    }
    int n = Integer . parseInt ( input ( ) ) ;
    LinkedHashMap < String , Integer > dp = new LinkedHashMap < String , Integer > ( ) ;
    dp . put ( 0 , n + 1 ) ;
    dp . put ( 0 , n ) ;
    dp . put ( "RAN" , 1 ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( Map . Entry < String , Integer > entry : dp . get ( i ) . entrySet ( ) ) {
        for ( char c : "ACTG" . toCharArray ( ) ) {
          if ( check ( entry . getKey ( ) + c ) ) {
            dp . get ( i + 1 ) . put ( entry . getKey ( ) . substring ( 1 ) + c , entry . getValue ( ) % mod ) ;
          }
        }
      }
    }
    System . out . println ( s . toString ( ) % mod ) ;
  }
  