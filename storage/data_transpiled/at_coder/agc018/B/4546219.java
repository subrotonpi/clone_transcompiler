@ VisibleForTesting static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> a = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int ans = 1000 ;
  Set < Integer > used = new HashSet < > ( ) ;
  try {
    while ( true ) {
      Counter < Integer > counter = new Counter < > ( a . get ( h . size ( ) - 1 ) ) ;
      int mc = counter . getCount ( ) ;
      int count = counter . getCount ( ) ;
      used . add ( mc ) ;
      if ( ans > count ) {
        ans = count ;
      }
      for ( List < Integer > h : a ) {
        while ( used . contains ( h . get ( h . size ( ) - 1 ) ) ) {
          h . remove ( h . size ( ) - 1 ) ;
        }
      }
    }
  }
  catch ( NoSuchElementException e ) {
    System . out . println ( ans ) ;
  }
}
