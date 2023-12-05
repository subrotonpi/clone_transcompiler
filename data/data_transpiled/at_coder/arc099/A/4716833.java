public static final int [ ] getRange ( int N , int K ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = input . nextInt ( ) ;
  final int K = input . nextInt ( ) ;
  final List < Integer > A = new LinkedList < Integer > ( ) ;
  int minIndex = A . indexOf ( 1 ) ;
  if ( ( minIndex > N / 2 ) ) {
    Collections . reverse ( A ) ;
  }
  int count = 0 ;
  while ( ( minIndex = A . indexOf ( 1 ) ) != - 1 ) {
    if ( ( minIndex == 0 ) || ( minIndex > N / 2 ) ) {
      -- count ;
    }
    else if ( ( minIndex - ( K - 1 ) < 0 ) ) {
      int x = minIndex - 1 ;
      System . arraycopy ( A . subList ( 0 , x + 1 ) , 0 , A . subList ( x , y ) , 0 , K ) ;
    }
    count ++ ;
  }
  if ( ( ( A . size ( ) - 1 ) % ( K - 1 ) == 0 ) ) {
    count += ( A . size ( ) - 1 ) / ( K - 1 ) ;
  }
  else {
    count += ( A . size ( ) - 1 ) / ( K - 1 ) + 1 ;
  }
  return A . toArray ( ) ;
}
