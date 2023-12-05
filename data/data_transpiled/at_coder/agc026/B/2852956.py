def _import ( ) :
    from time import sleep
    from time import sleep
    sleep ( 1 )
    t = sleep ( 1 )
    while t :
        a , b , c , d = sleep ( t )
        print ( 'Yes' if eval ( a , b , c , d ) else 'No' )
    def eval ( a , b , c , d ) :
        if b > a or b > d : return False
        if c >= b : return True
        if b - gcd ( b , d ) + ( a % gcd ( b , d ) ) > c : return False
        else : return True
    def gcd ( a , b ) :
        if a % b == 0 : return b
        return gcd ( b , a % b )
    def main ( ) :
        return ''
