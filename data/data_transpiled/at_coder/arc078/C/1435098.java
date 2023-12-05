static final String print ( char c ) {
  String ans = null ;
  for ( int idx = 0 ;
  idx <= 11 ;
  idx += 1 ) {
    System . out . println ( "? 1" + "0" * idx ) ;
    System . out . flush ( ) ;
    char kekka = input ( ) ;
    if ( kekka == 'N' ) {
      digits = idx ;
      break ;
    }
  }
  else {
    for ( int idx = 1 ;
    idx <= 11 ;
    idx += 1 ) {
      System . out . println ( "? " + "9" * idx ) ;
      System . out . flush ( ) ;
      kekka = input ( ) ;
      if ( kekka == 'Y' ) {
        c = idx - 1 ;
        break ;
      }
    }
    ans = "! 1" + "0" * c ;
  }
  if ( ans == null ) {
    int kagen = 10 * ( digits - 1 ) ;
    int jogen = 10 * ( digits ) - 1 ;
    while ( jogen - kagen > 1 ) {
      int miru = ( jogen + kagen ) / 2 ;
      System . out . println ( "? " + miru + '0' ) ;
      System . out . flush ( ) ;
      kekka = input ( ) ;
      if ( kekka == 'Y' ) {
        jogen = miru ;
      }
      else {
        kagen = miru ;
      }
    }
    ans = "! " + jogen ;
  }
  return ans ;
}
