def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( _main.__doc__ )
        self.all = _main.__doc__
    def __init__ ( self ) :
        self.all = _main.__doc__
        self.past , self.crr = _main.__doc__.split ( ' ' )
        self.default = 0
        cost = 0
        min_cost = 0
        crr = str ( self.all [ 0 ] )
        for past , crr in zip ( self.past , self.crr ) :
            if past == 'W' :
                cost += 1
            if crr == 'E' :
                cost -= 1
                self.default += 1
            if cost < min_cost :
                min_cost = cost
        print ( self.default , min_cost )
