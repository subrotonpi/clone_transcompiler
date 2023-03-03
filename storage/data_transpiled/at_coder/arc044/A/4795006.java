public static boolean isPrime ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = Integer . toString ( n ) ;
  boolean ans = true ;
  if ( n == 1 ) {
    ans = false ;
  }
  else if ( n != 2 && n != 3 && n != 5 && n != 7 ) {
    if ( Integer . parseInt ( s ) % 3 == 0 || Integer . parseInt ( s . substring ( s . length ( ) - 1 ) ) % 2 == 0 || s . substring ( 0 , 1 ) . equals ( "5" ) ) {
      ans = false ;
    }
  }
  return ans ? "Prime" : "Not Prime" ;
}
