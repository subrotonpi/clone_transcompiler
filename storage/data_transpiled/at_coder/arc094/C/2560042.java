public static void print ( int n ) {
  int sum = 0 ;
  List < Integer > bmin = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    sum += a ;
    if ( a > b ) {
      bmin . add ( b ) ;
    }
  }
  if ( bmin . size ( ) == 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( sum - min ( bmin ) ) ;
  }
}
