def _import ( ) : return _import ( )
class Main ( object ) :
    def solve ( self ) :
        n = randint ( 0 , 32 )
        d = { }
        sum = 0
        for i in range ( n ) :
            a = next ( self )
            b = randint ( 0 , 32 )
            sum += b
            d [ a ] = d.get ( a , 0 ) + b
        sum = sum % 2 == 0
        temp = 'atcoder'
        for k , v in d.items ( ) :
            if v >= sum :
                ans = k
                break
        out.write ( ans )
    def main ( self ) :
        out = sys.stdout
        with out.open ( 'w' , 'a' ) as f :
            self.solve ( )
            out.flush ( )
    def max_int , min_int = int ( max ) , min
    mod = 1000000007
    def calc_manhat_distance ( x1 , y1 , x2 , y2 ) :
        d = abs ( x1 - x2 ) + abs ( y1 - y2 )
        return d
    def calc_euclid_distance ( x1 , y1 , x2 , y2 ) :
        d = math.sqrt ( ( x2 - x1 ) ** 2 + ( y2 - y1 ) ** 2 )
        return d
    def print_charss ( self ) :
        for i in range ( len ( self ) ) :
            for j in range ( len ( self [ 0 ] ) ) :
                out.write ( self [ i ] [ j ] )
            out.write ( '\n' )
f = sys.stdin
buffer = open ( 'r' , 'rb' )
length , p = 0 , 0
def has_next_byte ( self ) :
    if p < length :
        return True
    else :
        while self.has_next_byte ( ) and not self.is_next_byte ( ) :
            p += 1
        return False
