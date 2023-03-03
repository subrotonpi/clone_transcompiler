@ VisibleForTesting static void fractions ( Scanner input ) {
  int x = input . nextInt ( ) ;
  int y = input . nextInt ( ) ;
  int i = 1 ;
  Fraction xdivy = new Fraction ( x , y ) ;
  int nkari = 2 * x / y ;
  int nkari2 = 2 * x / y + 1 ;
  boolean flag = false ;
  int sumkari = nkari * ( nkari + 1 ) / 2 ;
  int sumkari1 = nkari2 * ( nkari2 + 1 ) / 2 ;
  Fraction anskari1 = new Fraction ( nkari * ( nkari + 1 ) , 2 ) . subtract ( xdivy ) . multiply ( nkari ) ;
  Fraction anskari2 = new Fraction ( nkari2 * ( nkari2 + 1 ) , 2 ) . subtract ( xdivy ) . multiply ( nkari2 ) ;
  flag = false ;
  if ( anskari1 . getDenominator ( ) == 1 && anskari1 != 0 && nkari != 0 ) {
    flag = true ;
    System . out . println ( nkari + " " + anskari1 ) ;
  }
  if ( anskari2 . getDenominator ( ) == 1 && anskari2 != 0 && nkari2 != 0 ) {
    flag = true ;
    System . out . println ( nkari2 + " " + anskari2 ) ;
  }
  if ( ! flag ) {
    System . out . println ( "Impossible" ) ;
  }
}
