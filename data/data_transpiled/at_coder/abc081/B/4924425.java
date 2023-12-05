public static int n = Integer . parseInt ( input ) {
  List < Integer > alist = new ArrayList < Integer > ( ) ;
  for ( String _ : input . split ( " " ) ) alist . add ( Integer . parseInt ( _ ) ) ;
  List < Integer > result = new ArrayList < Integer > ( ) ;
  for ( Integer a : alist ) {
    int eachResult = 0 ;
    while ( a % 2 == 0 ) {
      a = a / 2 ;
      eachResult = eachResult + 1 ;
    }
    result . add ( eachResult ) ;
  }
  System . out . println ( Collections . min ( result ) ) ;
  return result . size ( ) ;
}
