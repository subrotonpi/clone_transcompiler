public static int n ( int m , int X , int Y ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( X + 1 <= Y ) {
    for ( int Z = X + 1 ;
    Z <= Y ;
    Z ++ ) {
      if ( max ( x ) < Z && Z <= min ( y ) ) {
        System . out . println ( ) ;
        exit ( ) ;
      }
    }
  }
  return 0 ;
}
