public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int count = 0 ;
  ArrayList < Integer > ar = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    int l = Integer . parseInt ( input ) ;
    count += l ;
    if ( l % 10 != 0 ) {
      ar . add ( l ) ;
    }
  }
  if ( count % 10 != 0 ) {
    System . out . println ( count ) ;
  }
  else {
    if ( ar . size ( ) == 0 ) {
      System . out . println ( 0 ) ;
    }
    else {
      System . out . println ( count - min ( ar ) ) ;
    }
  }
}
