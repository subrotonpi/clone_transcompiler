X = input ;
int t = 0 ;
int s = 0 ;
for ( int i = 0 ;
i < X . length ;
i ++ ) {
  if ( X [ i ] == 'T' ) {
    if ( s > 0 ) s -- ;
    else t ++ ;
  }
  if ( X [ i ] == 'S' ) s ++ ;
}
System . out . println ( s + t ) ;
}
