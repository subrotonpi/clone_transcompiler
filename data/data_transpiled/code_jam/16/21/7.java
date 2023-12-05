@ Produces @ Named ( "D" ) public static String [ ] [ ] solve ( ) {
  String [ ] D = {
    "ZERO" , "ONE" , "TWO" , "THREE" , "FOUR" , "FIVE" , "SIX" , "SEVEN" , "EIGHT" , "NINE" }
    ;
    List < Integer > L = Arrays . asList ( new Integer [ ] {
      'Z' , 0 }
      , new Integer [ ] {
        'X' , 6 }
        , new Integer [ ] {
          'W' , 2 }
          , new Integer [ ] {
            'S' , 7 }
            , new Integer [ ] {
              'G' , 8 }
              , new Integer [ ] {
                'T' , 3 }
                , new Integer [ ] {
                  'V' , 5 }
                  , new Integer [ ] {
                    'F' , 4 }
                    , new Integer [ ] {
                      'I' , 9 }
                      , new Integer [ ] {
                        'N' , 1 }
                        ) ;
                        /* C = new Integer(10);
                        for (int i = 0; i < L.size(); i++) {
                        C.set(i, 1);
                        }
                        int[] R = new int[10];
                        for (int i = 0; i < L.size(); i++) {
                        R[i] = C.get(i);
                        R[i] += R[i];
                        for (int j = 0; j < D.get(j); j++) {
                        R[j] = R[j];
                        }
                        }
                        return R;*/
                        int t = Integer . parseInt ( input . nextLine ( ) ) ;
                        for ( int i = 0 ;
                        i < t ;
                        i ++ ) {
                          String S = input . nextLine ( ) ;
                          System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( S ) ) ;
                        }
                        return L . toArray ( new String [ 0 ] [ 10 ] ) ;
                      }
                      