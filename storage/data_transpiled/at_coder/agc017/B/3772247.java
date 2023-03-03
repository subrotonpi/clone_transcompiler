public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = input . nextInt ( ) ;
  final int A = input . nextInt ( ) ;
  final int B = input . nextInt ( ) ;
  final int C = input . nextInt ( ) ;
  final int D = input . nextInt ( ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( C * ( N - 1 - i ) - D * i <= B - A <= D * ( N - 1 - i ) - C * i ) {
      System . out . println ( "YES" ) ;
      return ;
    }
  }
  System . out . println ( "NO" ) ;
}
