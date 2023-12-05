public static void print ( int a , int b , int x ) {
  int ans = Integer . parseInt ( input . nextLine ( ) ) ;
  ans = Math . max ( ( b / x ) - ( ( a - 1 ) / x ) , 0 ) ;
  System . out . println ( ans ) ;
}
