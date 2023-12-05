public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] Ns = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Ns [ i ] = i + 1 ;
  int prev = 0 ;
  for ( int m = 0 ;
  m < M ;
  m ++ ) {
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    try {
      int index = Ns . indexOf ( s ) ;
      int prevNext = Ns [ index ] ;
      Ns [ index ] = prev ;
      prev = prevNext ;
    }
    catch ( NumberFormatException ex ) {
      continue ;
    }
  }
  for ( int n : Ns ) System . out . println ( n ) ;
  return N ;
}
