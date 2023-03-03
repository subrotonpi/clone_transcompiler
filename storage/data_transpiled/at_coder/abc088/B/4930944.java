public static void input ( ) {
  int [ ] a = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int alice = 0 ;
  int bob = 0 ;
  for ( int i = a . length - 1 ;
  i >= 0 ;
  i -- ) {
    int num = a [ i ] ;
    if ( i % 2 == 0 ) {
      alice += num ;
    }
    else {
      bob += num ;
    }
  }
  System . out . println ( alice - bob ) ;
}
