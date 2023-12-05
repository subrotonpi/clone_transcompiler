public static int [ ] [ ] getA ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int Acount = 1 ;
  int Bcount = 1 ;
  System . out . println ( 100 + " " + 100 ) ;
  for ( int j = 0 ;
  j < 49 ;
  j ++ ) {
    String OUTPUT = "" ;
    for ( int i = 0 ;
    i < 100 ;
    i ++ ) {
      if ( i % 2 == 0 && j % 2 == 0 && Acount < A ) {
        Acount ++ ;
        OUTPUT += "." ;
      }
      else {
        OUTPUT += "#" ;
      }
      System . out . println ( OUTPUT ) ;
    }
    System . out . println ( Arrays . toString ( new String [ ] {
      "#" }
      ) ) ;
    }
    String [ ] [ ] B_OUTPUT = new String [ 100 ] [ ] ;
    for ( int j = 0 ;
    j < 49 ;
    j ++ ) {
      String OUTPUT = "" ;
      for ( int i = 0 ;
      i < 100 ;
      i ++ ) {
        if ( i % 2 == 0 && j % 2 == 0 && Bcount < B ) {
          Bcount ++ ;
          OUTPUT += "#" ;
        }
        else {
          OUTPUT += "." ;
        }
        B_OUTPUT [ i ] = OUTPUT ;
      }
    }
    B_OUTPUT [ 0 ] = new String [ ] {
      "." }
      ;
      for ( int i = B_OUTPUT . length - 1 ;
      i >= 0 ;
      i -- ) {
        System . out . println ( B_OUTPUT [ i ] ) ;
      }
      return B_OUTPUT ;
    }
    