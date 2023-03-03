public static int K = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] V = new String [ N ] ;
  String [ ] W = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String v = input . nextLine ( ) ;
    String w = input . nextLine ( ) ;
    V [ i ] = v ;
    W [ i ] = w ;
  }
  int [ ] s = {
    1 , 2 , 3 }
    ;
    final int [ ] lengths = {
      1 , 2 , 3 }
      ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        int [ ] lengths = new int [ N ] ;
        for ( int j = 0 ;
        j < lengths . length ;
        j ++ ) {
          boolean ans = true ;
          for ( int j = 0 ;
          j < N ;
          j ++ ) {
            String v = V [ i ] ;
            String w = W [ i ] ;
            int length = 0 ;
            for ( int j = 0 ;
            j < v . length ( ) ;
            j ++ ) {
              j = Integer . parseInt ( v . substring ( j , j + 1 ) ) ;
              length += lengths [ j - 1 ] ;
            }
            if ( length != w . length ( ) ) {
              ans = false ;
              break ;
            }
          }
          if ( ! ans ) continue ;
          String [ ] l = new String [ K + 1 ] ;
          for ( int j = 0 ;
          j < N ;
          j ++ ) {
            String v = V [ i ] ;
            String w = W [ i ] ;
            for ( int j = 0 ;
            j < v . length ( ) ;
            j ++ ) {
              int j = Integer . parseInt ( v . substring ( j , j + 1 ) ) ;
              int length = lengths [ j - 1 ] ;
              String S = w . substring ( 0 , length ) ;
              w = w . substring ( length ) ;
              if ( l [ j ] . isEmpty ( ) ) l [ j ] = S ;
              if ( S . compareTo ( l [ j ] ) != 0 ) {
                ans = false ;
                break ;
              }
            }
            if ( ! ans ) break ;
          }
          if ( ans ) break ;
        }
      }
      for ( int i = 1 ;
      i <= K ;
      i ++ ) {
        System . out . println ( l [ i ] ) ;
      }
      return N ;
    }
    