@ VisibleForTesting static void from ( Collection < String > input ) {
  System . setIn ( input ) ;
  input . nextLine ( ) ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > Num = Lists . newArrayList ( input . nextLine ( ) . split ( " " ) ) ;
  C = new Counter ( Num ) ;
  long ans = 0 ;
  l . add ( 0 ) ;
  int v = C . size ( ) ;
  int odd = Collections . frequency ( C ) ;
  int even = v - odd ;
  ans += odd + even / 2 * 2 ;
  System . out . println ( ans ) ;
}
