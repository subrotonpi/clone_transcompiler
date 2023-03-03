public static int N = Integer . parseInt ( input ) {
  int L0 = 2 ;
  int L1 = 1 ;
  int i = N ;
  while ( i - 1 > 0 ) {
    int Ln = L0 + L1 ;
    i -- ;
    L0 = L1 ;
    L1 = Ln ;
  }
  if ( N == 0 ) {
    System . out . println ( 2 ) ;
  }
  else if ( N == 1 ) {
    System . out . println ( 1 ) ;
  }
  else {
    System . out . println ( Ln ) ;
  }
  return L0 ;
}
