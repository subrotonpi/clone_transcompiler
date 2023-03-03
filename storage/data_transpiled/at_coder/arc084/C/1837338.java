public static void main ( String [ ] args ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > ans ;
  if ( K % 2 == 0 ) {
    ans = new ArrayList < > ( ) ;
    ans . add ( K / 2 ) ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      ans . add ( K ) ;
    }
  }
  else {
    int back = N / 2 ;
    int mid = K / 2 + 1 ;
    ans = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      ans . add ( mid ) ;
    }
    for ( int i = 0 ;
    i < back ;
    i ++ ) {
      if ( ans . get ( ans . size ( ) - 1 ) == 1 ) {
        ans . remove ( ans . size ( ) - 1 ) ;
      }
      else {
        ans . get ( ans . size ( ) - 1 ) -- ;
        while ( ans . size ( ) < N ) {
          ans . add ( K ) ;
        }
      }
    }
    System . out . println ( Arrays . toString ( ans . toArray ( ) ) ) ;
  }
  if ( getClass ( ) . equals ( Main . class ) ) {
    Main . main ( ) ;
  }
}
