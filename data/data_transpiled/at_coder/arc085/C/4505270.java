@ VisibleForTesting static int [ ] [ ] dinicMaxFlow ( int s , int t ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < P ;
  i ++ ) A [ i ] = Integer . parseInt ( input ( ) ) ;
  int P = N + 2 ;
  int [ ] [ ] [ ] es = new int [ P ] [ P ] [ ] ;
  for ( int i = 0 ;
  i < P ;
  i ++ ) {
    es [ i ] = new int [ N ] [ N ] ;
  }
  / * ▁ Edge ▁ to ▁ the ▁ front ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁