public static void print ( String s ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  s = input . nextLine ( ) ;
  int a = n / 2 ;
  boolean ans = true ;
  if ( n % 2 < 1 ) {
    ans = false ;
  }
  else {
    for ( int i = 0 ;
    i < a + 1 ;
    i ++ ) {
      switch ( i % 3 ) {
        case 0 : if ( s . charAt ( a - i ) != 'b' || s . charAt ( a + i ) != 'b' ) {
          ans = false ;
        }
        break ;
        case 1 : if ( s . charAt ( a - i ) != 'a' || s . charAt ( a + i ) != 'c' ) {
          ans = false ;
        }
        break ;
        default : if ( s . charAt ( a - i ) != 'c' || s . charAt ( a + i ) != 'a' ) {
          ans = false ;
        }
        break ;
      }
    }
  }
  if ( ans ) {
    System . out . println ( n / 2 ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
}
