public static int n ( int input , int X ) {
  int aLst = Integer . parseInt ( input ) ;
  String binary = Integer . toBinaryString ( X ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < binary . length ( ) ;
  i ++ ) {
    if ( binary . charAt ( i ) == '1' ) {
      ans += aLst ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
