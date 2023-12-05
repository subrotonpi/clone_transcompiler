def import import _max
class Main ( object ) :
    def __init__ ( self , a , b , c ) :
        s = _sys.stdin.read ( )
        a = s.randint ( 0 , 10 )
        b = s.randint ( 0 , 10 )
        c = s.randint ( 0 , 10 )
        ans = max ( max ( a * 10 + b + c , b * 10 + a + c ) , c * 10 + a + b )
        print ( ans )
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
        self.c = c
