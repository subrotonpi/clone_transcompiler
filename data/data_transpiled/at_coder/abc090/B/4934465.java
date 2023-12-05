public static int A , B = Integer . parseInt ( input ) {
  int ans = 0 ;
  for ( int i = A ;
  i <= B ;
  i ++ ) {
    String i_A = Integer . toString ( i ) ;
    String i_B = i_A . substring ( 0 , i_A . length ( ) - 1 ) ;
    if ( i_A . equals ( i_B ) ) {
      ans ++ ;
    }
  }
  return ans ;
}
