static final String [ ] args = new String [ ] {
  "--input" , "--output" , "--output" , "--output" , "--output" , "--output" , "--output" , "--output" }
  ;
  final String [ ] args = new String [ ] {
    "--input" }
    ;
    if ( args . length != 2 ) {
      System . err . println ( "specify input file" ) ;
      exit ( ) ;
    }
    final long startTime = System . nanoTime ( ) ;
    final BufferedReader fin = new BufferedReader ( new FileReader ( args [ 0 ] ) ) ;
    final PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( new File ( args [ 1 ] ) + ".out" ) ) ) ;
    {
      final int n = fin . read ( ) ;
      assert Lists . reverse ( Arrays . asList ( args ) ) . size ( ) != 0 ;
      for ( int i = 0 ;
      i < n - 1 ;
      i ++ ) {
        if ( args [ i ] . compareTo ( args [ i + 1 ] ) < 0 ) {
          break ;
        }
      }
      final String [ ] tail = Arrays . copyOf ( args , n + 1 ) ;
      final int q = Math . min ( tail . length , n ) ;
      final int j = tail . indexOf ( q ) ;
      args [ i ] = tail [ j ] ;
      args [ j ] = args [ i ] ;
      Arrays . sort ( args ) ;
    }
    {
      final String n = ( String ) fin . read ( ) . trim ( ) ;
      n = "0" + n ;
      final StringBuilder sb = new StringBuilder ( n ) ;
      nextPerm ( sb ) ;
      while ( sb . length ( ) > 1 && sb . charAt ( 0 ) == '0' ) {
        sb . delete ( 1 , sb . length ( ) ) ;
      }
      print ( fout . flush ( ) , sb ) ;
    }
  }
  