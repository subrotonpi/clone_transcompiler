public static void input ( ) {
  String s = input ( ) ;
  String s1 = s . substring ( 0 , ( s . length ( ) - s . length ( ) % 2 ) / 2 ) , s2 = s . substring ( ( s . length ( ) + s . length ( ) % 2 ) / 2 ) ;
  int num = 0 ;
  for ( int i = 0 ;
  i < s1 . length ( ) ;
  i ++ ) if ( s1 . charAt ( i ) != s2 . charAt ( i ) ) num ++ ;
  if ( num == 2 ) break ;
}
