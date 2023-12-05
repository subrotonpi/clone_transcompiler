public static int N = Integer . parseInt ( input ) {
  String S = input . nextLine ( ) ;
  String slot = "" ;
  for ( int idx = 0 ;
  idx < S . length ( ) ;
  idx += 1 ) {
    switch ( slot . length ( ) ) {
      case 0 : slot = S . substring ( idx ) ;
      break ;
      case 1 : slot = slot + S . charAt ( idx ) ;
      if ( slot . charAt ( 0 ) == slot . charAt ( 1 ) ) {
        slot = "" ;
      }
      break ;
      default : if ( S . charAt ( idx ) == slot . charAt ( 0 ) ) {
        slot = slot . substring ( 1 , slot . length ( ) ) ;
      }
      else if ( S . charAt ( idx ) == slot . charAt ( slot . length ( ) - 1 ) ) {
        slot = slot + S . charAt ( idx ) ;
      }
      else {
        slot = S . charAt ( idx ) + slot ;
      }
    }
  }
  System . out . println ( slot . length ( ) ) ;
  return slot . length ( ) ;
}
