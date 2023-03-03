@ Nullable public static int solve ( int n ) {
  int cur = n ;
  int l = n ;
  int goalLeft = n ;
  int goalRight = n ;
  int curLeft = n ;
  int goalRight = n ;
  int goalLeft = n ;
  int goalRight = n ;
  if ( cur == n ) {
    return cur ;
  }
  String scur = Integer . toString ( cur ) ;
  int half = n / 2 ;
  int goalLeft = n ;
  int goalRight = n ;
  int goalRight = n ;
  if ( goalLeft != 0 ) {
    int left = Integer . parseInt ( Integer . toString ( goalLeft ) . substring ( 0 , goalLeft ) ) ;
    if ( goalLeft == Math . pow ( 10 , half - 1 ) ) {
      steps += Math . pow ( 10 , sn . length ( ) ) ;
      return steps ;
    }
    steps += left ;
    steps += Math . pow ( 10 , sn . length ( ) ) - 1 ;
    return steps ;
  }
  else {
    int left = Integer . parseInt ( Integer . toString ( goalLeft ) . substring ( 0 , goalLeft ) ) ;
    if ( goalRight != 1 ) {
      steps += Math . pow ( 10 , sn . length ( ) ) ;
      return steps ;
    }
    steps += Math . pow ( 10 , sn . length ( ) ) - 1 ;
    return steps ;
  }
}
