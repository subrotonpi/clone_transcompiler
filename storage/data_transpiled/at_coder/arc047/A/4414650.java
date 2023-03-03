static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  L = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  int clash = 0 ;
  int tab = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( s . charAt ( i ) == '+' ) {
      tab ++ ;
      if ( tab > L ) {
        clash ++ ;
        tab = 1 ;
      }
    }
    else {
      tab -- ;
    }
  }
  System . out . println ( clash ) ;
}
