@ MoreRequires public static void main ( String [ ] args ) {
  final int N = ( Integer ) input . nextInt ( ) ;
  final int M = ( Integer ) input . nextInt ( ) ;
  final int [ ] a = new int [ M ] ;
  final int [ ] b = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int c = ( Integer ) input . nextInt ( ) ;
    final int d = ( Integer ) input . nextInt ( ) ;
    a [ i ] = c ;
    b [ i ] = d ;
  }
  final List < Integer > l = Lists . newArrayList ( ) ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    l . add ( i ) ;
  }
  final List < List < Integer >> d = new ArrayList < > ( ) ;
  for ( final List < Integer > elem : Lists . newArrayList ( l ) ) {
    final List < Integer > list = new ArrayList < > ( elem ) ;
    list . add ( 0 , 1 ) ;
    d . add ( list ) ;
  }
  int ans = 0 ;
  for ( final List < Integer > l1 : d ) {
    boolean flag = true ;
    for ( int i = 0 ;
    i < l1 . size ( ) - 1 ;
    i ++ ) {
      for ( int j = 0 ;
      j < M ;
      j ++ ) {
        if ( ( a [ j ] == l1 . get ( i ) && b [ j ] == l1 . get ( i + 1 ) ) || ( b [ j ] == l1 . get ( i ) && a [ j ] == l1 . get ( i + 1 ) ) ) {
          flag = true ;
          break ;
        }
        flag = false ;
      }
      if ( flag == false ) {
        break ;
      }
    }
    if ( flag ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
