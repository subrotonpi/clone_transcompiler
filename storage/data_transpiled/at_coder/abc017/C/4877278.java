static final int [ ] getMatchingScores ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] score = new int [ M + 1 ] ;
  int sSum = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    score [ ( l - 1 ) ] += s ;
    score [ r ] += - s ;
    sSum += s ;
  }
  List < Integer > scoreList = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < score . length ;
  i ++ ) {
    scoreList . add ( i ) ;
  }
  int ans = sSum - Math . min ( scoreList . size ( ) , scoreList . size ( ) ) ;
  System . out . println ( ans ) ;
}
