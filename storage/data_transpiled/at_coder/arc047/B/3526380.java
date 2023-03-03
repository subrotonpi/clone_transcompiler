public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] src = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    src [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  float INF = Float . MAX_VALUE ;
  float mina = 0 ;
  float minb = INF ;
  float maxa = 0 ;
  float maxb = - INF ;
  for ( int i = 0 ;
  i < src . length ;
  i ++ ) {
    float x = src [ i ] [ 0 ] ;
    float y = src [ i ] [ 1 ] ;
    float a = x + y ;
    float b = x - y ;
    mina = Math . min ( a , mina ) ;
    minb = Math . min ( b , minb ) ;
    maxa = Math . max ( a , maxa ) ;
    maxb = Math . max ( b , maxb ) ;
  }
  float d = Math . max ( maxa - mina , maxb - minb ) ;
  float [ ] aCands = {
    maxa - d / 2 , mina + d / 2 }
    ;
    float [ ] bCands = {
      maxb - d / 2 , minb + d / 2 }
      ;
      for ( int i = 0 ;
      i < aCands . length ;
      i ++ ) {
        float a = ( a + b ) / 2 , b = ( a - b ) / 2 ;
        float x0 = src [ i ] [ 0 ] ;
        float y0 = src [ i ] [ 1 ] ;
        float d0 = Math . abs ( x - x0 ) + Math . abs ( y - y0 ) ;
        for ( int j = 0 ;
        j < src [ i ] . length ;
        j ++ ) {
          float xi = src [ i ] [ j ] ;
          float yi = src [ i ] [ j ] ;
          float di = Math . abs ( x - xi ) + Math . abs ( y - yi ) ;
          if ( d0 != di ) {
            break ;
          }
        }
        else {
          System . out . println ( x + " " + y ) ;
          exit ( ) ;
        }
      }
      return 0 ;
    }
    