def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.count = 0
    def __call__ ( self , * args ) :
        sc = _main.raw_input ( )
        n = sc.count
        arr = [ Magic ( sc.read ( ) , sc.read ( ) ) for i in range ( n ) ]
        arr = sorted ( arr , key = lambda m1 : m1.a , reverse = True )
        tmp = 0
        max = 0
        for m in arr :
            tmp += m.a
            if max < tmp :
                max = tmp
            tmp -= m.b
        print ( max )
    def magic ( a , b ) :
        self.a = a
        self.b = b
