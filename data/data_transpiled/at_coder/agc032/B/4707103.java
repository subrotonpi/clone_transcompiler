public static List < int [ ] > solve ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < int [ ] > ans = new ArrayList < > ( ) ;
  if ( n % 2 == 0 ) {
    int [ ] [ ] p = new int [ n ] [ n / 2 + 1 ] ;
    for ( int i = 1 ;
    i <= n / 2 ;
    i ++ ) {
      for ( int x = 0 ;
      x < p [ i ] . length ;
      x ++ ) {
        for ( int j = i + 1 ;
        j < p [ i ] . length ;
        j ++ ) {
          for ( int y = 0 ;
          y < p [ j ] . length ;
          y ++ ) {
            ans . add ( new int [ ] {
              x , y }
              ) ;
            }
          }
        }
      }
    }
    else {
      int [ ] [ ] p = new int [ n ] [ n - 1 ] ;
      for ( int i = 1 ;
      i <= ( n - 1 ) / 2 ;
      i ++ ) {
        for ( int x = 0 ;
        x < p [ i ] . length ;
        x ++ ) {
          for ( int j = i + 1 ;
          j < p [ i ] . length ;
          j ++ ) {
            for ( int y = 0 ;
            y < p [ j ] . length ;
            y ++ ) {
              ans . add ( new int [ ] {
                x , y }
                ) ;
              }
            }
          }
        }
      }
      System . out . println ( ans . size ( ) ) ;
      for ( int [ ] edge : ans ) {
        System . out . println ( edge [ 0 ] + " " + edge [ 1 ] ) ;
      }
      return ans ;
    }
    