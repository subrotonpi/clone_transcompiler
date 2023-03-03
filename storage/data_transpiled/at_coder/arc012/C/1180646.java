static boolean [ ] [ ] field = new boolean [ 19 ] [ 19 ] ;
List < List < Integer >> bs = new ArrayList < List < Integer >> ( ) ;
List < List < Integer >> ws = new ArrayList < List < Integer >> ( ) ;
for ( int i = 0 ;
i < 19 ;
i ++ ) {
  String row = input . next ( ) ;
  for ( int j = 0 ;
  j < row . length ( ) ;
  j ++ ) {
    String r = row . substring ( i , j + 1 ) ;
    field [ i ] [ j ] = r ;
    if ( r . equals ( "x" ) ) ws . add ( new ArrayList < Integer > ( ) ) ;
    else if ( r . equals ( "o" ) ) bs . add ( new ArrayList < Integer > ( ) ) ;
  }
}
int [ ] [ ] vector = {
  {
    - 1 , 1 }
    , {
      0 , 1 }
      , {
        1 , 1 }
        , {
          1 , 0 }
        }
        ;
        /* check if there is no solution */
        boolean [ ] [ ] busy = {
          {
            - 1 , 1 }
            , {
              0 , 1 }
              , {
                1 , 1 }
                , {
                  1 , 0 }
                }
                ;
                /* check if there is no solution */
                for ( int i = 0 ;
                i < 19 ;
                i ++ ) {
                  int [ ] v = vector [ i ] ;
                  int count = 0 ;
                  for ( int j = 0 ;
                  j < v . length ;
                  j ++ ) {
                    int nx = v [ j ] + v [ j ] ;
                    int ny = v [ j ] + v [ j ] ;
                    if ( 0 <= nx && nx <= 18 && 0 <= ny && ny <= 18 ) {
                      if ( busy [ nx ] [ ny ] > 0 ) {
                        count ++ ;
                        return busy [ nx ] [ ny ] [ v ] ;
                      }
                      else {
                        return busy [ ny ] [ v ] ;
                      }
                    }
                  }
                  /* check if there is no solution */
                  boolean [ ] [ ] busy = {
                    - 1 , - 1 }
                    ;
                    boolean r = false ;
                    int dif = ( bs . size ( ) - ws . size ( ) ) ;
                    boolean bwon = isWon ( bs ) ;
                    boolean wwon = isWon ( ws ) ;
                    if ( dif == 0 && dif == 1 ) {
                      r = true ;
                    }
                    else {
                      if ( bwon && wwon ) {
                        if