public static void print ( String s ) {
  s = String . valueOf ( input . nextLine ( ) ) ;
  int n1 = Integer . parseInt ( s . substring ( 0 , 1 ) ) ;
  int n2 = Integer . parseInt ( s . substring ( 1 , 2 ) ) ;
  int n3 = Integer . parseInt ( s . substring ( 2 , 3 ) ) ;
  int n4 = Integer . parseInt ( s . substring ( 3 , 4 ) ) ;
  int sum1 = 0 ;
  int sum2 = 0 ;
  int sum3 = 0 ;
  String ans = "" ;
  char [ ] op = {
    '+' , '-' }
    ;
    for ( int i = 0 ;
    i < 2 ;
    i ++ ) {
      if ( i == 0 ) {
        sum1 = n1 + n2 ;
      }
      else {
        sum1 = n1 - n2 ;
      }
      for ( int j = 0 ;
      j < 2 ;
      j ++ ) {
        if ( j == 0 ) {
          sum2 = sum1 + n3 ;
        }
        else {
          sum2 = sum1 - n3 ;
        }
        for ( int k = 0 ;
        k < 2 ;
        k ++ ) {
          if ( k == 0 ) {
            sum3 = sum2 + n4 ;
          }
          else {
            sum3 = sum2 - n4 ;
          }
          if ( sum3 == 7 ) {
            ans = String . valueOf ( n1 ) + op [ i ] + String . valueOf ( n2 ) + op [ j ] + String . valueOf ( n3 ) + op [ k ] + n4 + "=7" ;
          }
        }
      }
    }
    System . out . println ( ans ) ;
  }
  