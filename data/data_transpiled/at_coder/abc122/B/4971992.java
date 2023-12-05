public static void input ( ) {
  s = input ( ) ;
  ArrayList < Integer > t = new ArrayList < Integer > ( ) ;
  t . add ( - 1 ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) != 'A' && s . charAt ( i ) != 'G' && s . charAt ( i ) != 'C' && s . charAt ( i ) != 'T' ) {
      t . add ( i ) ;
    }
  }
  t . add ( s . length ( ) ) ;
  int ans = 0 ;
  for ( int j = 0 ;
  j < t . size ( ) - 1 ;
  j ++ ) {
    int x = t . get ( j + 1 ) - t . get ( j ) - 1 ;
    if ( x > ans ) {
      ans = x ;
    }
  }
  System . out . println ( ans ) ;
}
