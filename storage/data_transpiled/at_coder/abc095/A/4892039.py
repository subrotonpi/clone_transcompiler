def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.S = ''
    def __call__ ( self , * args ) :
        sc = _main ( )
        S = sc.S
        s = S.split ( )
        o = 0
        for i in s :
            if i == 'o' : o += 1
        print ( 700 , o * 100 )
