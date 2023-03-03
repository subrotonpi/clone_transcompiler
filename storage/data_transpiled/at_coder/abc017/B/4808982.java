public static boolean judgeChoku ( String str ) {
  boolean isChoku = true ;
  while ( isChoku ) {
    if ( ( str == null ) || ( str . length ( ) == 0 ) ) {
      break ;
    }
    else if ( ( str . charAt ( 0 ) == 'o' ) || ( str . charAt ( 0 ) == 'k' ) || ( str . charAt ( 0 ) == 'u' ) ) {
      str = str . substring ( 1 ) ;
      judgeChoku ( str ) ;
    }
    else if ( str . length ( ) > 2 ) {
      isChoku = false ;
    }
  }
  return isChoku ;
}
