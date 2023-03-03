static final int N = Integer . parseInt ( input ) ;
int mai = 0 , mad = 0 ;
for ( int i = 2 ;
i <= N ;
i ++ ) {
  System . out . println ( "? " + 1 + " " + i ) ;
  System . out . flush ( ) ;
  int d = Integer . parseInt ( input ) ;
  if ( d > mad ) {
    mad = d ;
    mai = i ;
  }
}
int D = 0 ;
return D ;
}
