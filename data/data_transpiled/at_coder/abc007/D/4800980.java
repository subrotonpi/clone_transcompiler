static final double [ ] [ ] copy ( ) {
  String [ ] AB = input ( ) . split ( " " ) ;
  double [ ] [ ] Ans = {
    0 , 0 }
    ;
    AB [ 0 ] = String . valueOf ( Integer . parseInt ( AB [ 0 ] ) - 1 ) ;
    for ( int i = 0 ;
    i < 2 ;
    i ++ ) {
      int [ ] [ ] Dset = {
        2 , 2 , AB [ i ] . length + 1 }
        ;
        double [ ] [ ] D = {
          0 }
          ;
          for ( int j = 0 ;
          j < 3 ;
          j ++ ) {
            D = new double [ Dset [ j ] . length ] [ D [ j ] . length ] ;
            for ( int k = 0 ;
            k < D . length ;
            k ++ ) {
              D [ k ] [ D [ k ] . length ] = Double . valueOf ( D [ k ] [ D [ k ] . length ] ) ;
            }
          }
          D [ 0 ] [ 1 ] [ 0 ] = 1 ;
          for ( int j = 0 ;
          j < AB [ i ] . length ;
          j ++ ) {
            int t = Integer . parseInt ( AB [ i ] [ j ] ) ;
            double a , b , c , d ;
            if ( t < 4 ) a = ( t == 0 ? 0 : 1 ) ;
            else if ( t == 4 ) a = ( 4 ) ;
            else if ( t == 9 ) a = ( t - 1 ? 0 : 1 ) ;
            else if ( t < 9 ) a = ( t - 1 ? 1 : 0 ) ;
            else {
              a = 8 ;
            }
            b = ( t == 8 ) ;
            c = ( t == 9 ) ;
            d = ( t == 9 ) ;
            D [ j + 1 ] [ 0 ] = D [ j ] [ 0 ] [ 0 ] * 8 + D [ j ] [ 1 ] [ 0 ] * a ;
            D [ j + 1 ] [ 0 ] = D [ j ] [ 0 ] [ 0 ] * 2 + D [ j ] [ 0 ] * 10 + D [ j ] [ 1 ] [ 0 ] * b + D [ j ] [ 1 ] [ 1 ] * t ;
            D [ j + 1 ] [ 1 ] [ 0 ] = D [ j ] [ 1 ] [ 0 ] * c ;
            D [ j + 1 ] [ 1 ] [ 1 ] = D [ j ] [ 1 ] * d + D [ j ] [ 1 ] ;
          }
          