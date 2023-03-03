public static boolean isNBoolean ( ) {
  String S = input ;
  boolean [ ] [ ] boolArray = {
    {
      true , true }
      , {
        true , false }
        , {
          false , true }
          , {
            false , false }
          }
          ;
          boolean flag = false ;
          for ( boolean [ ] boo : boolArray ) {
            LinkedList < Boolean > ansList = new LinkedList < Boolean > ( boo ) ;
            for ( int i = 1 ;
            i < N ;
            i ++ ) {
              if ( S . charAt ( i ) == 'o' ) {
                if ( ansList . get ( i ) ) {
                  if ( ansList . get ( i - 1 ) ) ansList . add ( true ) ;
                  else ansList . add ( false ) ;
                }
                else {
                  if ( ansList . get ( i - 1 ) ) ansList . add ( false ) ;
                  else ansList . add ( true ) ;
                }
              }
              else {
                if ( ! ansList . get ( i ) ) {
                  if ( ansList . get ( i - 1 ) ) ansList . add ( true ) ;
                  else ansList . add ( false ) ;
                }
                else {
                  if ( ansList . get ( i - 1 ) ) ansList . add ( false ) ;
                  else ansList . add ( true ) ;
                }
              }
            }
            if ( S . charAt ( 0 ) == 'o' ) {
              if ( ansList . get ( 0 ) ) {
                if ( ansList . get ( 1 ) ) {
                  N_cand = true ;
                }
                else {
                  N_cand = false ;
                }
              }
              else {
                if ( ansList . get ( 1 ) ) {
                  N_cand = false ;
                }
                else {
                  N_cand = true ;
                }
              }
            }
            else {
              if ( ! ansList . get ( 0 ) ) {
                if ( ansList . get ( 1 ) ) {
                  N_cand = true ;
                }
                else {
                  N_cand = false ;
                }
              }
              else {
                if ( ansList . get ( 1 ) ) {
                  N_cand = false ;
                }
                else {
                  N_cand = true ;
                }
              }
            }
            if ( ansList . get ( 0 ) . equals ( ansList . get ( N ) ) && N_cand . equals ( ansList . get ( N - 1 ) ) ) {
              flag = true ;
              break ;
            }
          }
          if ( flag ) {
            String ans = "" ;
            for ( int a = ansList . size ( ) - 1 ;
            a >= 0 ;
            a -- ) {
              if ( ansList . get ( a ) ) {
                ans