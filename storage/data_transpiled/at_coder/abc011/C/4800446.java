public static int N = Integer . parseInt ( input ) {
  int NG_1 = Integer . parseInt ( input . nextLine ( ) ) ;
  int NG_2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int NG_3 = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] NG = {
    NG_1 , NG_2 , NG_3 }
    ;
    for ( int i = 0 ;
    i < 100 ;
    i ++ ) {
      if ( NG [ i ] >= 0 ) {
        break ;
      }
      N -= 3 ;
      if ( NG [ i ] >= 0 ) {
        N ++ ;
        if ( NG [ i ] >= 0 ) {
          N ++ ;
        }
      }
    }
    if ( N < 1 ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
    return N ;
  }
  