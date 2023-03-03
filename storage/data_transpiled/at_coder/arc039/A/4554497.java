public static void input ( ) {
  String a = map . get ( String . valueOf ( input ) ) ;
  String b = map . get ( String . valueOf ( input ) ) ;
  int [ ] [ ] c = {
    {
      9 , 1 }
      , {
        9 , 0 }
        , {
          9 , 0 }
        }
        ;
        int e = Integer . parseInt ( a ) - Integer . parseInt ( b ) ;
        int [ ] h = new int [ 3 ] ;
        for ( int i = 0 ;
        i < 3 ;
        i ++ ) {
          int d = ( 10 * ( 2 - i ) ) * Math . max ( c [ i ] [ 0 ] - Integer . parseInt ( a ) , c [ i ] [ 1 ] - c [ i ] [ 2 ] ) ;
          h [ i ] = e + d ;
        }
        System . out . println ( max ( h ) ) ;
      }
      