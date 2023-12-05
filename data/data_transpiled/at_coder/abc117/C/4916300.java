public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] Xs = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > X_lst = new ArrayList < > ( Xs ) ;
  List < Integer > dX = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < X_lst . size ( ) - 1 ;
  i ++ ) dX . add ( X_lst . get ( i + 1 ) - X_lst . get ( i ) ) ;
  if ( N >= M ) System . out . println ( 0 ) ;
  else if ( N == 1 ) System . out . println ( Arrays . toString ( dX ) ) ;
  else System . out . println ( Arrays . toString ( dX . toArray ( ) ) ) ;
  return ( int ) ( ( ( ( int ) X . get ( 0 ) ) - ( ( ( int ) X . get ( 1 ) ) ) ) / M ) ;
}
