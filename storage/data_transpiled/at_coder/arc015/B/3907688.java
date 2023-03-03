public static int N = Integer . parseInt ( input ) {
  int N = input . nextInt ( ) ;
  int A1 = 0 ;
  int A2 = 0 ;
  int A3 = 0 ;
  int A4 = 0 ;
  int A5 = 0 ;
  int A6 = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double M = Double . parseDouble ( input . nextLine ( ) ) ;
    double m = Double . parseDouble ( input . nextLine ( ) ) ;
    if ( M >= 35 ) A1 ++ ;
    else if ( M >= 30 ) A2 ++ ;
    else if ( M >= 25 ) A3 ++ ;
    if ( M >= 25 ) A4 ++ ;
    if ( M >= 25 ) A5 ++ ;
    if ( M >= 25 ) A6 ++ ;
  }
  return N ;
}
