public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  ArrayList < String > ar = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    if ( i == 0 ) {
      String l = input . substring ( 0 , 1 ) ;
      ar . add ( l ) ;
    }
    else if ( i >= 1 ) {
      String l = input . substring ( 0 , 1 ) ;
      if ( ! ar . contains ( l ) ) {
        String g = ar . get ( ar . size ( ) - 1 ) ;
        if ( g . charAt ( g . length ( ) - 1 ) == l . charAt ( 0 ) ) {
          ar . add ( l ) ;
        }
        else {
          if ( i % 2 == 0 ) {
            System . out . println ( "LOSE" ) ;
            break ;
          }
          else {
            System . out . println ( "WIN" ) ;
            break ;
          }
        }
      }
      else {
        if ( i % 2 == 0 ) {
          System . out . println ( "LOSE" ) ;
          break ;
        }
        else {
          System . out . println ( "WIN" ) ;
          break ;
        }
      }
    }
  }
  if ( ar . size ( ) == a ) {
    System . out . println ( "DRAW" ) ;
  }
}
