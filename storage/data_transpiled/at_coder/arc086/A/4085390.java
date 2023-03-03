@ VisibleForTesting static < T > Function < T , Integer > II = new Function < T , Integer > ( ) {
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
Function < T , Integer > main = new Function < T , Integer > ( ) {
  @ Override public Integer apply ( T input ) {
    Integer N = MI . apply ( input ) ;
    Integer K = MI . apply ( input ) ;
    Counter < Integer > C = new ClassicCounter < Integer > ( ) ;
    C . incrementCount ( MI . apply ( input ) ) ;
    return N - C . incrementCount ( K ) ;
  }
}
;
if ( getClass ( ) . equals ( Main . class ) ) {
  System . out . println ( main . toString ( ) ) ;
}
