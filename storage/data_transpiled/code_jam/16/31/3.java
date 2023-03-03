public static void print ( String input ) {
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    System . out . print ( "Case #" + ( i + 1 ) + ":" ) ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    List < Integer > members = Lists . newArrayList ( ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      members . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    }
    while ( Math . max ( members . size ( ) , 0 ) > 0 ) {
      int r = Math . max ( members . size ( ) , 0 ) ;
      List < Integer > l = new ArrayList < Integer > ( ) ;
      for ( int j = 0 ;
      j < members . size ( ) ;
      j ++ ) {
        l . add ( members . get ( j ) ) ;
      }
      if ( l . size ( ) == 2 ) {
        List < Integer > out = l ;
        if ( l . size ( ) == 2 ) {
          out = l ;
        }
        else {
          out = Arrays . asList ( l . subList ( 0 , l . size ( ) ) ) ;
        }
        System . out . print ( new String ( ( char ) ( l . get ( 0 ) + 'A' ) ) ) ;
        for ( int j = 0 ;
        j < out . size ( ) ;
        j ++ ) {
          members . set ( j , j ) ;
        }
      }
    }
    System . out . println ( "" ) ;
  }
}
