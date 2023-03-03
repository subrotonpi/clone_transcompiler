public static int [ ] [ ] recW ( int N , int W ) {
  int [ ] [ ] recW = new int [ 4 ] [ N ] ;
  int W0 = 0 , W1 = 0 , W2 = 0 , W3 = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int w = Integer . parseInt ( input . nextLine ( ) ) ;
    int v = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( i == 0 ) {
      recW [ 0 ] [ 0 ] = new int [ ] {
        w , v }
        ;
        W0 = w ;
        W1 = w ;
        W2 = w + 1 ;
        W3 = w + 2 ;
        W3 = w + 3 ;
      }
      else if ( w == W0 ) {
        recW [ 0 ] [ 0 ] = new int [ ] {
          w , v }
          ;
        }
        else if ( w == W0 + 1 ) {
          recW [ 1 ] [ 0 ] = new int [ ] {
            w , v }
            ;
          }
          else if ( w == W0 + 2 ) {
            recW [ 2 ] [ 0 ] = new int [ ] {
              w , v }
              ;
            }
            else {
              recW [ 3 ] [ 0 ] = new int [ ] {
                w , v }
                ;
              }
            }
            for ( int i = 0 ;
            i < 4 ;
            i ++ ) {
              recW [ i ] = new int [ ] {
                recW [ i ] [ 0 ] }
                ;
              }
              int a = recW [ 0 ] . length ;
              int b = recW [ 1 ] . length ;
              int c = recW [ 2 ] . length ;
              int d = recW [ 3 ] . length ;
              int [ ] recV0 = new int [ a + 1 ] ;
              for ( int i = 1 ;
              i <= a ;
              i ++ ) {
                recV0 [ i ] = recV0 [ i - 1 ] + recW [ 0 ] [ i - 1 ] [ 1 ] ;
              }
              int [ ] recV1 = new int [ b + 1 ] ;
              for ( int i = 1 ;
              i <= b ;
              i ++ ) {
                recV1 [ i ] = recV1 [ i - 1 ] + recW [ 1 ] [ i - 1 ] [ 1 ] ;
              }
              int [ ] recV2 = new int [ c + 1 ] ;
              for ( int i = 1 ;
              i <= c ;
              i ++ ) {
                recV2 [ i ] = recV2 [ i - 1 ] +