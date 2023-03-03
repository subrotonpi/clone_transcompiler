public static List < Integer > data = new ArrayList < Integer > ( ) {
  @ Override public Integer get ( ) {
    for ( int i = 1 ;
    i <= 30001 ;
    i ++ ) {
      if ( i % 2 == 0 || i % 3 == 0 ) {
        data . add ( i ) ;
      }
    }
    int k = Integer . parseInt ( input . nextLine ( ) ) ;
    switch ( k ) {
      case 3 : System . out . println ( * Arrays . asList ( 2 , 5 , 63 ) ) ;
      break ;
      case 4 : System . out . println ( * Arrays . asList ( 2 , 5 , 20 , 63 ) ) ;
      break ;
      case 5 : System . out . println ( * Arrays . asList ( 2 , 5 , 20 , 63 , 30 ) ) ;
      break ;
      default : }
      int [ ] ans = Arrays . copyOf ( data , k ) ;
      int sm = Integer . valueOf ( ans ) ;
      switch ( sm % 6 ) {
        case 2 : ans [ 4 ] = 30000 ;
        break ;
        case 3 : ans [ 5 ] = 30000 ;
        break ;
        case 5 : ans [ 5 ] = 29998 ;
        break ;
      }
      System . out . println ( ans ) ;
      return ans ;
    }
  }
  