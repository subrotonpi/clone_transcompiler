public static int Q = Integer . parseInt ( input ) {
  int Q = Integer . parseInt ( input . readLine ( ) ) ;
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int S = Integer . parseInt ( input . readLine ( ) ) ;
  int D = Integer . parseInt ( input . readLine ( ) ) ;
  int res ;
  if ( d == Math . min ( q , h , s , d ) && N >= 2 ) {
    res = D * ( N / 2 ) + ( N % 2 ) * Math . min ( q , h , s ) ;
  }
  else {
    res = N * Math . min ( q , h , s ) ;
  }
  return res ;
}
