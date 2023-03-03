public static void input ( ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  boolean ans = true ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == '@' ) {
      if ( ! "atcoder@" . equals ( t . charAt ( i ) ) ) {
        ans = false ;
        break ;
      }
    }
    else if ( t . charAt ( i ) != '@' ) {
      if ( s . charAt ( i ) != t . charAt ( i ) ) {
        ans = false ;
        break ;
      }
    }
  }
  for ( int i = 0 ;
  i < t . length ( ) ;
  i ++ ) {
    if ( t . charAt ( i ) == '@' ) {
      if ( ! "atcoder@" . equals ( s . charAt ( i ) ) ) {
        ans = false ;
        break ;
      }
    }
    else if ( s . charAt ( i ) != '@' ) {
      if ( s . charAt ( i ) != t . charAt ( i ) ) {
        ans = false ;
        break ;
      }
    }
  }
  if ( ans ) {
    System . out . println ( "You can win" ) ;
  }
  else {
    System . out . println ( "You will lose" ) ;
  }
}
