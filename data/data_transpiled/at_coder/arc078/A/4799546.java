public static int N = Integer . parseInt ( input ) {
  int S = 0 ;
  List < Integer > s_list = new ArrayList < > ( ) ;
  List < Integer > inputList = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inputList . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int allS = Integer . parseInt ( inputList . get ( 0 ) ) ;
  for ( int n : inputList . subList ( inputList . size ( ) - 1 , inputList . size ( ) ) ) {
    S += n ;
    s_list . add ( Math . abs ( allS - 2 * S ) ) ;
  }
  System . out . println ( Collections . min ( s_list ) ) ;
  return S ;
}
