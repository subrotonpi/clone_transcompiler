def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.a = [ ]
        self.MAX = 100000
    def __call__ ( self ) :
        sc = _main.get ( )
        self.n = sc.n
        self.a = [ ]
        for i in range ( self.n ) :
            self.a.append ( sc.randint ( 0 , 1 ) )
        count = [ 0 ] * ( MAX + 1 + 1 )
        for v in range ( self.a [ v ] + 1 ) :
            count [ v ] += 1
            count [ v + 1 ] += 1
            count [ v - 1 ] += 1
        self.max = max
        for v in count :
            self.max = max
        print ( self.max )
