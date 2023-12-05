public static int a ( int input , int b ) {
  if ( input % b == 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( b - ( input % b ) ) ;
  }
  return a ;
}
