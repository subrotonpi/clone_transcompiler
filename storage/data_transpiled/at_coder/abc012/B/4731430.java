public static void main ( ) {
  int n = input . nextInt ( ) ;
  int h = n / ( 60 * 60 ) ;
  int m = ( n % ( 60 * 60 ) ) / 60 ;
  int s = ( n % ( 60 * 60 ) ) % 60 ;
  System . out . println ( h + ":" + m + ":" + s ) ;
}
