public static String [ ] [ ] getWords ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > L = new LinkedList < String > ( ) ;
  List < String > K = new ArrayList < String > ( ) ;
  List < String > wordlist = new ArrayList < String > ( ) ;
  wordlist . add ( Arrays . asList ( "z" , "r" ) ) ;
  wordlist . add ( Arrays . asList ( "b" , "c" ) ) ;
  wordlist . add ( Arrays . asList ( "d" , "w" ) ) ;
  wordlist . add ( Arrays . asList ( "t" , "j" ) ) ;
  wordlist . add ( Arrays . asList ( "f" , "q" ) ) ;
  wordlist . add ( Arrays . asList ( "l" , "v" ) ) ;
  wordlist . add ( Arrays . asList ( "s" , "x" ) ) ;
  wordlist . add ( Arrays . asList ( "p" , "m" ) ) ;
  wordlist . add ( Arrays . asList ( "h" , "k" ) ) ;
  wordlist . add ( Arrays . asList ( "n" , "g" ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String cur = "" ;
    L . set ( i , L . get ( i ) . toLowerCase ( ) ) ;
    for ( int j = 0 ;
    j < L . get ( i ) . length ( ) ;
    j ++ ) {
      for ( int k = 0 ;
      k < 10 ;
      k ++ ) {
        if ( wordlist . get ( k ) . contains ( L . get ( i ) [ j ] ) ) {
          cur += Integer . toString ( k ) ;
          break ;
        }
      }
    }
    if ( cur . length ( ) != 0 ) {
      K . add ( cur ) ;
    }
  }
  String ans = "" ;
  if ( K . size ( ) != 0 ) {
    for ( int i = 0 ;
    i < K . size ( ) - 1 ;
    i ++ ) {
      ans += K . get ( i ) + " " ;
    }
    ans += K . get ( K . size ( ) - 1 ) ;
    System . out . println ( ans ) ;
  }
  else {
    System . out . println ( ) ;
  }
  return K . toArray ( new String [ K . size ( ) ] [ ] ) ;
}
