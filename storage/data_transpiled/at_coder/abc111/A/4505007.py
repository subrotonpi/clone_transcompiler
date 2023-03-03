def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.ans , self.N = 0 , 0
    def __call__ ( self ) :
        sc = _main.raw_input ( )
        s = sc.strip ( )
        S = s.split ( '' )
        s = ''
        for i in S :
            s += 10 - int ( i )
        print ( s )
