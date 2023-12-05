static final int [ ] [ ] getProducts ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] t = {
    A , B , C }
    ;
    int [ ] l = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    int ans = 999999999 ;
    int count = 0 ;
    List < int [ ] > products = Lists . newArrayList ( ) ;
    for ( int [ ] p : products ) {
      int [ ] [ ] scoresG = {
        {
          0 , 0 }
          , {
            0 , 0 }
            , {
              0 , 0 }
              , {
                0 , 0 }
              }
              ;
              for ( int i = 0 ;
              i < p . length ;
              i ++ ) {
                scoresG [ p [ i ] ] [ 0 ] += l [ i ] ;
                scoresG [ p [ i ] ] [ 1 ] ++ ;
              }
              for ( int g = 0 ;
              g < 3 ;
              g ++ ) {
                if ( scoresG [ g ] [ 1 ] == 0 ) {
                  count = 999999999 ;
                  continue ;
                }
                else {
                  count += Math . abs ( scoresG [ g ] [ 0 ] - t [ g ] ) + ( scoresG [ g ] [ 1 ] - 1 ) * 10 ;
                }
              }
              if ( ans > count ) {
                ans = count ;
              }
              count = 0 ;
            }
            System . out . println ( ans ) ;
            return t ;
          }
          