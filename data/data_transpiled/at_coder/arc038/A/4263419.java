static final int [ ] getMath ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] A = input . nextLine ( ) . split ( "\\s+" ) ;
  Arrays . sort ( A ) ;
  Arrays . sort ( A ) ;
  List < Integer > listA = new ArrayList < > ( ) ;
  List < Integer > listB = new ArrayList < > ( ) ;
  int c = 0 ;
  for ( int i = 0 ;
  i < Math . ceil ( N / 2 ) ;
  i ++ ) {
    listA . add ( A . get ( i + c ) ) ;
    if ( N % 2 != 0 && i + c + 1 > N - 1 ) {
    }
    else {
      listB . add ( A . get ( i + c + 1 ) ) ;
    }
    c ++ ;
  }
  System . out . println ( Arrays . toString ( listA ) ) ;
}
