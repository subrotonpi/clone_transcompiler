@ VisibleForTesting static int from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  String NAME = input ;
  String KIT = input ;
  Map < String , Integer > name = new HashMap < > ( ) ;
  name . put ( NAME , N ) ;
  Map < String , Integer > kit = new HashMap < > ( ) ;
  kit . put ( KIT , N ) ;
  if ( name . keySet ( ) . size ( ) - kit . keySet ( ) . size ( ) == 0 ) {
    System . out . println ( Math . max ( - ( - 1 / kit . get ( k ) ) , 0 ) ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return 1 ;
}
