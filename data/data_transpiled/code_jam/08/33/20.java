public static void readInput ( BufferedReader reader ) throws IOException {
  reader . readLine ( ) ;
  int num_cases = Integer . parseInt ( reader . readLine ( ) ) ;
  for ( int i = 0 ;
  i <= num_cases ;
  i ++ ) {
    final int n = reader . nextInt ( ) ;
    final int m = reader . nextInt ( ) ;
    final int X = reader . nextInt ( ) ;
    final int Y = reader . nextInt ( ) ;
    final int Z = reader . nextInt ( ) ;
    final int [ ] A = new int [ n ] ;
    for ( int j = 0 ;
    j <= m ;
    j ++ ) {
      A [ j ] = Integer . parseInt ( reader . readLine ( ) ) ;
    }
    final int [ ] speeds = new int [ n ] ;
    for ( int j = 0 ;
    j <= n ;
    j ++ ) {
      speeds [ j ] = A [ j % m ] ;
      A [ j % m ] = ( X * A [ j % m ] + Y * ( j + 1 ) ) % Z ;
    }
    final int [ ] numSets = new int [ speeds . length ] ;
    for ( int j = speeds . length - 1 ;
    j >= 0 ;
    j -- ) {
      for ( int k = j + 1 ;
      k < speeds . length ;
      k ++ ) {
        if ( speeds [ k ] > speeds [ j ] ) {
          numSets [ j ] += numSets [ k ] ;
        }
      }
    }
    int tot_sets = 0 ;
    for ( int j = 0 ;
    j <= speeds . length ;
    j ++ ) {
      tot_sets += numSets [ j ] ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ":" + ( tot_sets % 1000000007 ) ) ;
  }
}
