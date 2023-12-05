public static void input ( ) {
  s = input . nextLine ( ) ;
  K = Integer . parseInt ( input . nextLine ( ) ) ;
  L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 5 ;
  i ++ ) {
    for ( int j = 0 ;
    j < s . length ( ) - i ;
    j ++ ) {
      L . add ( s . substring ( j , j + i + 1 ) ) ;
    }
  }
  L . sort ( ) ;
  System . out . println ( L . get ( K - 1 ) ) ;
}
