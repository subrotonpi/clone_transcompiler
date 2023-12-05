input ;
int x = 0 , mx = 0 ;
for ( int w : input ) {
  x += w == 'I' ? 1 : - 1 ;
  mx = Math . max ( x , mx ) ;
}
