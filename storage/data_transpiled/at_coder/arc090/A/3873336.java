public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A1 = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A1 . add ( i ) ;
  }
  List < Integer > A2 = Lists . newArrayList ( ) ;
  A2 . add ( N ) ;
  int nowGain = Integer . parseInt ( A2 . toString ( ) ) ;
  int maxGain = nowGain ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    nowGain = nowGain - A2 . get ( i - 1 ) + A1 . get ( i ) ;
    maxGain = Math . max ( maxGain , nowGain ) ;
  }
  System . out . println ( maxGain ) ;
}
