static final int [ ] [ ] R = new int [ R ] [ C ] , K = new int [ C ] ;
int N = Integer . parseInt ( input ) ;
int [ ] rCandies = new int [ R ] ;
int [ ] cCandies = new int [ C ] ;
int [ ] [ ] rcCandies = new int [ N ] [ ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  int r = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  rCandies [ r - 1 ] ++ ;
  cCandies [ c - 1 ] ++ ;
  rcCandies [ i ] = new int [ ] {
    r , c }
    ;
  }
  Counter < Integer > rSums = new Counter < Integer > ( rCandies ) ;
  Counter < Integer > cSums = new Counter < Integer > ( cCandies ) ;
  int cnt_ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cnt_ans = rCandies [ rcCandies [ i ] [ 0 ] - 1 ] + cCandies [ rcCandies [ i ] [ 1 ] - 1 ] ;
    if ( cnt_ans == K ) {
      cnt_ans -- ;
    }
    else if ( cnt_ans == K + 1 ) {
      cnt_ans ++ ;
    }
  }
  System . out . println ( cnt_ans ) ;
}
