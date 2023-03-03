public static void solve ( ) {
  for ( int ti = 0 ;
  ti < Integer . parseInt ( input . nextLine ( ) ) ;
  ti ++ ) {
    int D = Integer . parseInt ( input . nextLine ( ) ) ;
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    double v = 1e100 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int K = Integer . parseInt ( input . nextLine ( ) ) ;
      int S = Integer . parseInt ( input . nextLine ( ) ) ;
      v = Math . min ( v , S * D / ( D - K ) ) ;
    }
    System . out . println ( "Case #" + ( ti + 1 ) + ": " + v + "f" ) ;
  }
}
