private static int S = Integer . parseInt ( input ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  HashMap < String , Integer > dic = new HashMap < > ( ) ;
  dic . put ( "U" , 0 ) ;
  dic . put ( "D" , 0 ) ;
  dic . put ( "R" , 0 ) ;
  dic . put ( "L" , 0 ) ;
  int ct = 0 ;
  for ( String s : S ) {
    if ( s != null ) {
      dic . put ( s , dic . get ( s ) + 1 ) ;
    }
    else {
      ct ++ ;
    }
  }
  int A = Math . abs ( dic . get ( "U" ) - dic . get ( "D" ) ) + Math . abs ( dic . get ( "R" ) - dic . get ( "L" ) ) ;
  return T ;
}
