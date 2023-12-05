@ VisibleForTesting static Iterable < String > combinations ( ) {
  final ImmutableList . Builder < String > builder = ImmutableList . builder ( ) ;
  final ImmutableList . Builder < String > builder = ImmutableList . builder ( ) ;
  builder . addAll ( builder . build ( ) ) ;
  final ImmutableMap < String , ImmutableList < String >> interpretSlash = new ImmutableMap . Builder < > ( ) ;
  builder . addAll ( builder . build ( ) ) ;
  final ImmutableMap < String , ImmutableList < String >> interpretBeamer = new ImmutableMap . Builder < > ( ) ;
  interpretSlash . put ( "/" , new ImmutableMap . Builder < > ( ) . add ( new String ( 0 , 1 ) ) . add ( new String ( - 1 , 0 ) ) . add ( new String ( 1 , 0 ) ) . add ( new String ( - 1 , 0 ) ) . add ( new String ( 0 , 1 ) ) . add ( new String ( 0 , - 1 ) ) . add ( new String ( 1 , 0 ) ) . build ( ) ) ;
  final ImmutableMap < String , ImmutableList < String >> interpretBeamer = new ImmutableMap . Builder < > ( ) ;
  interpretBeamer . put ( 1 , new ImmutableList < > ( ) ) ;
  interpretBeamer . put ( 0 , new ImmutableList < > ( ) ) ;
  interpretBeamer . put ( 1 , new ImmutableList < > ( ) ) ;
  interpretBeamer . put ( 0 , new ImmutableList < > ( ) ) ;
  interpretBeamer . put ( 1 , new ImmutableList < > ( ) ) ;
  interpretBeamer . put ( 1 , new ImmutableList < > ( ) ) ;
  interpretBeamer . put ( 0 , new ImmutableList < > ( ) ) ;
  interpretBeamer . put ( - 1 , new ImmutableList < > ( ) ) ;
  final ImmutableMap < String , String > representBeamer = new ImmutableMap . Builder < > ( ) . add ( "|" ) . add ( "-" ) . build ( ) ;
  final int T = Integer . parseInt ( input ( ) . trim ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    System . out . print ( "Case #" + ( t + 1 ) + ": " ) ;
    final int height = Integer . parseInt ( input ( ) . trim ( ) ) ;
    final int width = Integer . parseInt ( input ( ) ) ;
    final List < String > field = builder . build (