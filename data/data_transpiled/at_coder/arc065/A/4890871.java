public static String S = input ( ) {
  while ( true ) {
    if ( S . isEmpty ( ) ) {
      System . out . println ( "YES" ) ;
      break ;
    }
    else {
      boolean a = S . contains ( S . substring ( S . length ( ) - 5 ) ) || S . contains ( "dream" ) || S . contains ( "erase" ) ;
      boolean b = S . contains ( S . substring ( S . length ( ) - 6 ) ) || S . contains ( "eraser" ) ;
      boolean c = S . contains ( S . substring ( S . length ( ) - 7 ) ) || S . contains ( "dreamer" ) ;
      if ( ! ( a || b || c ) ) {
        System . out . println ( "NO" ) ;
        break ;
      }
      else if ( a ) S = S . substring ( 0 , S . length ( ) - 5 ) ;
      else if ( b ) S = S . substring ( 0 , S . length ( ) - 6 ) ;
      else if ( c ) S = S . substring ( 0 , S . length ( ) - 7 ) ;
    }
  }
}
