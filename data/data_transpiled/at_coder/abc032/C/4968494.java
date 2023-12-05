public static void main ( String [ ] args ) {
  int result = sub ( ) ;
  System . out . println ( result ) ;
  {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int k = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] ss = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      ss [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    int result = 0 ;
    int right = 0 ;
    for ( int s : ss ) {
      if ( s == 0 ) {
        return n ;
      }
    }
    int acc = 1 ;
    for ( int left = 0 ;
    left < n ;
    left ++ ) {
      int tmp ;
      while ( ( right = right + 1 ) < n ) {
        tmp = acc * ss [ right ] ;
        if ( tmp <= k ) {
          acc = tmp ;
          right = right + 1 ;
          int length = right - left ;
          result = Math . max ( length , result ) ;
        }
        else {
          break ;
        }
      }
      if ( left == right ) {
        right = right + 1 ;
        continue ;
      }
      acc = acc / ss [ left ] ;
      if ( acc <= k ) {
        int length = right - left ;
        result = Math . max ( length , result ) ;
      }
      else {
        continue ;
      }
    }
  }
}
