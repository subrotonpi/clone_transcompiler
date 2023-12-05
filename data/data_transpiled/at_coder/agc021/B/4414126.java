static final double pi = Math . atan ( 1 ) * 4 ;
/*if (a.equals(new Double(0)) || b.equals(new Double(0))) return (0);
if (a.equals(new Double(0))) return b;
if (b.equals(new Double(0))) return a;
if (a.x > b.x) a, b = b.x, a.y = a.y;
if (b.y < a.y) return b;
if (b.x < a.y && b.y >= a.y) return (b.x, a.y);
if (b.x >= a.y && b.y < a.x+1) return (0);
if (b.y >= a.x && b.y < a.y+1) return (a.x, b.y - 1);
if (b.y >= a.x && b.y > a.y+1) return a;*/
/* calc range of P and Q */
double c = calc ( P , Q ) ;
if ( c > 0 ) return ( c < 0 ) ? 0 : ( c + 0.5 ) ;
else return ( c + 1 ) ;
/* calc range of Q */
double x = P . x - Q . x ;
double y = P . y - Q . y ;
if ( x == 0 ) return y > 0 ? 0.25 : - 0.25 ;
double t = Math . atan ( y / x ) ;
return x > 0 ? t / ( 2 * pi ) : ( t / ( 2 * pi ) % 1 ) - 0.5 ;
}
