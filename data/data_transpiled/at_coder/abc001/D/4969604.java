public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ 482 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int b = Integer . parseInt ( input . substring ( 0 , i ) ) ;
    int c = Integer . parseInt ( input . substring ( i + 1 , i + 1 ) ) ;
    b -= b % 5 ;
    if ( c % 5 != 0 ) {
      c += 5 - ( c % 5 ) ;
      if ( c % 100 == 60 ) c += 40 ;
    }
    b /= 5 ;
    c /= 5 ;
    a [ b ] ++ ;
    a [ c ] -- ;
  }
  boolean ren = false ;
  int tmp = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    tmp += a [ i ] ;
    if ( tmp != 0 ) {
      if ( ren == false ) {
        String s = Integer . toString ( i * 5 ) . replaceAll ( "-" , "" ) + "-" ;
        System . out . print ( s ) ;
        ren = true ;
      }
    }
    else if ( tmp == 0 ) {
      if ( ren ) {
        ren = false ;
        String s = Integer . toString ( i * 5 ) . replaceAll ( "-" , "" ) ;
        System . out . println ( s ) ;
      }
    }
  }
}
