public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) . split ( " " ) ) ;
  List < Integer > l = Lists . newArrayList ( ) ;
  l . add ( N ) ;
  l . sort ( Collections . reverseOrder ( ) ) ;
  int answer = 0 ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    answer += l . get ( i ) ;
  }
  System . out . println ( answer ) ;
  return answer ;
}
