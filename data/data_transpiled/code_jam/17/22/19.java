static final String solve ( ) {
  final String [ ] args = new String [ ] {
    "-v" , "-c" , "-p" , "-p" }
    ;
    final String [ ] args = new String [ ] {
      "-v" , "-p" , "-p" }
      ;
      final boolean verbose = false ;
      final String [ ] testCases = new String [ ] {
        Integer . parseInt ( args [ 0 ] ) , Integer . parseInt ( args [ 1 ] ) , Integer . parseInt ( args [ 2 ] ) , Integer . parseInt ( args [ 3 ] ) , Integer . parseInt ( args [ 4 ] ) , Integer . parseInt ( args [ 5 ] ) , Integer . parseInt ( args [ 6 ] ) , Integer . parseInt ( args [ 7 ] ) , Integer . parseInt ( args [ 8 ] ) }
        ;
        final String [ ] testCases = new String [ args . length ] ;
        for ( int i = 0 ;
        i < args . length ;
        i ++ ) {
          testCases [ i ] = read ( args [ i ] ) ;
          if ( verbose ) {
            System . err . println ( "Solving " + args [ i ] + " test cases" ) ;
            for ( int j = 0 ;
            j < args . length ;
            j ++ ) {
              System . err . print ( args [ j ] ) ;
            }
            System . err . flush ( ) ;
          }
          else {
            testCases [ i ] = solve ( args [ i ] ) ;
          }
        }
        final String [ ] result = new String [ testCases . length ] ;
        for ( int i = 0 ;
        i < testCases . length ;
        i ++ ) {
          result [ i ] = testCases [ i ] . substring ( 0 , i ) ;
        }
        if ( verbose ) {
          System . err . println ( "\n" ) ;
          System . err . flush ( ) ;
        }
        final int t = Integer . parseInt ( args [ 0 ] ) ;
        if ( verbose ) {
          System . err . println ( "\n" ) ;
          System . err . flush ( ) ;
        }
        final int n = r + y + b ;
        final int a = Integer . parseInt ( args [ 1 ] ) ;
        final int b = Integer . parseInt ( args [ 2 ] ) ;
        final int c = Integer . parseInt ( args [ 3 ] ) ;
        final int n = Integer . parseInt ( args [ 4 ] ) ;
        if ( verbose ) {
          System . err . println ( "\n" ) ;
          System . err .