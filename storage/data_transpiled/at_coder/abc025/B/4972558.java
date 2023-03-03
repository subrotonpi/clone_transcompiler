public static void print ( int N , int A , int B ) {
  Scanner input = new Scanner ( System . in ) ;
  int [ ] [ ] sd = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    sd [ i ] = input . nextInt ( ) ;
  }
  int pos = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int step = Math . min ( Math . max ( ( int ) sd [ i ] [ 1 ] , A ) , B ) ;
    if ( sd [ i ] [ 0 ] == Direction . West ) {
      step *= - 1 ;
    }
    pos += step ;
  }
  if ( pos == 0 ) {
    System . out . println ( pos ) ;
  }
  else {
    Direction dest = pos > 0 ? Direction . East : Direction . West ;
    System . out . println ( dest + " " + Math . abs ( pos ) ) ;
  }
}
