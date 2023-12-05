def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.M = int ( self.M )
    def map ( lhs , rhs ) :
        return sorted ( ( lhs.Year - rhs.Year , lhs.Prefecture , rhs.Year ) )
    prefecture_to_count = { }
    num_to_format = defaultdict ( list )
    for _ , triple in map ( lambda x : x.Prefecture , range ( M ) ) :
        count = prefecture_to_count.compute ( triple.Prefecture , lambda k , v : v or 1 )
        format = leftpad ( triple.Prefecture ) + leftpad ( count )
        num_to_format [ triple.num ].append ( format )
    for _ , format in num_to_format.items ( ) :
        print ( format )
    def leftpad ( v ) :
        s = [ ]
        while v != 0 :
            s.append ( v % 10 )
            v /= 10
        while len ( s ) < 6 :
            s.append ( '0' )
        return s.reverse ( )
    class Triple ( object ) :
        def __init__ ( self , num , prefecture , y ) :
            self.num = num
            self.Prefecture = prefecture
            self.Year = y
