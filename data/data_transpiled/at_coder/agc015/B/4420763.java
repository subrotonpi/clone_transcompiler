public static void input ( ) {
  String s = input ( ) ;
  int n = s . length ( ) ;
  int a = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    char t = s . charAt ( i ) ;
    if ( t == 'U' ) {
      a += n - 1 - i + i * 2 ;
    }
    else {
      a += ( n - 1 - i ) * 2 + i ;
    }
  }
  System . out . println ( a ) ;
}
