static final Scanner < Integer > System = new Scanner < Integer > ( ) {
  private final Supplier < String > ns = Supplier . defaultString ( ) ;
  private final Supplier < Integer > ni = Supplier . defaultInteger ( ) ;
  private final Supplier < Integer > nm = Supplier . defaultInteger ( ) ;
  private final Supplier < List < Integer >> nl = Supplier . defaultList ( ) ;
  @ Override public List < Integer > next ( ) {
    return Collections . singletonList ( ni . get ( ) ) ;
  }
  @ Override public void close ( ) {
  }
}
;
final List < Integer > a = Collections . nCopies ( 1 , ns . get ( ) ) ;
final List < Integer > b = Collections . nCopies ( 1 , ns . get ( ) ) ;
if ( a . size ( ) > b . size ( ) ) {
  System . out . println ( "GREATER" ) ;
}
else if ( a . size ( ) < b . size ( ) ) {
  System . out . println ( "LESS" ) ;
}
else {
  for ( int i = 0 ;
  i < a . size ( ) ;
  i ++ ) {
    if ( a . get ( i ) > b . get ( i ) ) {
      System . out . println ( "GREATER" ) ;
      exit ( ) ;
    }
    else if ( a . get ( i ) < b . get ( i ) ) {
      System . out . println ( "LESS" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "EQUAL" ) ;
}
