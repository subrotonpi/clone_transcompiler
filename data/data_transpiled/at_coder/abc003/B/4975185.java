public static void input ( ) {
  String S = input ( ) ;
  String T = input ( ) ;
  char [ ] atc = {
    'a' , 't' , 'c' , 'o' , 'd' , 'e' , 'r' , '@' }
    ;
    boolean f = true ;
    for ( int i = 0 ;
    i < S . length ( ) ;
    i ++ ) {
      char s = S . charAt ( i ) ;
      char t = T . charAt ( i ) ;
      if ( s == '@' ) {
        if ( ! t . equals ( atc [ i ] ) ) {
          f = false ;
        }
      }
      else if ( t == '@' ) {
        if ( ! s . equals ( atc [ i ] ) ) {
          f = false ;
        }
      }
      else if ( s != t ) {
        f = false ;
      }
    }
    if ( f ) {
      System . out . println ( "You can win" ) ;
    }
    else {
      System . out . println ( "You will lose" ) ;
    }
  }
  