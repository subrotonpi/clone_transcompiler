public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  if ( 1 <= a && a <= 100 && 1 <= b && b <= 100 ) {
    if ( b <= a ) {
      if ( a % b == 0 ) {
        System . out . println ( 0 ) ;
      }
      else if ( a % b != 0 ) {
        System . out . println ( b - ( a % b ) ) ;
      }
    }
    else if ( a < b ) {
      System . out . println ( b - a ) ;
    }
  }
}
