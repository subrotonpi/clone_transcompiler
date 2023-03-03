public static String [ ] [ ] L = list ( map ( input . split ( " " ) ) ) ;
String [ ] A = {
  "a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i" , "j" }
  ;
  String [ ] a = {
    "0" , "1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" }
    ;
    int [ ] [ ] c = new int [ N ] [ ] ;
    int N = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      String s = input . split ( " " ) [ 0 ] ;
      String s1 = "" ;
      for ( int j = 0 ;
      j < s . length ( ) ;
      j ++ ) {
        for ( int k = 0 ;
        k < L . length ;
        k ++ ) {
          if ( s . charAt ( j ) == L [ k ] ) {
            s1 += a [ k ] ;
          }
        }
      }
      c [ i ] = Integer . parseInt ( s1 ) ;
    }
    Arrays . sort ( c ) ;
    for ( int x = 0 ;
    x < N ;
    x ++ ) {
      c [ x ] = Integer . toString ( c [ x ] [ x ] ) ;
      String C = "" ;
      for ( int y = 0 ;
      y < c [ x ] . length ;
      y ++ ) {
        for ( int z = 0 ;
        z < a . length ;
        z ++ ) {
          if ( c [ x ] [ y ] . equals ( a [ z ] ) ) {
            C += L [ z ] ;
          }
        }
      }
      System . out . println ( C ) ;
    }
    