public static void prime ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n == 1 ) {
    System . out . println ( "Not Prime" ) ;
    exit ( ) ;
  }
  if ( n % 2 != 0 && n % 5 != 0 && n % 3 != 0 ) {
    System . out . println ( "Prime" ) ;
  }
  else {
    for ( int i = 2 ;
    i < ( int ) ( n * 0.5 + 1 ) ;
    i ++ ) {
      if ( n % i == 0 ) {
        System . out . println ( "Not Prime" ) ;
        exit ( ) ;
      }
    }
    System . out . println ( "Prime" ) ;
  }
}
