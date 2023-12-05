static final int [ ] [ ] getStrings ( ) {
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  String ban = new String ( input . readLine ( ) ) ;
  int [ ] jouge = {
    0 , 1 , 1 , 1 , 0 , - 1 , - 1 , - 1 }
    ;
    int [ ] sayuu = {
      1 , 1 , 0 , - 1 , - 1 , - 1 , 0 , 1 }
      ;
      int [ ] [ ] fukugen = new int [ h ] [ w ] ;
      for ( int i = 0 ;
      i < h ;
      i ++ ) {
        for ( int j = 0 ;
        j < w ;
        j ++ ) {
          if ( ban . charAt ( i ) == '.' ) {
            fukugen [ i ] [ j ] = 1 ;
            for ( int k = 0 ;
            k < 8 ;
            k ++ ) {
              int ka = jouge [ k ] ;
              int kb = sayuu [ k ] ;
              if ( 0 <= i + ka && 0 <= j + kb && j + kb < w ) {
                fukugen [ i + ka ] [ j + kb ] = 1 ;
              }
            }
          }
        }
      }
      int [ ] [ ] check = new int [ h ] [ w ] ;
      for ( int i = 0 ;
      i < h ;
      i ++ ) {
        for ( int j = 0 ;
        j < w ;
        j ++ ) {
          if ( fukugen [ i ] [ j ] == 0 ) {
            check [ i ] [ j ] = 0 ;
            for ( int k = 0 ;
            k < 8 ;
            k ++ ) {
              int ka = jouge [ k ] ;
              int kb = sayuu [ k ] ;
              if ( 0 <= i + ka && 0 <= j + kb && 0 <= i + kb && j + kb < w ) {
                check [ i + ka ] [ j + kb ] = 0 ;
              }
            }
          }
        }
      }
      int ok = 1 ;
      for ( int i = 0 ;
      i < h ;
      i ++ ) {
        for ( int j = 0 ;
        j < w ;
        j ++ ) {
          if ( check [ i ] [ j ] == 1 && ban . charAt ( i ) == '#' ) {
            ok = 0 ;
            break ;
          }
          if ( check [ i ] [ j ] == 0 && ban . charAt ( i ) == '.' ) {
            ok = 0 ;
            break ;
          }
        }
      }
      if (