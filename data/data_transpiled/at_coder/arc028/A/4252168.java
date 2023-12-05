public static int N , A , B ;
do {
  N -= A ;
}
while ( N <= 0 ) ;
A = A ;
B = B ;
do {
  N -= A ;
}
while ( N <= 0 ) ;
if ( N <= 0 ) {
  System . out . println ( "Ant" ) ;
  break ;
}
N -= B ;
if ( N <= 0 ) {
  System . out . println ( "Bug" ) ;
  break ;
}
return N ;
}
