def import java.util.regex
class Point ( object ) :
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
    def __hash__ ( self ) :
        return ( ( self.a & 0xffffffff ) | ( self.b >> 16 ) ) ^ ( ( self.b & 0xffffffff ) | ( self.a >> 16 ) )
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
        s = java.util.regex.Scanner ( file = "/usr/bin/java" )
        h , w , n = s.scan ( )
        d = { }
        for i in range ( n ) :
            a = s.randint ( - 1 , 1 )
            b = s.randint ( - 1 , 1 )
            for da in range ( max ( 0 , a - 2 ) , min ( h - 3 , a ) + 1 ) :
                for db in range ( max ( 0 , b - 2 ) , min ( w - 3 , b ) + 1 ) :
                    p = ( da , db )
                    if d [ p ] is None :
                        d [ p ] = 1
                    else :
                        d [ p ] = d [ p ] + 1
output = [ long ( h - 2 ) * long ( w - 2 ) ]
for value in d.values ( ) :
    output [ 0 ] -= 1
    output [ value ] += 1
for value in output :
    print ( value )
