@ VisibleForTesting static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final PriorityQueue < Integer > q = new PriorityQueue < > ( N ) ;
  final HashMap < Integer , Integer > map = new HashMap < > ( ) ;
  map . put ( 1 , 1 ) ;
  while ( q . size ( ) > 0 ) {
    final int n = q . poll ( ) ;
    final int c = q . poll ( ) ;
    final int a = ( n * 10 ) % N ;
    if ( ! map . containsKey ( a ) || map . get ( a ) > c ) {
      map . put ( a , c ) ;
      q . add ( new Integer [ ] {
        a , c }
        ) ;
      }
      final int b = ( n + 1 ) % N ;
      if ( ! map . containsKey ( b ) || map . get ( b ) > c + 1 ) {
        map . put ( b , c + 1 ) ;
        q . add ( new Integer [ ] {
          b , c + 1 }
          ) ;
        }
      }
      System . out . println ( map . get ( 0 ) ) ;
    }
    