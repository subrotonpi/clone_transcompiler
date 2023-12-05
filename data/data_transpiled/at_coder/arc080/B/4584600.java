public static void startProcess ( int high , int width , int number , int [ ] colorData ) {
  String [ ] ansData = new String [ number ] ;
  for ( int i = 0 ;
  i < number ;
  i ++ ) {
    ansData [ i ] = Integer . toString ( i + 1 ) ;
  }
  for ( int i = 0 ;
  i < high ;
  i ++ ) {
    String ansKari = ansData [ i * width ] ;
    if ( i % 2 == 1 ) ansKari = ansKari . substring ( 0 , ansKari . length ( ) - 1 ) ;
    System . out . println ( StringUtils . joinWords ( ansKari , " " ) ) ;
  }
  {
    int high = Integer . parseInt ( input ( ) ) ;
    int width = Integer . parseInt ( input ( ) ) ;
    number = Integer . parseInt ( input ( ) ) ;
    colorData = new LinkedList < Integer > ( ) ;
    for ( int i = 0 ;
    i < number ;
    i ++ ) {
      colorData [ i ] = Integer . parseInt ( input ( ) ) ;
    }
    startProcess ( high , width , number , colorData ) ;
  }
  if ( getClass ( ) . isClassPresent ( MainApplication . class ) ) {
    MainApplication . run ( ) ;
  }
}
