static public final Scanner input = new Scanner ( System . in ) {
  final int n = 1000 ;
  final int [ ] c = new int [ n ] ;
  final int [ ] [ ] f = new int [ n ] [ n ] ;
  int cnt = 0 ;
  int t = input . nextInt ( ) ;
  for ( int tt = xrange ( t ) ;
  tt < n ;
  tt ++ ) {
    n = input . nextInt ( ) ;
    int z = 0 ;
    final int [ ] a = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) z += Math . log ( f [ j ] [ a [ j ] ] ) ;
    System . out . println ( "Case #" + ( tt + 1 ) + ":" + z ) ;
    if ( z < - 6907 ) System . out . println ( "GOOD" ) ;
    else System . out . println ( "BAD" ) ;
  }
  return new Scanner ( System . in ) ;
}
