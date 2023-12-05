public static int [ ] getDistance ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int [ ] d = new int [ ] {
    a , b , c }
    ;
    if ( ( a % 2 + b % 2 + c % 2 ) == 3 ) {
      System . out . println ( d [ 0 ] * d [ 1 ] ) ;
    }
    else {
      System . out . println ( 0 ) ;
    }
    return d ;
  }
  