static final String [ ] getStrings ( int len ) {
  System . setIn ( len ) ;
  Scanner input = new Scanner ( System . in ) ;
  String s = input . next ( ) ;
  char [ ] l = {
    'i' , 'c' , 't' }
    ;
    char [ ] L = {
      'I' , 'C' , 'T' }
      ;
      int f = 0 ;
      for ( int i = 0 ;
      i < len ;
      i ++ ) {
        char c = s . charAt ( i ) ;
        if ( c == l [ f ] || c == L [ f ] ) {
          f ++ ;
        }
        if ( f == 3 ) {
          break ;
        }
      }
      if ( f == 3 ) {
        System . out . println ( "YES" ) ;
      }
      else {
        System . out . println ( "NO" ) ;
      }
      return L ;
    }
    