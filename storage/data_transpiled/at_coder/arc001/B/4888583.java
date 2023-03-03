public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = 0 ;
  if ( A < B ) {
    int AA = A ;
    A = B ;
    B = AA ;
  }
  int N = A - B ;
  while ( N != 0 ) {
    if ( N >= 10 ) N = N - 10 ;
    else if ( N >= 8 && N <= 9 ) N = 10 - N ;
    else if ( N >= 5 && N <= 7 ) N = N - 5 ;
    else if ( N == 4 ) N = 1 ;
    else if ( N >= 1 && N <= 3 ) N = N - 1 ;
    X = X + 1 ;
  }
  System . out . println ( X ) ;
  return X ;
}
