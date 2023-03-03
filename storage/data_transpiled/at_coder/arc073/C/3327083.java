public static double [ ] [ ] N = Integer . parseInt ( input ) {
  int [ ] X = new int [ N ] ;
  int [ ] Y = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    X [ i ] = new int [ ] {
      x , y }
      ;
      Y [ i ] = new int [ ] {
        x , y }
        ;
      }
      double ans = ( max ( X ) - min ( X ) ) * ( max ( Y ) - min ( Y ) ) ;
      ArrayList < Integer > L = new ArrayList < Integer > ( ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        L . add ( new Integer [ ] {
          x , y }
          ) ;
        }
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          L . add ( new Integer [ ] {
            y }
            ) ;
          }
          Collections . sort ( L ) ;
          int [ ] checker = new int [ N ] ;
          int cnt = 0 ;
          double mi = Double . MAX_VALUE ;
          int j = 0 ;
          for ( int xy : L ) {
            int n = xy ;
            int n = n ;
            if ( checker [ n ] == 0 ) {
              cnt ++ ;
              checker [ n ] = 1 ;
            }
            else {
              mi = xy ;
            }
          }
          return checker ;
        }
        