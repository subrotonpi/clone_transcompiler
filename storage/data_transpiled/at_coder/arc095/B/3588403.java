public static int N ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int ai = Math . max ( a ) ;
  a . remove ( ai ) ;
  int ans = 0 ;
  return ans ;
}
