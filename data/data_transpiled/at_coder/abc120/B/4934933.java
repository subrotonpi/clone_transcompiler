public static int [ ] getRank ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] n = new int [ a ] ;
  for ( int i = 1 ;
  i <= Math . min ( a , b ) ;
  i ++ ) {
    if ( a % i == 0 && b % i == 0 ) {
      n [ i ] ++ ;
    }
  }
  return n ;
}
