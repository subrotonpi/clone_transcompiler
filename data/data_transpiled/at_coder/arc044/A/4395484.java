public static String toString ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String res = "Prime" ;
  /*for (int i=2; i++) {
  if (i*i>n) break;
  if (n%i==0) return false;
  }*/
  if ( N == 1 ) {
    res = "Prime" ;
  }
  else {
    if ( N == 1 ) {
      res = "Not Prime" ;
    }
    if ( Integer . parseInt ( String . valueOf ( N ) . substring ( N . length ( ) - 1 ) ) == 5 ) {
      res = "Not Prime" ;
    }
    if ( N % 2 == 0 ) {
      res = "Not Prime" ;
    }
  }
  return res ;
}
