@ GwtIncompatible ( "collections" ) private static int [ ] solve ( String s , int n ) throws Exception {
  String [ ] vowels = {
    "a" , "e" , "i" , "o" , "u" }
    ;
    int total = 0 ;
    boolean isFirst = true ;
    int cont = 0 ;
    int [ ] arr = new int [ s . length ( ) ] ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      arr [ i ] = 0 ;
    }
    if ( ! vowels [ s . charAt ( i ) ] . equals ( s . charAt ( 0 ) ) ) {
      cont = 1 ;
      if ( n == 1 ) {
        isFirst = false ;
        lastCont = 0 ;
        arr [ 0 ] = 1 ;
      }
    }
    for ( int i = 1 ;
    i < s . length ( ) ;
    i ++ ) {
      if ( vowels [ s . charAt ( i ) ] . equals ( s . charAt ( i ) ) ) {
        cont = 0 ;
        arr [ i ] = arr [ i - 1 ] ;
      }
      else {
        cont ++ ;
        if ( cont < n ) {
          arr [ i ] = arr [ i - 1 ] ;
        }
        else if ( cont == n ) {
          if ( isFirst ) {
            isFirst = false ;
            arr [ i ] = i + 2 - n ;
            lastCont = i ;
          }
          else {
            arr [ i ] = i - lastCont + arr [ i - 1 ] ;
            lastCont = i ;
          }
        }
        else if ( cont > n ) {
          arr [ i ] = arr [ i - 1 ] + 1 ;
          lastCont = i ;
        }
        else throw new Exception ( "wo" ) ;
      }
    }
    System . out . println ( arr ) ;
    return Arrays . copyOf ( arr , total ) ;
  }
  