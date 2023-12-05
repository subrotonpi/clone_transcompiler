public static void print ( String s ) {
  s = list ( input ( ) ) ;
  int n = Integer . parseInt ( input ( ) ) ;
  int a = ( n - 1 ) / 5 , b = ( n - 1 ) % 5 ;
  String ans = s [ a ] + s [ b ] ;
  System . out . println ( ans ) ;
}
