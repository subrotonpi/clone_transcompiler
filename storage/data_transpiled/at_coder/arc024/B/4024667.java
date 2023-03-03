public static void main ( Scanner input ) {
  int N = input . nextInt ( ) ;
  int [ ] T = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) T [ i ] = input . nextInt ( ) ;
  if ( Arrays . equals ( T , N ) || Arrays . equals ( T , 0 ) ) {
    System . out . println ( - 1 ) ;
  }
  else {
    int ans = 0 ;
    int mode = T [ 0 ] ;
    int tmp = 1 ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      if ( T [ i ] == mode ) tmp ++ ;
      else {
        mode = T [ i ] ;
        ans = Math . max ( ans , tmp ) ;
        tmp = 1 ;
      }
    }
    System . out . println ( - ( - ans / 2 ) ) ;
  }
}
