public static int [ ] [ ] ints ( Scanner input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int maxW = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] ints = input . nextLine ( ) . split ( "\\s+" ) ;
  int a = Integer . parseInt ( ints [ 0 ] ) ;
  int b = Integer . parseInt ( ints [ 1 ] ) ;
  int [ ] weight = {
    a , a + 1 , a + 2 , a + 3 }
    ;
    int [ ] [ ] va = {
      {
        b }
        , {
        }
        , {
        }
        , {
        }
      }
      ;
      for ( int i = 1 ;
      i < N ;
      i ++ ) {
        String ins = input . nextLine ( ) ;
        int w = Integer . parseInt ( ins [ 0 ] ) ;
        int v = Integer . parseInt ( ins [ 1 ] ) ;
        for ( int j = 0 ;
        j <= 4 ;
        j ++ ) {
          if ( w == weight [ j ] ) {
            va [ j ] [ v ] = i ;
          }
        }
      }
      for ( int i = 0 ;
      i <= va . length ;
      i ++ ) {
        Arrays . sort ( va [ i ] , Collections . reverseOrder ( ) ) ;
        va [ i ] [ 0 ] = 0 ;
      }
      int [ ] [ ] sum = {
        {
          0 }
          , {
            0 }
            , {
              0 }
              , {
                0 }
              }
              ;
              for ( int j = 0 ;
              j <= 4 ;
              j ++ ) {
                for ( int i = 1 ;
                i < va [ j ] . length ;
                i ++ ) {
                  try {
                    sum [ j ] [ i ] = sum [ j ] [ i - 1 ] + va [ j ] [ i ] ;
                  }
                  catch ( Exception e ) {
                  }
                }
              }
              int ans = 0 ;
              for ( int i = 0 ;
              i <= va [ 0 ] . length ;
              i ++ ) {
                for ( int j = 0 ;
                j <= va [ 1 ] . length ;
                j ++ ) {
                  for ( int k = 0 ;
                  k <= va [ 2 ] . length ;
                  k ++ ) {
                    for ( int l = 0 ;
                    l <= va [ 3 ] . length ;
                    l ++ ) {
                      int sumw = weight [ 0 ] * i + weight [ 1 ] * j + weight [ 2 ] * k + weight [ 3 ] * l ;
                      if ( ( sumw <= maxW ) && ( sumw > maxW ) ) {
                        ans = Math . max ( sum [ 0 ] [ i ]