def import _Point
class Point ( object ) :
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
    def __hash__ ( self ) :
        return self.a ^ self.b
    def __eq__ ( self , other ) :
        point = self.a == point.a and self.b == point.b
        return self.a == point.a and self.b == point.b
    def __cmp__ ( self , p ) :
        if self.a != p.a :
            return self.a - p.a
        return self.b - p.b
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        s = _Point ( )
        h , w , n = s.scan ( )
        d = defaultdict ( int )
        for i in range ( n ) :
            a = s.__next__ ( ) - 1
            b = s.__next__ ( ) - 1
            for da in range ( max ( 0 , a - 2 ) , min ( h - 3 , a ) + 1 ) :
                for db in range ( max ( 0 , b - 2 ) , min ( w - 3 , b ) + 1 ) :
                    p = ( da , db )
                    if d [ p ] is None :
                        d [ p ] += 1
                    else :
                        d [ p ] = d [ p ] + 1
output = [ 0 ] * 10
output [ 0 ] = long ( h - 2 ) * long ( w - 2 )
for value in sorted ( d.values ( ) ) :
    output [ 0 ] -= 1
    output [ value ] += 1
for value in output :
    print ( value )
