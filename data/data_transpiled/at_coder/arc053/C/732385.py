def import _main
class Main ( object ) :
    class Magic ( object ) :
        def __init__ ( self , a , b ) :
            self.a , self.b = a , b
    def main ( ) :
        sc = _main ( )
        N = sc.count ( )
        asc = [ ]
        desc = [ ]
        for i in range ( N ) :
            a = sc.read ( )
            b = sc.read ( )
            if a > b :
                asc.append ( ( a , b ) )
            else :
                desc.append ( ( a , b ) )
        desc.sort ( key = lambda m1 : m1.a - m2.a )
        asc.sort ( key = lambda m2 : - ( m1.b - m2.b ) )
        temp = max = 0
        for m in desc :
            temp += m.a
            max = max ( max , temp )
            temp -= m.b
        for m in asc :
            temp += m.a
            max = max ( max , temp )
            temp -= m.b
        print ( max )
        sc.close ( )
