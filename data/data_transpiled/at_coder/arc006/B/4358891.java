public static int N = Integer . parseInt ( input ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < String > l = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    String t = " " + input . nextLine ( ) + " " ;
    l . add ( t ) ;
  }
  l . remove ( 0 ) ;
  String n = l . get ( 0 ) ;
  n = n . trim ( ) ;
  int s = n . indexOf ( "o" ) ;
  return s / 2 + 1 ;
}
