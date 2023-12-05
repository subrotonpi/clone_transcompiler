public static void print ( int n , String a ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > b = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > hist = new ArrayList < Integer > ( ) ;
  while ( ! hist . contains ( a ) ) {
    hist . add ( a ) ;
    a = b . get ( a - 1 ) ;
  }
  List < Integer > init = hist . subList ( 0 , hist . indexOf ( a ) ) ;
  List < Integer > loop = hist . subList ( hist . indexOf ( a ) , hist . size ( ) ) ;
  if ( k < init . size ( ) ) {
    print ( init . get ( k ) ) ;
  }
  else {
    print ( loop . get ( ( k - init . size ( ) ) % loop . size ( ) ) ) ;
  }
}
