public static String input ( ) {
  String s = input ( ) ;
  int n = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    String temp = s . substring ( 0 , a - 1 ) ;
    for ( int j = a - 1 ;
    j < b ;
    j ++ ) {
      temp += s . charAt ( j ) ;
    }
    temp += s . substring ( b ) ;
    s = temp ;
  }
  System . out . println ( s ) ;
  return s ;
}
