public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = n - x ;
  int b = x ;
  if ( ( a < b ) && ( b < a ) ) {
    a = b ;
    b = a ;
  }
  int pathLength = calcPath ( a , b , n ) ;
  System . out . println ( pathLength ) ;
  {
    int a1 = a1 / 2 ;
    int b1 = b1 / 2 ;
    int mod = a1 % 2 ;
    int count = 0 ;
    int c2 ;
    if ( mod == 0 ) {
      c2 = c1 + 2 * b1 * q - b1 ;
      return c2 ;
    }
    else {
      count = count + 1 ;
      c2 = c1 + 2 * b1 * q ;
      int a2 = a1 - b1 * q ;
      int b2 = b1 ;
      if ( ( a2 < b2 ) && ( b2 < a2 ) ) {
        a2 = b2 ;
        b2 = a2 ;
      }
      return calcPath ( a2 , b2 , c2 ) ;
    }
  }
}
