static final String getExample ( ) {
  final String outputLine = "Case #{X:d}: {Y:d}" ;
  final Class < ? > Rope = Class . forName ( "org.apache.river.benchmark.rope.Rope" ) ;
  if ( Class . isEnum ( Rope ) ) {
    final String in = System . getProperty ( "test.src" ) ;
    final String out = System . getProperty ( "test.dst" ) ;
    try ( final BufferedReader inHandle = new BufferedReader ( new FileReader ( in ) ) ;
    final BufferedWriter outhandle = new BufferedWriter ( new FileWriter ( out ) ) ) {
      final int T = Integer . parseInt ( inHandle . readLine ( ) ) ;
      for ( int t = 0 ;
      t < T ;
      t ++ ) {
        final int N = Integer . parseInt ( inHandle . readLine ( ) ) ;
        final List < Rope > ropes = new ArrayList < > ( N ) ;
        for ( int n = 0 ;
        n < N ;
        n ++ ) {
          ropes . add ( Rope . valueOf ( Integer . parseInt ( inHandle . readLine ( ) ) ) ) ;
        }
        Collections . sort ( ropes ) ;
        int total = 0 ;
        for ( Rope ropeA : ropes ) {
          for ( Rope ropeB : ropes ) {
            if ( ( ( ropeA . a < ropeB . a && ropeA . b > ropeB . b ) || ( ropeA . a > ropeB . a && ropeA . b < ropeB . b ) ) {
              total ++ ;
            }
          }
        }
        assert ( total % 2 == 0 ) ;
        total = total / 2 ;
        System . out . println ( outputLine . replace ( "X" , t + 1 ) + " " + total ) ;
        outhandle . write ( outhandle ) ;
      }
    }
  }
  return outputLine ;
}
