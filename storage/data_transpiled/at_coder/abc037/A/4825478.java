public static int A , int B , int C ;
int D = A ;
int count = 0 ;
if ( B < A ) {
  A = B ;
  B = D ;
}
do {
  if ( C >= A ) {
    C = C - A ;
    count ++ ;
  }
  else break ;
}
while ( true ) ;
return count ;
}
