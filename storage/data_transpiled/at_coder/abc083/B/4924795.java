public static int [ ] getDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] result = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    result [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  return result ;
}
