public static void main ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i : input ( ) . split ( " " ) ) {
    L . add ( i ) ;
  }
  L . sort ( ) ;
  long ans = 0 ;
  for ( int i = 0 ;
  i < 2 * N ;
  i += 2 ) {
    ans += L . get ( i ) ;
  }
  System . out . println ( ans ) ;
}
