public static void f ( int R , int C , int [ ] [ ] M , int D ) {
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    for ( int j = 0 ;
    j < C ;
    j ++ ) {
      M [ i ] [ j ] += D ;
    }
  }
  {
    int xc = 0 ;
    int yc = w / 2 ;
    double rx = 0 ;
    double ry = 0 ;
    for ( int i = 0 ;
    i < w ;
    i ++ ) {
      for ( int j = 0 ;
      j < w ;
      j ++ ) {
        if ( ( i == 0 && j == 0 ) || ( i == 0 && j == w - 1 ) || ( j == 0 && i == w - 1 ) || ( i == w - 1 && j == w - 1 ) ) {
          continue ;
        }
        rx += ( i + 0.5 - xc ) * M [ x + i ] [ y + j ] ;
        ry += ( j + 0.5 - yc ) * M [ x + i ] [ y + j ] ;
      }
    }
    return rx == ry ? 0 : 1 ;
  }
  for ( int k = Math . min ( R , C ) ;
  k > 2 ;
  k -- ) {
    for ( int i = 0 ;
    i <= R - k ;
    i ++ ) {
      for ( int j = 0 ;
      j <= C - k ;
      j ++ ) {
        if ( isincenter ( i , j , k ) ) {
          return k ;
        }
      }
    }
  }
  /* IMPOSSIBLE */
  Scanner fin = new Scanner ( new File ( "B-small-attempt1.in" ) ) ;
  PrintWriter fout = new PrintWriter ( new File ( "B-small-attempt1.out" ) ) ;
  Function < String , String > rstr = new Function < String , String > ( ) {
    public String apply ( String f ) {
      return ( String ) f . replaceAll ( "" , "" ) ;
    }
  }
  ;
  Function < Integer , Integer > rint = new Function < Integer , Integer > ( ) {
    public Integer apply ( Integer f ) {
      return Integer . parseInt ( ( String ) f . replaceAll ( "" , "" ) ) ;
    }
  }
  ;
  Function < Integer , Integer > rints = new Function < Integer , Integer > ( ) {
    public Integer apply ( Integer f ) {
      return Integer . parseInt ( ( String ) f . trim ( ) ) ;
    }
  }
  ;
  Function < Integer , Integer > rints2 = new Function < Integer ,