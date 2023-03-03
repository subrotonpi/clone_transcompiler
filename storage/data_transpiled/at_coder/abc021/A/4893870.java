public static int [ ] getDigits ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  if ( N % 2 == 1 ) {
    a [ N / 2 ] = 1 ;
  }
  for ( int i = 0 ;
  i < N / 2 ;
  i ++ ) {
    a [ i ] = 2 ;
  }
  System . out . println ( a . length ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    System . out . println ( a [ i ] ) ;
  }
  return a ;
}
