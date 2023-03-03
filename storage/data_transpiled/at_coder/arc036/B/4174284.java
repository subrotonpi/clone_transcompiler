public static int [ ] getDigits ( ) {
  int N = Integer . parseInt ( input ) ;
  if ( N == 1 ) {
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  else {
    int [ ] L = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int n = Integer . parseInt ( input ) ;
      L [ i ] = n ;
    }
    int ans = 0 ;
    String M = "N" ;
    int S = 0 ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      if ( M . equals ( "N" ) ) {
        if ( L [ i ] > L [ i - 1 ] ) {
          M = "U" ;
          S = i - 1 ;
        }
      }
      else if ( M . equals ( "U" ) ) {
        if ( L [ i ] >= L [ i - 1 ] ) {
        }
        else {
          M = "D" ;
        }
      }
      else {
        if ( L [ i ] <= L [ i - 1 ] ) {
        }
        else {
          M = "U" ;
          S = i - 1 ;
        }
      }
      if ( ans < i - S + 1 ) {
        ans = i - S + 1 ;
      }
    }
    System . out . println ( Math . min ( N , ans ) ) ;
    return L ;
  }
}
