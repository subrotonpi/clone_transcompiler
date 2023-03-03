public static final int [ ] getSmallIntegerList ( ) {
  if ( className == null ) {
    int X = Integer . parseInt ( input ( ) ) ;
    int Y = Integer . parseInt ( input ( ) ) ;
    int Z = Integer . parseInt ( input ( ) ) ;
    int [ ] A = new int [ X ] ;
    int [ ] B = new int [ X ] ;
    int [ ] C = new int [ X ] ;
    int N = X + Y + Z ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int tmpA = Integer . parseInt ( input ( ) ) ;
      int tmpB = Integer . parseInt ( input ( ) ) ;
      int tmpC = Integer . parseInt ( input ( ) ) ;
      A [ i ] = tmpA ;
      B [ i ] = tmpB ;
      C [ i ] = tmpC ;
    }
    int ans = 0 ;
    for ( int i = 0 ;
    i <= Z ;
    i ++ ) {
      if ( ans < leftMax [ i ] + rightMax [ i ] ) {
        ans = leftMax [ i ] + rightMax [ i ] ;
      }
    }
    System . out . println ( ans ) ;
  }
  int [ ] gold_minus_silver = new int [ N ] ;
  for ( int i = 0 ;
  i <= X ;
  i ++ ) {
    gold_minus_silver [ i ] = ( Integer . parseInt ( input ( ) ) - 1 ) ;
  }
  int [ ] left_max = new int [ Z + 1 ] ;
  for ( int i = 0 ;
  i <= Y ;
  i ++ ) {
    left_max [ 0 ] += left_side [ i ] ;
  }
  int [ ] left_bronze = new int [ Z + 1 ] ;
  for ( int i = 1 ;
  i <= Z ;
  i ++ ) {
    gold_minus_silver [ i ] = ( Integer . parseInt ( input ( ) ) - 1 ) ;
  }
  right_max = new int [ Z + 1 ] ;
  for ( int i = 0 ;
  i <= X ;
  i ++ ) {
    right_max [ i ] += rightMax [ i ] ;
  }
  left_bronze = new int [ N ] ;
  for ( int i = 0 ;
  i <= Y ;
  i ++ ) {
    left_bronze [ i ] = ( Integer . parseInt ( input ( ) ) - 1 ) ;
  }
  return left_bronze ;
}
