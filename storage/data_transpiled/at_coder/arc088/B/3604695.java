public static void input ( Scanner input ) {
  int l = input . nextInt ( ) ;
  if ( l % 2 == 0 ) {
    int count = 0 ;
    char s = S . charAt ( ( int ) l / 2 ) ;
    for ( int i = 0 ;
    i < Integer . SIZE ;
    i ++ ) {
      if ( S . charAt ( ( int ) l / 2 - 1 - i ) != s || S . charAt ( ( int ) l / 2 + 1 + i ) != s ) {
        break ;
      }
      count ++ ;
    }
    System . out . println ( ( int ) l / 2 + count ) ;
  }
  else {
    char s = S . charAt ( ( int ) l / 2 ) ;
    int count = 0 ;
    for ( int i = 0 ;
    i < Integer . SIZE ;
    i ++ ) {
      if ( S . charAt ( ( int ) l / 2 - 1 - i ) != s || S . charAt ( ( int ) l / 2 + 1 + i ) != s ) {
        break ;
      }
      count ++ ;
    }
    System . out . println ( ( int ) l / 2 + 1 + count ) ;
  }
}
