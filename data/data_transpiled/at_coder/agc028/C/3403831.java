public static int min ( int N ) {
  int [ ] [ ] src = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    src [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int suma = 0 ;
  int sumb = 0 ;
  List < Integer > elems = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int a = src [ i ] [ 0 ] ;
    final int b = src [ i ] [ 1 ] ;
    suma += a ;
    sumb += b ;
    elems . add ( new Integer ( a ) ) ;
    elems . add ( new Integer ( b ) ) ;
  }
  int ans = Math . min ( suma , sumb ) ;
  Collections . sort ( elems ) ;
  int sumw = 0 ;
  int [ ] used = new int [ N ] ;
  boolean dup = false ;
  for ( int w = 0 ;
  w < N ;
  w ++ ) {
    int i = elems . get ( w ) ;
    sumw += w ;
    used [ i ] ++ ;
    if ( used [ i ] > 1 ) dup = true ;
  }
  if ( dup ) {
    ans = Math . min ( ans , sumw ) ;
    System . out . println ( ans ) ;
    exit ( ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int a = src [ i ] [ 0 ] ;
    final int b = src [ i ] [ 1 ] ;
    int neww = i != elems . get ( N + 1 ) [ 0 ] ? elems . get ( N + 1 ) [ 0 ] : elems . get ( N + 1 ) [ 0 ] ;
    int tmp = sumw - a + neww ;
    ans = Math . min ( ans , tmp ) ;
  }
  return ans ;
}
