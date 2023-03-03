public static void input ( ) {
  String s = input . getString ( ) ;
  String [ ] d = {
    "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" }
    . split ( " " ) ;
    for ( int i = 0 ;
    i < d . length ;
    i ++ ) {
      if ( d [ i ] . equals ( s ) ) {
        System . out . println ( i + 1 ) ;
        exit ( ) ;
      }
    }
    else {
      System . out . println ( 0 ) ;
    }
  }
  