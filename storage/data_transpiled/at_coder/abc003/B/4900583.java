public static void input ( ) {
  String S = input ( ) ;
  String T = input ( ) ;
  List < Character > l = new ArrayList < Character > ( ) ;
  l . add ( 'a' ) ;
  l . add ( 't' ) ;
  l . add ( 'c' ) ;
  l . add ( 'o' ) ;
  l . add ( 'd' ) ;
  l . add ( 'e' ) ;
  l . add ( 'r' ) ;
  int Flag = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == '@' ) {
      if ( T . charAt ( i ) != '@' && ! l . contains ( T . charAt ( i ) ) ) {
        Flag = 1 ;
        break ;
      }
    }
    else if ( T . charAt ( i ) == '@' ) {
      if ( ! l . contains ( S . charAt ( i ) ) ) {
        Flag = 1 ;
        break ;
      }
    }
    else if ( S . charAt ( i ) != T . charAt ( i ) ) {
      Flag = 1 ;
      break ;
    }
  }
  if ( Flag == 0 ) {
    System . out . println ( "You can win" ) ;
  }
  else {
    System . out . println ( "You will lose" ) ;
  }
}
