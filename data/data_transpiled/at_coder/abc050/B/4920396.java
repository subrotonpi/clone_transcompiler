public static int N = Integer . parseInt ( input ) {
  int [ ] T = new int [ N ] ;
  for ( int i = 0 ;
  i < T . length ;
  i ++ ) T [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Pair < Integer , Integer >> L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    L . add ( new Pair < > ( p , x ) ) ;
  }
  int T_sum = sum ( T ) ;
  for ( Pair < Integer , Integer > i : L ) {
    int check = T [ i . first - 1 ] - i . second ;
    System . out . println ( T_sum - check ) ;
  }
  return T_sum ;
}
