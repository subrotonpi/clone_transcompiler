public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = map . get ( input ) ;
  List < int [ ] > S = new ArrayList < > ( Arrays . asList ( A ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S . add ( new int [ ] {
      i , i }
      ) ;
    }
    S . add ( new int [ ] {
      0 , N }
      ) ;
      int [ ] [ ] B = new int [ N ] [ ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        B [ i ] = 0 ;
      }
      int num = S . get ( 0 ) [ 1 ] ;
      for ( int i = 1 ;
      i <= N ;
      i ++ ) {
        if ( S . get ( i - 1 ) [ 0 ] > S . get ( i ) [ 0 ] ) {
          B [ num ] += ( S . get ( i - 1 ) [ 0 ] - S . get ( i ) [ 0 ] ) * i ;
        }
        num = Math . min ( num , S . get ( i ) [ 1 ] ) ;
      }
      for ( int b : B ) {
        System . out . println ( b ) ;
      }
    }
    