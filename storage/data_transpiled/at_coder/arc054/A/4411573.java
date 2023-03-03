static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = args [ 0 ] ;
  int L = Integer . parseInt ( input ) ;
  int X = Integer . parseInt ( input ) ;
  int Y = Integer . parseInt ( input ) ;
  int S = Integer . parseInt ( input ) ;
  int D = Integer . parseInt ( input ) ;
  int ans ;
  if ( S >= D ) {
    int distL = S - D ;
    int distR = L - distL ;
    int velR = X + Y ;
    int velL = Y - X ;
    if ( velL <= 0 ) {
      ans = distR / velR ;
    }
    else {
      ans = Math . min ( distR / velR , distL / velL ) ;
    }
  }
  else {
    System . out . println ( " " + S ) ;
  }
}
