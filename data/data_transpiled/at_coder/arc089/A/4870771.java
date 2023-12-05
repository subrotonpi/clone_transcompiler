public static int [ ] [ ] N = Integer . parseInt ( input ) {
  int [ ] [ ] last = {
    0 , 0 , 0 }
    ;
    boolean flag ;
    int [ ] [ ] result = new int [ N ] [ ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int ti = Integer . parseInt ( input . readLine ( ) ) ;
      int xi = Integer . parseInt ( input . readLine ( ) ) ;
      int yi = Integer . parseInt ( input . readLine ( ) ) ;
      int a = ti - last [ 2 ] - ( Math . abs ( xi - last [ 0 ] ) + Math . abs ( yi - last [ 1 ] ) ) ;
      if ( a >= 0 && a % 2 == 0 ) {
        flag = true ;
      }
      else {
        flag = false ;
        break ;
      }
      last = new int [ ] [ ] {
        xi , yi , ti }
        ;
      }
      if ( flag ) {
        System . out . println ( "Yes" ) ;
      }
      else {
        System . out . println ( "No" ) ;
      }
      return result ;
    }
    