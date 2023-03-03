@ VisibleForTesting static void shuffle ( ) {
  final Map < Integer , List < String >> strategies = new HashMap < > ( 2 ) ;
  strategies . put ( 2 , Arrays . asList ( new String [ ] {
    "a" , "b" , "c" }
    ) ) ;
    strategies . put ( 3 , Arrays . asList ( new String [ ] {
      "a" , "b" , "c" }
      ) ) ;
      strategies . put ( 4 , Arrays . asList ( new String [ ] {
        "a" , "b" , "c" }
        ) ) ;
        int T = Integer . parseInt ( input ( ) . trim ( ) ) ;
        for ( int t = 0 ;
        t < T ;
        t ++ ) {
          System . out . print ( "Case #" + ( t + 1 ) + ": " ) ;
          int ngroups = Integer . parseInt ( input ( ) . trim ( ) ) ;
          int packsize = Integer . parseInt ( input ( ) . trim ( ) ) ;
          int [ ] groups = Ints . fromByteArray ( input ( ) . trim ( ) ) ;
          List < String > strategy = strategies . get ( packsize ) ;
          List < Integer > modgroups = Lists . newArrayList ( ) ;
          for ( int i : groups ) {
            modgroups . add ( i % packsize ) ;
          }
          int score = 0 ;
          for ( String value : strategy ) {
            String operation = strategy . get ( value ) ;
            int repetitions = Math . min ( Math . max ( modgroups . size ( ) , ( a , b ) -> a / b != 0 ? a / b : Double . MAX_VALUE ) , modgroups . size ( ) ) ;
            modgroups = Lists . newArrayList ( ) ;
            modgroups . add ( sub ( modgroups , mul ( operation , repeat ( repetitions ) ) ) ) ;
            score += value * repetitions ;
          }
          if ( Lists . newArrayList ( modgroups ) . size ( ) > 0 ) {
            score ++ ;
          }
          System . out . println ( score ) ;
        }
      }
      