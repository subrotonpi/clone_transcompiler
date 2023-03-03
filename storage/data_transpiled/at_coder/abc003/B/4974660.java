public static void input ( ) {
  String S = input . nextLine ( ) ;
  String T = input . nextLine ( ) ;
  boolean check = true ;
  String [ ] atto = {
    "a" , "t" , "c" , "o" , "d" , "e" , "r" , "@" }
    ;
    for ( int i = 0 ;
    i < S . length ( ) ;
    i ++ ) {
      char s = S . charAt ( i ) ;
      char t = T . charAt ( i ) ;
      if ( s == '@' && t == '' ) {
        continue ;
      }
      else if ( t == '@' && s == '' ) {
        continue ;
      }
      else if ( s == t ) {
        continue ;
      }
      else {
        check = false ;
        break ;
      }
    }
    if ( check == true ) {
      System . out . println ( "You can win" ) ;
    }
    else {
      System . out . println ( "You will lose" ) ;
    }
  }
  