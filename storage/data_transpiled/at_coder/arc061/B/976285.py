def import java.util.regex
class Point ( object ) :
    def __init__ ( self , a , b ) :
        self.a , self.b = a , b
    def __hash__ ( self ) :
        return self.a ^ ( ( b << 16 ) | ( b >> 16 ) )
    def __eq__ ( self , other ) :
        point = self.a
        return self.a == point.a and self.b == point.b
    def __cmp__ ( self , p ) :
        if self.a != p.a :
            return self.a - p.a
        return self.b - p.b
class Main ( java.util.regex.Pattern ) :
    def __init__ ( self ) :
        Scanner ( )
        s = java.util.regex.Scanner ( file = self.f )
        h , w , n = s.span ( )
        map = { }
        for i in range ( n ) :
            a = s.span ( ) [ 0 ] - 1
            b = s.span ( ) [ 1 ] - 1
            for da in range ( max ( 0 , a - 2 ) , min ( h - 3 , a ) + 1 ) :
                for db in range ( max ( 0 , b - 2 ) , min ( w - 3 , b ) + 1 ) :
                    p = ( da , db )
                    if map.get ( p ) is None :
                        map [ p ] = 1
                    else :
                        map [ p ] = map.get ( p ) + 1
output = [ long ( h - 2 ) * long ( w - 2 ) ]
for value in map.values ( ) :
    output [ 0 ] -= 1
    output [ value ] += 1
for value in output :
    print ( value )
