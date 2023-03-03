static final String getLargeCase ( ) throws IOException {
  File file = new File ( "B-large.in" ) ;
  BufferedReader br = new BufferedReader ( new FileReader ( file ) ) ;
  BufferedWriter out = new BufferedWriter ( new FileWriter ( "output.txt" ) ) ;
  int Cases = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int T = 0 ;
  T < Cases ;
  T ++ ) {
    Arrays . fill ( Ac , Integer . valueOf ( T + 1 ) ) ;
    Arrays . fill ( Aj , Integer . valueOf ( T + 1 ) ) ;
    out . write ( ret + "\n" ) ;
  }
  br . close ( ) ;
  int Ca [ ] [ ] = new int [ Ac ] [ ] ;
  for ( int j = 0 ;
  j < Aj ;
  j ++ ) {
    Arrays . fill ( Aj , Integer . valueOf ( j + 1 ) ) ;
  }
  int Ja [ ] [ ] = new int [ Aj ] [ ] ;
  for ( int j = 0 ;
  j < Aj ;
  j ++ ) {
    Arrays . fill ( Aj , Integer . valueOf ( j + 1 ) ) ;
  }
  Arrays . sort ( Ca ) ;
  Arrays . sort ( Ja ) ;
  int forcedTime [ ] = {
    0 , 0 }
    ;
    int vartime = 0 ;
    int betw [ ] [ ] = new int [ 2 ] [ ] ;
    int swaps = 0 ;
    forcedTime [ A [ 0 ] [ 2 ] ] += A [ 0 ] [ 1 ] - A [ 0 ] [ 0 ] ;
    if ( A [ 0 ] [ 2 ] != A [ A . length - 1 ] [ 2 ] ) {
      vartime += A [ 0 ] [ 0 ] - A [ A . length - 1 ] [ 1 ] + 1440 ;
      swaps ++ ;
    }
    else {
      betw [ A [ 0 ] [ 2 ] ] += A [ 0 ] [ 0 ] - A [ A . length - 1 ] [ 1 ] + 1440 ;
    }
    for ( int i = 1 ;
    i < A . length ;
    i ++ ) {
      forcedTime [ A [ i ] [ 2 ] ] += A [ i ] [ 1 ] - A [ i ] [ 0 ] ;
      if ( A [ i ] [ 2 ] != A [ i - 1 ] [ 2 ] ) {
        vartime += A [ i ] [ 0 ] - A [ i - 1 ] [ 1 ] ;
        swaps ++ ;
      }
      else {
        bet @ @