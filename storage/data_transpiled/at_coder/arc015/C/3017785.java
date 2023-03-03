@ VisibleForTesting static void dfs ( int n ) {
  int i = Integer . parseInt ( input ( ) ) ;
  HashMap < String , List < Pair >> edges = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String large = input ( ) ;
    String coeff = input ( ) ;
    String small = input ( ) ;
    coeff = Fraction . valueOf ( Integer . parseInt ( coeff ) ) ;
    for ( String key : new String [ ] {
      large , small }
      ) {
        if ( ! edges . containsKey ( key ) ) edges . put ( key , new ArrayList < > ( ) ) ;
      }
      edges . get ( small ) . add ( new Pair ( large , coeff ) ) ;
      edges . get ( large ) . add ( new Pair ( small , Fraction . ONE / coeff ) ) ;
    }
    k0 = Collections . reverseOrder ( edges ) ;
  }
  