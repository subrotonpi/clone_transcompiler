public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Rule > rules = new ArrayList < Rule > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    rules . add ( new Rule ( a , b ) ) ;
  }
  List < Rule > sorted = new ArrayList < Rule > ( rules ) ;
  Collections . sort ( sorted ) ;
  for ( Rule rule : sorted ) {
    K -= rule . value ;
    if ( K <= 0 ) {
      System . out . println ( rule . value ) ;
      break ;
    }
  }
  return K ;
}
