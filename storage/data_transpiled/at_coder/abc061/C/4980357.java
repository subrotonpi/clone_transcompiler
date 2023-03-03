public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > nums = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    List < Integer > ab = new LinkedList < > ( ) ;
    ab . add ( i ) ;
    nums . add ( ab ) ;
  }
  nums . sort ( ) ;
  int tmp = 0 ;
  int index = 0 ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    tmp += nums . get ( i ) ;
  }
  return index ;
}
