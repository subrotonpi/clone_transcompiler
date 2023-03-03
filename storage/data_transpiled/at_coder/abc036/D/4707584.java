public static int [ ] treeDP ( int p ) {
  final int MOD = 10 * 9 + 7 ;
  int n = Integer . parseInt ( input ( ) ) ;
  List < List < Integer >> ab = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ab . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    ab . get ( a - 1 ) . add ( b - 1 ) ;
    ab . get ( b - 1 ) . add ( a - 1 ) ;
  }
  /* if (ab.get(p).size() == 0) {
  return new int[] {2, 1};
  } else {
  int f = 1;
  int g = 1;
  for (int x : ab.get(x)) {
  ab.get(x).remove(p);
  }
  }*/
  System . out . println ( treeDP ( 0 ) . get ( 0 ) ) ;
}
