public static int N ( ) {
  int ans = 1 ;
  while ( true ) {
    ans *= 2 ;
    if ( N < ans ) {
      System . out . println ( ans / 2 ) ;
      break ;
    }
    else if ( N == ans ) {
      System . out . println ( ans ) ;
      break ;
    }
  }
}
