@ VisibleForTesting static int getAnswerForCombs ( ) {
  final int MODULO = 1000000007 ;
  final int [ ] FACT_ARRAY = {
    1 , 1 }
    ;
    final int [ ] fact = new int [ ] {
      FACT_ARRAY [ 0 ] , FACT_ARRAY [ 1 ] }
      ;
      if ( FACT_ARRAY . length >= FACT_ARRAY . length ) {
        int curr_n = FACT_ARRAY . length ;
        for ( int c : xrange ( curr_n , FACT_ARRAY . length ) ) {
          FACT_ARRAY [ curr_n ] = ( FACT_ARRAY [ curr_n ] * c ) % MODULO ;
        }
      }
      final String infile = argv [ 1 ] ;
      final String outfile = argv [ 2 ] ;
      try {
        final InputStreamReader fin = new InputStreamReader ( new FileInputStream ( infile ) , "UTF-8" ) ;
        final OutputStreamWriter fout = new OutputStreamWriter ( new FileOutputStream ( outfile ) , "UTF-8" ) ;
        final int T = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
        for ( int i = 1 ;
        i < T ;
        i ++ ) {
          final int caseNum = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
          final int N = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
          final String [ ] strs = fin . readLine ( ) . split ( " " ) ;
          assert strs . length == N : "Case " + caseNum + ": " + result ;
          fout . write ( "Case #" + caseNum + ": " + result ) ;
        }
      }
      catch ( final IOException e ) {
        e . printStackTrace ( ) ;
      }
      if ( __name__ == "__main__" ) {
        final int status = main ( ) ;
        System . exit ( status ) ;
      }
      return 0 ;
    }
    