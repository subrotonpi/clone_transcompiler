static final String getPrintLine ( ) {
  final String outputLine = "Case #{X:d}: {Y:d}" ;
  final Class < ? > Rope = Class . forName ( "org.apache.hadoop.util.StringUtils" ) ;
  if ( Class . forName ( "org.apache.hadoop.util.StringUtils" ) . isAssignableFrom ( Rope ) ) {
    final String in = System . getProperty ( "test.src" ) ;
    final String out = System . getProperty ( "test.dst" ) ;
    try ( final BufferedReader inHandle = new BufferedReader ( new FileReader ( in ) ) ;
    final BufferedWriter outhandle = new BufferedWriter ( new FileWriter ( out ) ) ) {
      final int T = Integer . parseInt ( inHandle . readLine ( ) ) ;
      for ( int t = 0 ;
      t < T ;
      t ++ ) {
        final int L = Integer . parseInt ( inHandle . readLine ( ) ) ;
        final int P = Integer . parseInt ( inHandle . readLine ( ) ) ;
        final int C = Integer . parseInt ( inHandle . readLine ( ) ) ;
        final double stage1 = Math . log ( new Fraction ( P , L ) ) ;
        final double stage2 = Math . log ( stage1 ) ;
        final int numTests = Math . max ( 0 , Math . ceil ( stage2 ) ) ;
        System . out . println ( stage1 + " " + stage2 + " " + numTests ) ;
        outhandle . write ( outputLine . replace ( X , t + 1 , Y ) ) ;
        outhandle . write ( outputLine . replace ( Y , t + 1 , numTests ) ) ;
      }
    }
  }
  return outputLine ;
}
