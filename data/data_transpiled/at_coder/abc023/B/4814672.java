public static void print ( String s ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  if ( n % 2 == 0 ) {
    System . out . println ( "-1" ) ;
    exit ( ) ;
  }
  int t = n / 2 ;
  String l1 = s . substring ( 0 , t ) ;
  String l2 = s . substring ( t + 1 ) . substring ( 0 , s . length ( ) - 1 ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    switch ( l1 . charAt ( i ) ) {
      case 'a' : if ( l2 . charAt ( i ) != 'c' ) {
        System . out . println ( - 1 ) ;
        exit ( ) ;
      }
      break ;
      case 'b' : if ( l2 . charAt ( i ) != 'b' ) {
        System . out . println ( - 1 ) ;
        exit ( ) ;
      }
      break ;
      case 'c' : if ( l2 . charAt ( i ) != 'a' ) {
        System . out . println ( - 1 ) ;
        exit ( ) ;
      }
      break ;
      default : System . out . println ( - 1 ) ;
      exit ( ) ;
    }
  }
  else {
    System . out . println ( ( n - 1 ) / 2 ) ;
  }
}
