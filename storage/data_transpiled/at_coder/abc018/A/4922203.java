public static int [ ] getWindows ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = {
    a , b , c }
    ;
    int [ ] win = {
      2 , 2 , 2 }
      ;
      for ( int i = 0 ;
      i < l . length ;
      i ++ ) {
        if ( l [ i ] == Math . max ( l [ i ] ) ) {
          win [ i ] = 1 ;
        }
        else if ( l [ i ] == Math . min ( l [ i ] ) ) {
          win [ i ] = 3 ;
        }
      }
      for ( int i : win ) {
        System . out . println ( i ) ;
      }
      return win ;
    }
    