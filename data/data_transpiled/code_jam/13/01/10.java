static final Scanner WING_FILE = new Scanner ( System . in ) {
  private boolean winner ( char a , char b , char c , char d ) {
    if ( a == b == c == d ) {
      if ( a == 'O' ) {
        System . out . println ( "O won" ) ;
        return true ;
      }
      else if ( a == 'X' ) {
        System . out . println ( "X won" ) ;
        return true ;
      }
      else {
        return false ;
      }
    }
    else if ( ( a == 'T' ) + ( b == 'T' ) + ( c == 'T' ) + ( d == 'T' ) == 1 ) {
      if ( ( a == 'O' ) + ( b == 'O' ) + ( c == 'O' ) + ( d == 'O' ) == 3 ) {
        System . out . println ( "O won" ) ;
        return true ;
      }
      else if ( ( a == 'X' ) + ( b == 'X' ) + ( c == 'X' ) + ( d == 'X' ) == 3 ) {
        System . out . println ( "X won" ) ;
        return true ;
      }
    }
    else {
      return false ;
    }
  }
}
