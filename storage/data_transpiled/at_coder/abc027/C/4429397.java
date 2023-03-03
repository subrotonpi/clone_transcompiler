@ VisibleForTesting static void solve ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int n ;
  input . useLocale ( Locale . ENGLISH ) ;
  final int left = 2 * n ;
  final int right = 2 * n + 1 ;
  final int floor = input . nextInt ( ) ;
  final int depth = floor ( log2 ( n ) ) + 1 ;
  solve ( ) ;
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean turn = true ;
  final int d = depth ( n ) ;
  if ( d % 2 == 0 ) {
    final Function < Integer , Integer > taka = ( x ) -> left ;
    final Function < Integer , Integer > aoki = ( x ) -> right ;
    turn = ! turn ;
  }
}
