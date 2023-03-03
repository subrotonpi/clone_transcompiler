public static void main ( String a , String b ) {
  int n = map ( Integer . parseInt , open ( 0 ) ) ;
  while ( n % a > 0 || n % b > 0 ) {
    n ++ ;
  }
  System . out . println ( n ) ;
}
