@ VisibleForTesting static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > alili = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) alili . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  Map < Integer , Integer > cnt = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    cnt . put ( alili . get ( i ) . intValue ( ) , 1 ) ;
  }
  int ans = cnt . size ( ) ;
  Set < Integer > delSet = new HashSet < > ( ) ;
  for ( int j = 0 ;
  j < m - 1 ;
  j ++ ) {
    int x = cnt . get ( j ) . intValue ( ) ;
    int tmp = cnt . get ( x ) ;
    if ( tmp < ans ) ans = tmp ;
    cnt . remove ( x ) ;
    delSet . add ( x ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( alili . get ( i ) . intValue ( ) == x ) {
        while ( delSet . contains ( alili ) ) alili . remove ( i ) ;
        cnt . put ( alili . get ( i ) . intValue ( ) , 1 ) ;
      }
    }
  }
  System . out . println ( ans ) ;
}
