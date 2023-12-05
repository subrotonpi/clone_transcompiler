public static boolean flag1 ( boolean flag2 ) {
  boolean flag1 = false ;
  String s1 = input . next ( ) ;
  String s2 = input . next ( ) ;
  String win = "You can win" ;
  String lose = "You will lose" ;
  for ( int i = 0 ;
  i < s1 . length ( ) ;
  i ++ ) {
    if ( s1 . charAt ( i ) == '@' ) {
      if ( s2 . charAt ( i ) != 'a' && s2 . charAt ( i ) != 't' && s2 . charAt ( i ) != 'c' && s2 . charAt ( i ) != 'o' && s2 . charAt ( i ) != 'd' && s2 . charAt ( i ) != 'e' && s2 . charAt ( i ) != 'r' && s2 . charAt ( i ) != '@' ) {
        flag1 = true ;
        break ;
      }
    }
    else {
      if ( s1 . charAt ( i ) != s2 . charAt ( i ) ) {
        if ( s2 . charAt ( i ) != '@' ) {
          flag1 = true ;
          break ;
        }
      }
    }
  }
  for ( int i = 0 ;
  i < s2 . length ( ) ;
  i ++ ) {
    if ( s2 . charAt ( i ) == '@' ) {
      if ( s1 . charAt ( i ) != 'a' && s1 . charAt ( i ) != 't' && s1 . charAt ( i ) != 'c' && s1 . charAt ( i ) != 'o' && s1 . charAt ( i ) != 'd' && s1 . charAt ( i ) != 'e' && s1 . charAt ( i ) != 'r' && s1 . charAt ( i ) != '@' ) {
        flag2 = true ;
        break ;
      }
    }
    else {
      if ( s1 . charAt ( i ) != s2 . charAt ( i ) ) {
        if ( s1 . charAt ( i ) != '@' ) {
          flag2 = true ;
          break ;
        }
      }
    }
  }
  if ( flag1 || flag2 ) {
    System . out . println ( lose ) ;
  }
  else {
    System . out . println ( win ) ;
  }
  return flag1 ;
}
