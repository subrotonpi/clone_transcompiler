public static Set < Integer > solve ( ) {
  Set < Integer > ans ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == 3 ) {
    ans = new HashSet < > ( 2 ) ;
    ans . add ( 3 ) ;
    ans . add ( 25 ) ;
  }
  else if ( N == 4 ) {
    ans = new HashSet < > ( 2 ) ;
    ans . add ( 3 ) ;
    ans . add ( 4 ) ;
    ans . add ( 9 ) ;
  }
  else if ( N == 5 ) {
    ans = new HashSet < > ( 2 ) ;
    ans . add ( 3 ) ;
    ans . add ( 4 ) ;
  }
  else {
    ans = new HashSet < > ( ) ;
    int sumAns = 0 ;
    int num = 0 ;
    for ( int i = 1 ;
    i < 30001 ;
    i ++ ) {
      if ( i % 2 == 0 || i % 3 == 0 ) {
        ans . add ( i ) ;
        sumAns += i ;
        num ++ ;
      }
    }
    if ( num == N ) break ;
  }
  return ans ;
}
