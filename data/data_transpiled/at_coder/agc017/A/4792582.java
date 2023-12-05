public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int p = Integer . parseInt ( input ) ;
  List < Integer > alist = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    alist . add ( Integer . parseInt ( input ) ) ;
  }
  int odda = 0 ;
  for ( int a : alist ) {
    if ( a % 2 == 1 ) {
      odda ++ ;
    }
  }
  if ( odda == 0 ) {
    if ( p == 0 ) {
      System . out . println ( Math . pow ( 2 , n ) ) ;
    }
    else {
      System . out . println ( 0 ) ;
    }
  }
  else {
    System . out . println ( Math . pow ( 2 , n - 1 ) ) ;
  }
}
