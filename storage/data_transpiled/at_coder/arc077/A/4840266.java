public static String print ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  List < String > As = Lists . newArrayList ( ) ;
  for ( String s : input ( ) ) {
    As . add ( s ) ;
  }
  String back = As . get ( 0 ) ;
  String forward ;
  if ( n == 2 ) {
    forward = As . get ( 1 ) ;
  }
  String ans = As . get ( 2 ) ;
  return ans ;
}
