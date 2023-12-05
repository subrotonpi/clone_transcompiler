public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > ans = new ArrayList < > ( ) ;
  int c = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i == X ) {
      ans . add ( c ) ;
      c ++ ;
    }
  }
  return ans . toArray ( ) ;
}
