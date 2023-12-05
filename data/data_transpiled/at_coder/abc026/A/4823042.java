public static int A ( ) {
  int N ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A % 2 == 0 ) {
    N = ( int ) ( A * A / 4 ) ;
  }
  else {
    N = ( int ) ( A / 2 ) * ( ( int ) ( A / 2 ) + 1 ) ;
  }
  return N ;
}
