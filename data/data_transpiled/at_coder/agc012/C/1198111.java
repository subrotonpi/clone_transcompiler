public static int [ ] getDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) + 1 ;
  int k = 50 ;
  while ( ~ n >>> k & 1 ) {
    k -- ;
  }
  k -- ;
  int [ ] a = new int [ k ] ;
  int [ ] b = new int [ k ] ;
  now = 1 ;
  return a ;
}
