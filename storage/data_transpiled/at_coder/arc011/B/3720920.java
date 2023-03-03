public static String [ ] getStrings ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] w = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    w [ i ] = input . nextLine ( ) . toLowerCase ( ) ;
  }
  List < String > boin = Arrays . asList ( "a" , "i" , "o" , "e" , "u" ) ;
  List < String > ans = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String bf = "" ;
    w [ i ] = w [ i ] . toLowerCase ( ) ;
    String [ ] wi = Lists . newArrayList ( w [ i ] ) ;
    for ( int k = 0 ;
    k < wi . length ;
    k ++ ) {
      if ( boin . contains ( wi [ k ] ) ) {
        continue ;
      }
      else {
        switch ( wi [ k ] ) {
          case "b" : case "c" : bf += "1" ;
          break ;
          case "d" : case "w" : bf += "2" ;
          break ;
          case "t" : case "j" : bf += "3" ;
          break ;
          case "f" : case "q" : bf += "4" ;
          break ;
          case "l" : case "v" : bf += "5" ;
          break ;
          case "s" : case "x" : bf += "6" ;
          break ;
          case "p" : case "m" : bf += "7" ;
          break ;
          case "h" : case "k" : bf += "8" ;
          break ;
          case "n" : case "g" : bf += "9" ;
          break ;
          case "z" : case "r" : bf += "0" ;
          break ;
        }
      }
    }
    if ( bf . length ( ) != 0 ) {
      ans . add ( bf ) ;
    }
  }
  for ( int i = 0 ;
  i < ans . size ( ) ;
  i ++ ) {
    if ( i != ans . size ( ) - 1 ) {
      System . out . print ( ans . get ( i ) + " " ) ;
    }
    else {
      System . out . print ( ans . get ( i ) + "" ) ;
    }
  }
  System . out . println ( "" ) ;
  return ans . toArray ( new String [ ans . size ( ) ] ) ;
}
