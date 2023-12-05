public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > X = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int left = 0 ;
  int right = 100 ;
  while ( ( ( right - left ) > 10 * ( - 12 ) ) ) {
    int mid = ( left + right ) / 2 ;
    List < Integer > Y = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < X . size ( ) ;
    i ++ ) Y . add ( X . get ( i ) ) ;
    int tmp = sum ( Y , 0 , K ) ;
    if ( tmp > 0 ) left = mid ;
    else right = mid ;
  }
  System . out . println ( right ) ;
  return left ;
}
