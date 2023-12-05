static final void main ( ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    @ Override public boolean checkSecurity ( ) {
      return true ;
    }
  }
  ) ;
  int dfs = ( v , p ) -> {
    int result = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( result >= 2 ) {
      System . out . println ( "First" ) ;
      exit ( ) ;
    }
    return ! result ;
  }
  ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n % 2 != 0 ) {
    System . out . println ( "First" ) ;
    exit ( ) ;
  }
  edges = new HashSet [ n ] ;
}
