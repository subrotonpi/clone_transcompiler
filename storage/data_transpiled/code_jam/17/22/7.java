static final void print ( String input , String output ) throws IOException {
  System . in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . out = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ) ;
  int T = input . nextInt ( ) ;
  int testCase = 0 ;
  while ( T > 0 ) {
    T -- ;
    int [ ] a = ArrayUtil . parseInt ( readLine ( input ) . split ( " " ) ) ;
    int n = a [ 0 ] ;
    int [ ] b = {
      a [ 4 ] , a [ 6 ] , a [ 2 ] }
      ;
      Arrays . sort ( a ) ;
      String output = "" ;
      for ( int i = 0 ;
      i < 3 ;
      i ++ ) {
        a [ i ] -= b [ i ] ;
        if ( a [ i ] < 0 ) {
          output = "IMPOSSIBLE" ;
        }
      }
      if ( output . isEmpty ( ) ) {
        a = new LinkedList < > ( Arrays . asList ( new String [ ] {
          "RYB" }
          ) ) ;
          a = ArrayUtil . remove ( a , 0 , "GVO" ) ;
          a = new LinkedList < > ( Arrays . asList ( new String [ ] {
            "RYB" }
            ) ) ;
            a = new LinkedList < > ( Arrays . asList ( a ) ) ;
            a = new LinkedList < > ( Arrays . asList ( new String [ ] {
              "GVO" }
              ) ) ;
              while ( a . size ( ) > 0 ) {
                String top ;
                if ( output . length ( ) == 0 || a [ 0 ] . charAt ( 2 ) != output . charAt ( output . length ( ) - 1 ) ) {
                  top = a [ 0 ] ;
                  a . remove ( 0 ) ;
                }
                else if ( a . size ( ) > 1 ) {
                  top = a [ 1 ] ;
                  a . remove ( 1 ) ;
                }
                else {
                  output = "IMPOSSIBLE" ;
                  break ;
                }
                output += top . charAt ( 2 ) ;
                top . charAt ( 0 ) -- ;
                if ( top . length ( ) > 0 ) {
                  a . add ( top ) ;
                  a = new LinkedList < > ( Arrays . asList ( a ) ) ;
                }
              }
              if ( output . length ( ) > 0 && output . charAt ( output . length ( ) - 1 ) == output . charAt ( output . length ( ) - 1 ) ) {
                output = "IMPOSSIBLE" ;
              }
            }
          }
          if ( output . length (