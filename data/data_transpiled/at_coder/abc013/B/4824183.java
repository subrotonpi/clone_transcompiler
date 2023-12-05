public static void print ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int x_min = Math . min ( a , b ) ;
  int x_max = Math . max ( a , b ) ;
  System . out . println ( Math . min ( x_max - x_min , x_min + 9 - x_max + 1 ) ) ;
}
