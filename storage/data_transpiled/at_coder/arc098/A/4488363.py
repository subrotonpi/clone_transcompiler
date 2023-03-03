def _import ( ) :
    import sys
    import string
    import string
    import string
    import random
    import string
    import random
    import string
    class Main ( object ) :
        ZERO = "0"
        def __init__ ( self , * args , ** kwargs ) :
            self.N = args [ 0 ]
            self.S = args [ 1 ]
        def process ( self ) :
            import random
            if self.N <= 0 :
                return self.ZERO
            else :
                directions = [ s for s in self.S.split ( "" ) if s.lower ( ) == "W" ]
                min = random.randint ( 1 , N )
                change = min
                for prev , curr in zip ( directions [ 1 : ] , directions [ 0 : N ] ) :
                    if prev == "W" :
                        change += 1
                    if curr == "E" :
                        change -= 1
                    min = min ( min , change )
                return str ( min )
    case = _read_from_input ( )
    result = process ( case )
    output ( result )
    def _read_from_input ( ) :
        sc = string.split ( " " )
        N = sc.N
        S = sc.S
        return { "N" : N , "S" : S }
    def output ( result ) :
        print ( result )
    class Main ( object ) :
        def __init__ ( self , N , S ) :
            self.N = N
            self.S = S
    return Main
