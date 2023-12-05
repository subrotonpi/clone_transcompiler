public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > ab = new ArrayList < > ( ) ;
  for ( int m = 0 ;
  m < M ;
  m ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    ab . add ( a ) ;
  }
  Collections . sort ( ab ) ;
  int cnt = 0 ;
  int last = - 1 ;
  for ( int a : ab ) {
    int b = a ;
    if ( b < last ) {
      continue ;
    }
    else {
      cnt ++ ;
      last = b ;
    }
  }
  System . out . println ( cnt ) ;
  return cnt ;
}
