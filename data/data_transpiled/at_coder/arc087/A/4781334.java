public static int N = Integer . parseInt ( input ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  HashMap < Integer , Integer > dic = new HashMap < Integer , Integer > ( ) ;
  for ( int a : A ) {
    dic . put ( a , dic . getOrDefault ( a , 0 ) + 1 ) ;
  }
  int ans = 0 ;
  for ( int k : dic . keySet ( ) ) {
    if ( dic . get ( k ) > k ) {
      ans += dic . get ( k ) - k ;
    }
    else if ( dic . get ( k ) < k ) {
      ans += dic . get ( k ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
