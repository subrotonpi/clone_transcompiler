static final long [ ] getCopies ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] a = new int [ N ] ;
  long ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  Arrays . sort ( a , Collections . reverseOrder ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += a [ i ] * ( i + 1 ) ;
  }
  HashMap < Integer , Integer > dic = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ( a [ i ] >= 0 ) && ( a [ i ] <= 0 ) ) {
      dic . put ( a [ i ] , dic . get ( a [ i ] ) + 1 ) ;
    }
    else {
      dic . put ( a [ i ] , 1 ) ;
    }
  }
  long ansb = 1 ;
  for ( int i : dic . keySet ( ) ) {
    long x = 1 ;
    for ( int j = 0 ;
    j < dic . get ( j ) ;
    j ++ ) {
      x = ( x * ( j + 1 ) ) % 1000000007 ;
    }
    ansb = ( ansb * x ) % 1000000007 ;
  }
  System . out . println ( ans ) ;
  System . out . println ( ansb ) ;
}
