public static int N ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] nums = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) nums [ i ] = i * 10000 / N ;
  return ( int ) ( sum ( nums ) ) ;
}
