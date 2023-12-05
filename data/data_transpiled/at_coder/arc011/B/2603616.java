) public static void dic ( ) {
  dic ( "b" , 1 , 1 , 2 , 2 , 3 , 3 , 4 , 5 , 5 , 6 , 7 , 8 , 9 , 9 , 9 , 9 , 0 , 0 ) ;
  vow = {
    "a" , "i" , "o" , "u" , "e" , "y" , "." , "," }
    ;
    n = Integer . parseInt ( input . nextLine ( ) ) ;
    s = Arrays . asList ( input . nextLine ( ) . split ( " " ) ) ;
    ans = new ArrayList < String > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      String ss = "" ;
      for ( int j = 0 ;
      j < s . length ;
      j ++ ) {
        if ( vow . indexOf ( s . charAt ( j ) ) >= 0 ) {
        }
        else {
          ss += dic . get ( s . charAt ( j ) ) ;
        }
      }
      if ( ss != null ) ans . add ( ss ) ;
    }
    System . out . println ( ans ) ;
  }
  