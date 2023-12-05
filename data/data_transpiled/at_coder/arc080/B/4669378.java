public static String [ ] getDigits ( ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > lis = new ArrayList < > ( ) ;
  String [ ] ans = new String [ h ] ;
  int nu = 0 ;
  int nn = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > li = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < nn ;
  i ++ ) li . add ( Integer . toString ( i ) ) ;
  return lis . toArray ( ) ;
}
