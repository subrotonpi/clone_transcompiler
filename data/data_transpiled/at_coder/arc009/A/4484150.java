public static int N = Integer . parseInt ( input ) {
  List < Integer > ab = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ab . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  double ans = 0 ;
  for ( int ai : ab ) {
    ans += ai * bi ;
  }
  System . out . println ( ( int ) ( ans * 1.05 ) ) ;
  return ans ;
}
