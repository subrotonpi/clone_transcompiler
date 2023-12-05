public static void main ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  int ans = 0 ;
  Collections . sort ( L ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += L . get ( 2 * i ) ;
  }
  System . out . println ( ans ) ;
}
