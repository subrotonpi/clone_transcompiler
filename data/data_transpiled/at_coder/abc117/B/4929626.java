public static int N = Integer . parseInt ( input ) {
  List < Integer > Ln = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Ln . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  Collections . sort ( Ln , Collections . reverseOrder ( ) ) ;
  int max = Ln . get ( 0 ) ;
  int sum = sum ( Ln ) ;
  if ( max < sum - max ) System . out . println ( "Yes" ) ;
  else System . out . println ( "No" ) ;
  return sum ;
}
