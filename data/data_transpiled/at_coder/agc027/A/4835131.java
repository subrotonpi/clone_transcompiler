public static int N ( int x , int N ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( A ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = A [ i ] ;
    if ( x == a ) {
      System . out . println ( i + 1 ) ;
      break ;
    }
    else if ( x < a ) {
      System . out . println ( i ) ;
      break ;
    }
    else {
      x -= a ;
    }
  }
  return N - 1 ;
}
