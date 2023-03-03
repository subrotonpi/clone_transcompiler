@ VisibleForTesting static void from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < String > As = map ( input , N ) ;
  Map < String , Integer > counts = new HashMap < > ( ) ;
  for ( String a : As ) counts . put ( a , 1 ) ;
  int total = 0 ;
  for ( Map . Entry < String , Integer > entry : counts . entrySet ( ) ) {
    if ( entry . getKey ( ) < entry . getKey ( ) ) total += entry . getValue ( ) - entry . getKey ( ) ;
    else if ( entry . getKey ( ) > entry . getKey ( ) ) total += entry . getValue ( ) ;
  }
  System . out . println ( total ) ;
}
