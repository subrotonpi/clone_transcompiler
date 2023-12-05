public static String Sa ( ) {
  String Sb = input ( ) ;
  String Sc = input ( ) ;
  char t = 'a' ;
  while ( true ) {
    switch ( t ) {
      case 'a' : if ( Sa . length ( ) == 0 ) {
        winner = 'A' ;
        break ;
      }
      t = Sa . charAt ( 0 ) ;
      Sa = Sa . substring ( 1 ) ;
      break ;
      case 'b' : if ( Sb . length ( ) == 0 ) {
        winner = 'B' ;
        break ;
      }
      t = Sb . charAt ( 0 ) ;
      Sb = Sb . substring ( 1 ) ;
      break ;
      default : if ( Sc . length ( ) == 0 ) {
        winner = 'C' ;
        break ;
      }
      t = Sc . charAt ( 0 ) ;
      Sc = Sc . substring ( 1 ) ;
      break ;
    }
  }
  System . out . println ( winner ) ;
  return Sa ;
}
