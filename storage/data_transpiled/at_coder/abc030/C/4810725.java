static final String getSummarizer ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = input . nextInt ( ) ;
  final int K = input . nextInt ( ) ;
  final int X = input . nextInt ( ) ;
  final int Y = input . nextInt ( ) ;
  final int [ ] a = new int [ N ] ;
  final int [ ] b = new int [ K ] ;
  int t = 0 ;
  int ans = 0 ;
  while ( true ) {
    final int nextA = input . nextInt ( ) ;
    if ( nextA == N ) {
      break ;
    }
    t = a [ nextA ] + X ;
    final int nextB = input . nextInt ( ) ;
    if ( nextB == K ) {
      break ;
    }
    t = b [ nextB ] + Y ;
    ans ++ ;
  }
  return System . out . println ( ans ) ;
}
