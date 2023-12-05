def _import ( ) : return y , x
def gcd ( x , y ) : return y , x
def powermod ( x , exponent , m ) :
    prod = 1
    for i in range ( 63 , - 1 , - 1 ) :
        prod = ( prod * prod ) % m
        if exponent & 1 << i :
            prod = ( prod * x ) % m
    return prod
def f ( x , y , m ) :
    oy = y
    t = 0
    c = x
    s = 1
    while y > 0 :
        if y % 2 == 1 :
            t = ( t + s ) % m
            s = s * ( ( c + c * c ) % m ) % m
        else :
            s = s * ( 1 + c ) % m
            c = c * c % m
            y //= 2
    return t
def main ( ) :
    with open ( "/proc/" , "r" ) as f :
        a , b , m = f.read ( ).split ( " " )
        g = gcd ( a , b )
        t = f ( 10 , g , m )
        t = t * f ( powermod ( 10 , g , m ) , a // g , m ) % m
        t = t * f ( powermod ( 10 , g , m ) , b // g , m ) % m
        print ( t )
