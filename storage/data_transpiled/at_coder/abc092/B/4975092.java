public static int N = Integer . parseInt ( input ) {
  int D = Integer . parseInt ( input . nextLine ( ) ) , X = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X += ( D - 1 ) / Integer . parseInt ( input . nextLine ( ) ) ;
  }
  return X + N ;
}
