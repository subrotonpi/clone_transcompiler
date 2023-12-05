def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.count = 0
    def __call__ ( self , * args ) :
        sc = _main.raw_input ( )
        arr = sc.split ( )
        a1 = - 1
        a2 = - 1
        for c in arr :
            if c in ( '0' , '9' ) :
                if a1 == - 1 :
                    a1 = c - '0'
                else :
                    a2 = c - '0'
        if a2 == - 1 :
            ans = a1
        else :
            ans = a1 * 10 + a2
        print ( ans )
