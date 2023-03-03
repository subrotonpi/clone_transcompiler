static final boolean ugly ( int num ) {
  boolean ugly = num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 ? true : false ;
  int result ;
  int totallen = 0 ;
  if ( rest . length ( ) == 0 && str . length ( ) == 0 ) {
    return ugly ? 1 : 0 ;
  }
  if ( mem . containsKey ( val ) && mem . containsKey ( val ) && mem . get ( val ) . containsKey ( str ) && mem . get ( val ) . get ( str ) . containsKey ( rest ) ) {
    return mem . get ( val ) . get ( str ) . get ( rest ) ;
  }
  count = 0 ;
  if ( str . length ( ) > 0 ) {
    int digits = Integer . parseInt ( str ) ;
    count += solve ( val + digits , "" , rest ) ;
    if ( totallen > rest . length ( ) + str . length ( ) ) count += solve ( val - digits , "" , rest ) ;
  }
  if ( rest . length ( ) > 0 ) count += solve ( val , str + rest . substring ( 0 , 1 ) , rest . substring ( 1 ) ) ;
  if ( mem . containsKey ( val ) ) mem . put ( val , new HashMap < Integer , Integer > ( ) ) ;
  if ( mem . containsKey ( str ) ) mem . put ( str , new HashMap < Integer , Integer > ( ) ) ;
  mem . get ( val ) . put ( str , new HashMap < Integer , Integer > ( ) ) ;
  mem . get ( str ) . put ( rest , count ) ;
  return true ;
}
