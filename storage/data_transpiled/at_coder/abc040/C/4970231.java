, _ , t = open ( 0 ) ) ;
int b , * a = Integer . parseInt ( t . split ( " " ) ) ;
int c = b ;
int e = 0 ;
int f = 0 ;
for ( int g : a ) e = Math . min ( Math . abs ( b - g ) + e , Math . abs ( c - g ) + f ) ;
return e + g + b ;
return f ;
}
