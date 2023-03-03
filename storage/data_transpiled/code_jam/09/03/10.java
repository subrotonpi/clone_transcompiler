@ VisibleForTesting static String [ ] getTestData ( ) throws IOException {
  final String [ ] args = new String [ ] {
    "C-small-attempt0.txt" , "C-large.in.txt" }
    ;
    final String [ ] result = new String [ ] {
      "C-small-attempt0.txt" , "C-large.in.txt" }
      ;
      final BufferedReader br = new BufferedReader ( new FileReader ( args [ 0 ] ) ) ;
      final StringBuilder sb = new StringBuilder ( ) ;
      final int n = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
      final String base = "welcome to code jam" ;
      for ( int xm1 = 0 ;
      xm1 < n ;
      xm1 ++ ) {
        final String search = br . readLine ( ) . trim ( ) ;
        int [ ] counts = ArrayUtil . toIntArray ( search . split ( " " ) ) ;
        final int [ ] rangelensearch = new int [ search . length ( ) ] ;
        for ( int j = 1 ;
        j < rangelensearch . length ;
        j ++ ) {
          counts = ArrayUtil . toIntArray ( rangelensearch [ j ] ) ;
        }
        for ( int j = 0 ;
        j < counts . length ;
        j ++ ) {
          counts [ j ] = ( search . charAt ( j ) == base . charAt ( base . charAt ( j ) ) ? Integer . parseInt ( counts [ j ] ) % 10000 : 0 ) ;
        }
        sb . append ( String . format ( "Case #%d: %04d\n" , xm1 + 1 , Integer . parseInt ( counts [ 0 ] ) % 10000 ) ) ;
      }
      if ( sb . toString ( ) . endsWith ( ".out" ) ) {
        System . out . println ( sb . toString ( ) ) ;
        return result ;
      }
      final String [ ] TEST_DATA = new String [ ] {
        "C-small-attempt0.txt" , "C-large.in.txt" }
        ;
        Assert . assertEquals ( "C-small-attempt0.txt" , TEST_DATA [ 0 ] ) ;
        List < String > l = System . readLines ( TEST_DATA ) ;
        if ( l . isEmpty ( ) ) {
          l = new ArrayList < String > ( ) ;
          l . add ( "C-large.in.txt" ) ;
        }
        for ( String s : l ) {
          process ( s ) ;
        }
        return result ;
      }
      