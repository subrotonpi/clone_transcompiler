public static final int [ ] getAlphabet ( int input ) {
  int N = input ;
  int T = input ;
  int [ ] A = new int [ N ] ;
  A [ 0 ] = input ;
  int maxNum = A [ A . length - 1 ] ;
  HashMap < Integer , Integer > numMap = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < A . length - 1 ;
  i ++ ) {
    if ( ( A [ A . length - i - 1 ] > maxNum ) && ( maxNum > A [ A . length - i - 1 ] ) ) {
      maxNum = A [ A . length - i - 1 ] ;
    }
    if ( ( maxNum > A [ A . length - i - 1 ] ) && ( maxNum > A [ A . length - i - 1 ] ) ) {
      numMap . put ( maxNum - A [ A . length - i - 1 ] , 1 ) ;
    }
  }
  int key = Collections . max ( numMap . keySet ( ) ) ;
  System . out . println ( numMap . get ( key ) ) ;
  return A ;
}
