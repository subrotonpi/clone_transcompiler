public static void ans ( ) {
  String S = input . nextLine ( ) ;
  String res = "" ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    char s = S . charAt ( i ) ;
    if ( ( s == 'O' ) || ( s == 'D' ) ) {
      res += "0" ;
    }
    else if ( ( s == 'I' ) || ( s == 'Z' ) ) {
      res += "1" ;
    }
    else if ( ( s == 'S' ) || ( s == 'S' ) ) {
      res += "2" ;
    }
    else if ( ( s == 'S' ) || ( s == 'S' ) ) {
      res += "1" ;
    }
    else if ( ( s == 'S' ) || ( s == 'S' ) ) {
      res += "2" ;
    }
    else if ( ( s == 'S' ) || ( s == 'S' ) ) {
      res += "3" ;
    }
    else if ( ( s == 'S' ) || ( s == 'S' ) ) {
      res += "4" ;
    }
  }
  System . out . println ( res ) ;
}
