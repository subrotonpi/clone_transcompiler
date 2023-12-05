public static void print ( int N ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  L . sort ( ) ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    sum += L . get ( ( i - 1 ) * 2 ) ;
  }
  System . out . println ( sum ) ;
}
