public static int [ ] getA ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] tmp = new int [ K ] ;
  for ( int i = 1 ;
  i <= Math . min ( A , B ) ;
  i ++ ) {
    if ( A % i == 0 && B % i == 0 ) {
      tmp [ i ] = i ;
    }
  }
  System . out . println ( tmp [ tmp . length - K ] ) ;
  return tmp ;
}
