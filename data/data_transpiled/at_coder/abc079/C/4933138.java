static final String getRules ( ) {
  String num_list = input . next ( ) ;
  String rule = "+-" ;
  for ( String ops : new String [ ] {
    rule , "+-" }
    ) {
      String ans = num_list . substring ( 0 , 1 ) + ops . substring ( 0 , 1 ) + num_list . substring ( 1 , 2 ) + ops . substring ( 2 , 3 ) + num_list . substring ( 3 ) ;
      int res = new Integer ( ans ) . intValue ( ) ;
      if ( res == 7 ) {
        System . out . println ( ans + "=7" ) ;
        break ;
      }
    }
    return "" ;
  }
  