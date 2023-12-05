public static int N ( int N , int A , int B ) {
  int newN = N - N / ( A + B ) * ( A + B ) ;
  if ( newN == 0 ) System . out . println ( "Bug" ) ;
  else return newN ;
}
