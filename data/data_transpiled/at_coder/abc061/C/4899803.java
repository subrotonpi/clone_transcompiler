public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > L = new ArrayList < > ( Arrays . asList ( Collections . nCopies ( N , "" ) ) ) ;
  Collections . sort ( L ) ;
  int num = 0 ;
  for ( Integer a : L ) {
    int b = a ;
    num += b ;
    if ( K <= num ) {
      System . out . println ( a ) ;
      exit ( ) ;
    }
  }
  return num ;
}
