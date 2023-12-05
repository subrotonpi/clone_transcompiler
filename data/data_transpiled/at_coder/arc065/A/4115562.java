static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String s1 = "maerd" ;
  String s2 = "remaerd" ;
  String s3 = "esare" ;
  String s4 = "resare" ;
  int i = input . nextInt ( ) ;
  StringBuffer sb = new StringBuffer ( ) ;
  for ( int c = 0 ;
  c < i ;
  c ++ ) {
    sb . append ( i ) ;
  }
  int l = sb . length ( ) ;
  i = 0 ;
  /* dfs */
  if ( i == l ) {
    System . out . println ( "YES" ) ;
    exit ( ) ;
  }
  /* dfs */
}
