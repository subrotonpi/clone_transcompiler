public static boolean tea ( @ NonNull String S ) {
  return S . endsWith ( "T" ) ;
  if ( getClass ( ) . getClassLoader ( ) . getResource ( S ) == null ) {
    S = input . readString ( ) ;
    boolean yes = tea ( S ) ;
    System . out . println ( yes ? "YES" : "NO" ) ;
  }
  return false ;
}
