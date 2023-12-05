public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  HashMap < Integer , ArrayList < Integer >> friendsMap = new HashMap < Integer , ArrayList < Integer >> ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    if ( friendsMap . keySet ( ) . contains ( a ) ) friendsMap . get ( a ) . add ( b ) ;
    else friendsMap . put ( a , new ArrayList < Integer > ( ) ) ;
    if ( friendsMap . keySet ( ) . contains ( b ) ) friendsMap . get ( b ) . add ( a ) ;
    else friendsMap . put ( b , new ArrayList < Integer > ( ) ) ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    HashSet < Integer > friends = new HashSet < Integer > ( ) ;
    if ( friendsMap . keySet ( ) . contains ( i ) ) for ( int j = 0 ;
    j < friendsMap . get ( i ) . size ( ) ;
    j ++ ) for ( int k = 0 ;
    k < friendsMap . get ( j ) . size ( ) ;
    k ++ ) if ( friendsMap . get ( i ) . get ( k ) != i && ! friends . contains ( friendsMap . get ( i ) . get ( k ) ) ) friends . add ( friendsMap . get ( i ) . get ( k ) ) ;
  }
  System . out . println ( friends . size ( ) ) ;
}
