public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = 0 , b = 0 , c = 0 , d = 0 , e = 0 , f = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double Mti = Double . parseDouble ( input . nextLine ( ) ) , mti = Double . parseDouble ( input . nextLine ( ) ) ;
    Mti *= 10 ;
    mti *= 10 ;
    if ( Mti >= 350 ) {
      a ++ ;
    }
    else if ( Mti >= 300 ) {
      b ++ ;
    }
    else if ( Mti >= 250 ) {
      c ++ ;
    }
    if ( mti >= 250 ) {
      d ++ ;
    }
    if ( Mti >= 0 && mti < 0 ) {
      e ++ ;
    }
    else if ( Mti < 0 ) {
      f ++ ;
    }
  }
  System . out . println ( a + " " + b + " " + c + " " + d + " " + e + " " + f ) ;
}
