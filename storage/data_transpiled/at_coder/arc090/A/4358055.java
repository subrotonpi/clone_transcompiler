public static < T > Function < T , Integer > II = new Function < T , Integer > ( ) {
  @ Override public Integer apply ( T input ) {
    return Integer . parseInt ( input . toString ( ) ) ;
  }
}
;
Function < T , Integer > MI = new Function < T , Integer > ( ) {
  @ Override public Integer apply ( T input ) {
    return Integer . parseInt ( input . toString ( ) ) ;
  }
}
;
Function < T , List < T >> MIL = new Function < T , List < T >> ( ) {
  @ Override public List < T > apply ( T input ) {
    return Collections . singletonList ( input ) ;
  }
}
;
Function < T , Integer > MIS = new Function < T , Integer > ( ) {
  @ Override public Integer apply ( T input ) {
    return input . toString ( ) ;
  }
}
;
{
  int N = II . apply ( ) ;
  List < T > A = Arrays . asList ( MIL . apply ( input ) , MIL . apply ( input ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int ta = Integer . parseInt ( A . get ( 0 ) . toString ( ) . substring ( 0 , i + 1 ) ) + Integer . parseInt ( A . get ( 1 ) . toString ( ) . substring ( i ) ) ;
    ans = Math . max ( ans , ta ) ;
  }
  return ans ;
}
}
