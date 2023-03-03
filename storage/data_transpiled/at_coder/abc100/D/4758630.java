public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] info = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    info [ i ] [ 0 ] = 0 ;
  }
  int ans = 0 ;
  for ( int oishi = 0 ;
  oishi < 2 ;
  oishi ++ ) {
    for ( int kirei = 0 ;
    kirei < 2 ;
    kirei ++ ) {
      for ( int ninki = 0 ;
      ninki < 2 ;
      ninki ++ ) {
        for ( int j = 0 ;
        j < n ;
        j ++ ) {
          info [ j ] [ 0 ] = ( ( - 1 ) * kirei ) * info [ j ] [ 1 ] + ( ( - 1 ) * oishi ) * info [ j ] [ 2 ] + ( ( - 1 ) * ninki ) * info [ j ] [ 3 ] ;
        }
        Arrays . sort ( info ) ;
        int ankirei = 0 ;
        int anoishi = 0 ;
        int anninki = 0 ;
        for ( int j = 0 ;
        j < m ;
        j ++ ) {
          ankirei += ( ( - 1 ) * kirei ) * info [ j ] [ 1 ] ;
          anoishi += ( ( - 1 ) * oishi ) * info [ j ] [ 2 ] ;
          anninki += ( ( - 1 ) * ninki ) * info [ j ] [ 3 ] ;
        }
        ans = Math . max ( ans , ankirei + anoishi + anninki ) ;
      }
    }
  }
  System . out . println ( ans ) ;
}
