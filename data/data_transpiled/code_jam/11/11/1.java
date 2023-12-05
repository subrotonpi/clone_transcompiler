@ VisibleForTesting static void fractions ( Scanner scanner ) {
  for ( int t = 0 ;
  t < Integer . parseInt ( scanner . nextLine ( ) ) ;
  t ++ ) {
    final int N = scanner . nextInt ( ) ;
    final int Pd = scanner . nextInt ( ) ;
    final int Pg = scanner . nextInt ( ) ;
    int zmage = Pd ;
    int porazi = 100 - Pd ;
    int g = gcd ( zmage , porazi ) ;
    zmage /= g ;
    porazi /= g ;
    if ( zmage + porazi > N || ( Pg == 100 && porazi > 0 ) || ( Pg == 0 && zmage > 0 ) ) {
      System . out . println ( "Case #" + ( t + 1 ) + ": Broken" ) ;
    }
    else {
      System . out . println ( "Case #" + ( t + 1 ) + ": Possible" ) ;
    }
  }
}
