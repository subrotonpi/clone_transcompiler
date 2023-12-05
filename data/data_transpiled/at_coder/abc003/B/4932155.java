static final void lose ( ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  char [ ] at = {
    'a' , 't' , 'c' , 'o' , 'd' , 'e' , 'r' }
    ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      if ( s . charAt ( i ) != t . charAt ( i ) ) {
        if ( s . charAt ( i ) == '@' ) {
          continue ;
        }
      }
      System . out . println ( "You will lose" ) ;
      System . exit ( ) ;
    }
  }
  