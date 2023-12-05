public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  List < Integer > ar = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    ar . add ( i ) ;
  }
  ar . add ( 0 ) ;
  ar . add ( 0 ) ;
  int count = 0 ;
  for ( int i = 1 ;
  i <= a ;
  i ++ ) {
    count += Math . abs ( ar . get ( i ) - ar . get ( i - 1 ) ) ;
  }
  for ( int i = 1 ;
  i <= a ;
  i ++ ) {
    int b = Math . abs ( ar . get ( i - 1 ) - ar . get ( i + 1 ) ) ;
    int c = Math . abs ( ar . get ( i - 1 ) - ar . get ( i ) ) ;
    int d = Math . abs ( ar . get ( i ) - ar . get ( i + 1 ) ) ;
    System . out . println ( count + b - c - d ) ;
  }
}
