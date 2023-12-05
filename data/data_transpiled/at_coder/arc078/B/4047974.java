public static void print ( int N ) {
  int [ ] [ ] edge = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int go = Integer . parseInt ( input . nextLine ( ) ) ;
    int to = Integer . parseInt ( input . nextLine ( ) ) ;
    go -- ;
    to -- ;
    edge [ go ] [ i ] = to ;
    edge [ to ] [ i ] = go ;
  }
  @ SuppressWarnings ( "unchecked" ) Queue < Integer > que = new LinkedList < Integer > ( ) ;
  que . add ( new Integer [ ] {
    0 , 0 }
    ) ;
    int [ ] dist0 = new int [ N ] ;
    int [ ] distn = new int [ N ] ;
    while ( ( v = que . poll ( ) ) != null ) {
      int c = v . intValue ( ) ;
      int d = v . intValue ( ) ;
      for ( int i : edge [ c ] ) {
        if ( dist0 [ i ] == 0 ) {
          dist0 [ i ] = d + 1 ;
          que . add ( new Integer [ ] {
            i , d + 1 }
            ) ;
          }
        }
      }
      que . add ( new Integer [ ] {
        N - 1 , 0 }
        ) ;
        while ( ( v = que . poll ( ) ) != null ) {
          int c = v . intValue ( ) ;
          int d = v . intValue ( ) ;
          for ( int i : edge [ c ] ) {
            if ( distn [ i ] == 0 ) {
              distn [ i ] = d + 1 ;
              que . add ( new Integer [ ] {
                i , d + 1 }
                ) ;
              }
            }
          }
          int w = 0 ;
          int b = 0 ;
          for ( int i = 0 ;
          i < dist0 . length ;
          i ++ ) {
            int d1 = dist0 [ i ] ;
            int dn = distn [ i ] ;
            if ( d1 <= dn ) {
              b ++ ;
            }
            else {
              w ++ ;
            }
          }
          System . out . println ( b - w > 0 ? "Fennec" : "Snuke" ) ;
        }
        