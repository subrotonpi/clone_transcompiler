public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> As = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    As . add ( Collections . singletonList ( i ) ) ;
  }
  int ans = 0 ;
  for ( List < Integer > A : As ) {
    int score = 0 ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      score += A . get ( i ) * B . get ( i ) ;
    }
    if ( score + C > 0 ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
