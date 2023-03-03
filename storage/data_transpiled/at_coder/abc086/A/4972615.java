public static void main ( String input , int a , int b ) {
  int c = ( int ) ( input . charAt ( 0 ) ) ;
  a = a * b ;
  b = a * b ;
  if ( c % 2 == 0 ) {
    System . out . println ( "Even" ) ;
  }
  else {
    System . out . println ( "Odd" ) ;
  }
}
