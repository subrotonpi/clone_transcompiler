static final void print ( ) {
  final Function < String , Integer > ns = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String input ) {
      return Integer . parseInt ( input ) ;
    }
  }
  ;
  Function < String , Integer > nm = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String input ) {
      return Integer . parseInt ( input ) ;
    }
  }
  ;
  Function < String , Integer > nl = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String input ) {
      return Integer . parseInt ( input ) ;
    }
  }
  ;
  int n = ni . apply ( nl ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int l = nm . apply ( nl ) ;
    int r = nl . apply ( nl ) ;
    ans += r - l + 1 ;
  }
  System . out . println ( ans ) ;
}
