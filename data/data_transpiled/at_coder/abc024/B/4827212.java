public static int N = Integer . parseInt ( input ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int amount = 0 ;
  int pre = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ( a - pre ) < T ) amount += ( a - pre ) ;
    else amount += T ;
    pre = a ;
  }
  amount += T ;
  return amount ;
}
