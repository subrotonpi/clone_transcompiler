static final Map < String , Object > pycosat = new HashMap < String , Object > ( 1000000 ) {
  {
    int numTestcases = Integer . parseInt ( input . nextLine ( ) ) ;
    Map < String , Object > move = new HashMap < String , Object > ( ) {
      {
        put ( "l" , ( 0 , - 1 ) ) ;
        put ( "r" , ( 0 , + 1 ) ) ;
        put ( "u" , ( - 1 , 0 ) ) ;
        put ( "d" , ( + 1 , 0 ) ) ;
      }
    }
    ;
    for ( int i = 1 ;
    i < numTestcases + 1 ;
    i ++ ) {
      int r = Integer . parseInt ( input . nextLine ( ) ) ;
      Map < String , Object > mv = new HashMap < String , Object > ( ) ;
      for ( int j = 0 ;
      j < r ;
      j ++ ) {
        String l = matrix [ i ] . get ( j ) ;
        Map < String , Object > mv = new HashMap < String , Object > ( ) ;
        mv . put ( "l" , "d" ) ;
        mv . put ( "r" , ( i , j ) ) ;
        mv . put ( "u" , "-" ) ;
        mv . put ( "r" , ( i , j ) ) ;
        mv . put ( "d" , 0 ) ;
        mv . put ( "r" , ( i , j ) ) ;
        mv . put ( "d" , ( i , j ) ) ;
        mv . put ( "v" , ( i , j ) ) ;
        mv . put ( "v" , ( i , j ) ) ;
        mv . put ( "v" , ( i , j ) ) ;
        mv . put ( "v" , ( j , j ) ) ;
        mv . put ( "v" , ( i , j ) ) ;
        mv . put ( "v" , ( j , j ) ) ;
        mv . put ( "v" , ( j , j ) ) ;
        mv . put ( "v" , ( j , j ) ) ;
        mv . put ( "v" , ( j , j ) ) ;
        mv . put ( "v" , ( j , j ) ) ;
        mv . put ( "v" , ( j , j ) ) ;
        mv . put ( "v" , ( i , j ) ) ;
        mv . put ( "v" , ( j , j ) ) ;
        mv . put