def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
        d = [ self.n ]
        for i in range ( self.k ) :
            d.append ( self.n )
    while True :
        flag = True
        n_str = str ( n )
        amt = [ int ( c ) for c in n_str.split ( ',' ) ]
        for c in amt :
            if c in d :
                flag = False
                break
        if flag :
            print ( n )
            break
        n += 1
