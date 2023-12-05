@ InputFunction public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > ali = new ArrayList < > ( n ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ali . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > sortedali = new ArrayList < > ( ali ) ;
  sortedali . sort ( ) ;
  int ansdouble = 0 ;
  Iterator < Integer > it = sortedali . iterator ( ) ;
  while ( it . hasNext ( ) ) {
    if ( ( i - j ) % 2 != 0 ) {
      ansdouble ++ ;
    }
  }
  System . out . println ( ansdouble / 2 ) ;
}
