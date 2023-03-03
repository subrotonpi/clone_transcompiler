public static int [ ] getVote ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] vote = new int [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    vote [ i ] = i ;
  }
  for ( int a : answer ) {
    vote [ a - 1 ] ++ ;
  }
  int voteAll = 0 ;
  return vote ;
}
