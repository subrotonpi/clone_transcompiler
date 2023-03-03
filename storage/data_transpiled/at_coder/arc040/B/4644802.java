static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  M = Integer . parseInt ( input . nextLine ( ) ) ;
  String L = input . nextLine ( ) . substring ( 0 , L . length ( ) - 1 ) ;
  int ans = 0 ;
  int i = L . length ( ) - 1 ;
  boolean first = true ;
  while ( i >= 0 ) {
    if ( L . charAt ( i ) == 'o' ) {
      i -- ;
    }
    else {
      if ( first ) {
        ans ++ ;
        i -= M ;
        if ( i >= 0 ) {
          ans += i + 1 ;
        }
        first = false ;
      }
      else {
        ans ++ ;
        i -= M ;
      }
    }
  }
  System . out . println ( ans ) ;
}
