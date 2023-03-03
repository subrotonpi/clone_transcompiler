@ VisibleForTesting static void from ( LinkedHashMap < String , Integer > input ) {
  final int MOD = 10 * 9 + 7 ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final Map < String , Map < String , Integer >> dp = new HashMap < > ( N + 1 ) ;
  dp . put ( 0 , new HashMap < > ( ) ) ;
  dp . get ( 0 ) . put ( "TTT" , 1 ) ;
  {
    final String [ ] bad = {
      "AGC" , "ACG" , "GAC" , "AGGC" , "ATGC" , "AGTC" }
      ;
      for ( final String b : bad ) {
        if ( last4 . contains ( b ) ) {
          return ;
        }
      }
      return true ;
    }
  }
  