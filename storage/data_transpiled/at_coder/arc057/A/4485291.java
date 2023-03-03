public static void input ( ) {
  String [ ] money = input . nextLine ( ) . split ( " " ) ;
  int initialMoney = Integer . parseInt ( money [ 0 ] ) ;
  int increment = Integer . parseInt ( money [ 1 ] ) ;
  int goal = 2 * 10 * 12 ;
  int counter = 0 ;
  int amount = initialMoney ;
  if ( increment == 0 ) {
    System . out . println ( goal - amount ) ;
  }
  else {
    while ( amount < goal ) {
      amount ++ + amount * increment ;
      counter ++ ;
    }
  }
  System . out . println ( counter ) ;
}
