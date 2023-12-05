public static int getInt ( String a , String b ) {
  String str_a = Integer . toString ( a ) ;
  String str_b = Integer . toString ( b ) ;
  int [ ] li_a = {
    a , Integer . parseInt ( "9" + str_a . substring ( 1 ) ) , Integer . parseInt ( str_a . substring ( 0 , 2 ) + "9" + str_a . substring ( 2 ) ) , Integer . parseInt ( str_a . substring ( 0 , 2 ) + "9" ) }
    ;
    int [ ] li_b = {
      b , Integer . parseInt ( "1" + str_b . substring ( 1 ) ) , Integer . parseInt ( str_b . substring ( 0 , 2 ) + "0" + str_b . substring ( 2 ) ) , Integer . parseInt ( str_b . substring ( 0 , 2 ) + "0" ) }
      ;
      int ans = - 999 ;
      for ( int a_ : li_a ) {
        ans = Math . max ( ans , a_ - b ) ;
      }
      for ( int b_ : li_b ) {
        ans = Math . max ( ans , a - b_ ) ;
      }
      System . out . println ( ans ) ;
      return ans ;
    }
    