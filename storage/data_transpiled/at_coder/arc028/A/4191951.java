public static int N , A , B = map ( Integer . parseInt , input ) {
  boolean turn = true ;
  while ( N > 0 ) {
    if ( turn ) N -= A ;
    else N -= B ;
    turn = ! turn ;
  }
  System . out . println ( turn ? "Bug" : "Ant" ) ;
}
