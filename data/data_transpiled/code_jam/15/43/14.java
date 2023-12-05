public static double solve ( ) {
  for ( int cas = 0 ;
  cas < xrange ( 1 , input ) ;
  cas ++ ) {
    System . out . printf ( "Case #%d:" , cas ) ;
    int N = input . nextInt ( ) ;
    List < List < String >> sents = new ArrayList < > ( ) ;
    Set < String > words = new HashSet < > ( ) ;
    for ( ;
    ;
    ) {
      sents . add ( readLine ( ) . split ( " " ) ) ;
      words . addAll ( sents . get ( sents . size ( ) - 1 ) ) ;
    }
    Collections . sort ( words ) ;
    int [ ] masks = new int [ N ] ;
    for ( List < String > sent : sents ) {
      int m = 0 ;
      for ( String word : sent ) m |= ( 1 << words . indexOf ( word ) ) ;
      masks [ 0 ] = m ;
    }
    double ans = 1e100 ;
    for ( int i : xrange ( 1 << ( N - 2 ) ) ) {
      int en = masks [ 0 ] ;
      int fr = masks [ 1 ] ;
      for ( int j : xrange ( N - 2 ) ) {
        if ( ( i & ( 1 << j ) ) != 0 ) en |= masks [ 2 + j ] ;
        else fr |= masks [ 2 + j ] ;
      }
      ans = Math . min ( ans , Integer . toBinaryString ( en & fr ) . indexOf ( "1" ) ) ;
    }
    System . out . println ( ans ) ;
  }
  return ans ;
}
