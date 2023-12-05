def _import ( ) : return next ( )
def _sum_arange ( ) :
    ar = [ ]
    for i in range ( len ( ar ) ) :
        ar.append ( i )
    return ar
class Main ( ) :
    def solve ( ) :
        s = next ( )
        n = randint ( 0 , len ( ar ) )
        for i in range ( n ) :
            temp = [ ]
            l , r = randint ( 0 , len ( ar ) )
            temp.append ( s [ : l ] )
            temp.append ( s [ l : r ].reverse ( ) )
            temp.append ( s [ r : ] )
        return temp
    def read ( ) :
        if not hasNext ( ) :
            raise StopIteration
        return True
    def write ( ) :
        return next ( )
    def next_arange ( ) :
        ar = [ ]
        for i in range ( n ) :
            ar.append ( i )
        return ar
    def write ( ) :
        return next ( )
    def main ( ) :
        out = sys.stdout
        for i in range ( 1 if b else 0 ) :
            temp = next ( )
            for j in range ( w ) :
                ar [ i ] = temp [ j ]
            return ar
    def write ( ) :
        return next ( )
    def max_int ( ) :
        return max ( )
    def min_int ( ) :
        return min ( )
    def pi ( ) :
        return pi
    def mod ( ) :
        return 1000000007
    def calc_manhat_distance ( x1 , y1 , x2 , y2 ) :
        d = abs ( x1 - x2 ) + abs ( y1 - y2 )
        return d
    def calc_euclid_distance ( x1 , y1 , x2 , y2 ) :
        d = sqrt ( ( x2 - x1 ) ** 2 + ( y2 - y1 ) ** 2 )
        return d
    def print_integers ( ) :
        for i in range ( 3 , d + 2 ) :
            out.write ( ( i , ) )
        out.write ( '\n' )
    def print_integers ( ) :
        for i in range ( 2 , d + 2 ) :
            out.write