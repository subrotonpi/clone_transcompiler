public static int N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  /*if (score>N) return turn;*/
  if ( depth % 2 != 0 ) {
    if ( turn ) return game ( score * 2 , 0 , depth ) ;
    else return game ( score * 2 + 1 , 1 , depth ) ;
  }
  else return N ;
}
