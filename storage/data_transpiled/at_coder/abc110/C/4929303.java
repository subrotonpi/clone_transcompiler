static final String YES = "Yes" ;
final String NO = "No" ;
{
  final Map < String , Integer > wcS = new LinkedHashMap < String , Integer > ( ) ;
  final Map < String , Integer > wcT = new LinkedHashMap < String , Integer > ( ) ;
  for ( char c : S . keySet ( ) ) {
    wcS . put ( c , 1 ) ;
  }
  for ( char c : T . keySet ( ) ) {
    wcT . put ( c , 1 ) ;
  }
  final Map < String , Integer > cS = new LinkedHashMap < String , Integer > ( ) ;
  final Map < String , Integer > cT = new LinkedHashMap < String , Integer > ( ) ;
  for ( String key : wcS . keySet ( ) ) {
    cS . put ( wcS . get ( key ) , 1 ) ;
  }
  for ( String key : wcT . keySet ( ) ) {
    cT . put ( wcT . get ( key ) , 1 ) ;
  }
  boolean representable = true ;
  if ( cT . keySet ( ) . size ( ) > cS . keySet ( ) . size ( ) ) {
    final Map < String , Integer > temp = cT ;
    cT = cS ;
    cS = temp ;
  }
  for ( String key : cS . keySet ( ) ) {
    if ( cT . get ( key ) != cS . get ( key ) ) representable = false ;
  }
  System . out . println ( representable ? YES : NO ) ;
  return YES ;
}
