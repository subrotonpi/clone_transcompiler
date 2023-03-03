public static String input ( ) {
  String S2 = input ( ) ;
  String T = input ( ) ;
  int N = S2 . length ( ) ;
  Map < Integer , Boolean > Tplace = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Tplace . put ( i , false ) ;
  for ( int i = 0 ;
  i < N - T . length ( ) + 1 ;
  i ++ ) {
    int counter = 0 ;
    for ( int j = 0 ;
    j < T . length ( ) ;
    j ++ ) {
      if ( S2 . charAt ( i + j ) == T . charAt ( j ) || S2 . charAt ( i + j ) == '?' ) {
        counter ++ ;
        continue ;
      }
      else break ;
    }
    if ( counter == T . length ( ) ) Tplace . put ( i , true ) ;
  }
  ArrayList < String > ans = new ArrayList < > ( ) ;
  for ( Map . Entry < Integer , Boolean > entry : Tplace . entrySet ( ) ) {
    if ( entry . getValue ( ) ) {
      String tmp = S2 . substring ( 0 , entry . getKey ( ) ) + T + S2 . substring ( entry . getKey ( ) + T . length ( ) ) ;
      String tmp2 = tmp . replace ( '?' , 'a' ) ;
      ans . add ( tmp2 ) ;
    }
  }
  Collections . sort ( ans ) ;
  System . out . println ( ans . size ( ) > 0 ? ans . get ( 0 ) : "UNRESTORABLE" ) ;
  return "" ;
}
