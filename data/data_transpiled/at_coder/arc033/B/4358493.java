{
  NA = true ;
  NB = false ;
}
List < Integer > AList = Collections . singletonList ( NA ) ;
List < Integer > BList = Collections . singletonList ( NB ) ;
List < Integer > AB = AList . stream ( ) . map ( Integer :: parseInt ) . collect ( toList ( ) ) ;
Collections . sort ( AB ) ;
int counter = 0 ;
int N = AB . size ( ) ;
int Ntmp = N ;
int i = 0 ;
while ( i < N - 1 ) {
  if ( AB . get ( i ) == AB . get ( i + 1 ) ) {
    counter ++ ;
    Ntmp -- ;
    i ++ ;
  }
  i ++ ;
}
System . out . println ( counter / Ntmp ) ;
}
