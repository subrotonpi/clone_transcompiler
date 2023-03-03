public static String solve ( File fin ) throws IOException {
  File fout = new File ( "testa.in" ) ;
  PrintWriter pw = new PrintWriter ( fout ) ;
  {
    int r = Integer . parseInt ( fin . readLine ( ) . replaceAll ( " " , "" ) ) ;
    int c = Integer . parseInt ( fin . readLine ( ) . replaceAll ( " " , "" ) ) ;
    char [ ] [ ] a = new char [ r ] [ c ] ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      a [ i ] = new char [ c ] ;
    }
    int lstok = - 1 ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      int st = c , fn = - 1 ;
      for ( int j = 0 ;
      j < c ;
      j ++ ) {
        if ( a [ i ] [ j ] != '?' ) {
          st = Math . min ( st , j ) ;
          fn = j ;
        }
      }
      if ( fn != - 1 ) {
        for ( int j = 0 ;
        j < st ;
        j ++ ) {
          a [ i ] [ j ] = a [ i ] [ st ] ;
        }
        int lst = st ;
        for ( int j = st ;
        j < c ;
        j ++ ) {
          if ( a [ i ] [ j ] != '?' ) {
            lst = j ;
          }
          else {
            a [ i ] [ j ] = a [ i ] [ lst ] ;
          }
        }
        for ( int ii = lstok + 1 ;
        ii < i ;
        ii ++ ) {
          a [ ii ] = a [ i ] ;
        }
        lstok = i ;
      }
    }
    for ( int i = lstok + 1 ;
    i < r ;
    i ++ ) {
      a [ i ] = a [ lstok ] ;
    }
    String ans = "" ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      ans += new String ( a [ i ] ) + '\n' ;
    }
    return ans ;
  }
}
