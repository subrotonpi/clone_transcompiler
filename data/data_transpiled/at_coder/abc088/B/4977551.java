public static void print ( int N ) {
  String [ ] Ai = input . split ( " " ) ;
  Arrays . sort ( Ai ) ;
  Arrays . sort ( Ai ) ;
  Arrays . sort ( Ai , Collections . reverseOrder ( ) ) ;
  int Alice = 0 ;
  int Bob = 0 ;
  int i = 0 ;
  do {
    if ( i + 1 <= N - 1 ) {
      Alice += Ai [ i ] ;
      Bob += Ai [ i + 1 ] ;
    }
    if ( i == N - 1 ) {
      Alice += Ai [ i ] ;
    }
    if ( i > N - 1 ) {
      break ;
    }
    i = i + 2 ;
  }
  while ( true ) ;
  System . out . println ( Alice - Bob ) ;
}
