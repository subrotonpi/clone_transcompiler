def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.__doc__ = __doc__
        self.I , self.J , self.K = 2 , 3 , 4
    def table ( self ) :
        with open ( 'test.txt' , 'r' ) as f :
            targets = [ self.I , self.J , self.K ]
            ts = len ( f.readlines ( ) )
            for ti in range ( 1 , ts + 1 ) :
                lines = f.readlines ( )
                reps = len ( lines )
                line = lines [ ti ]
                ans = possible ( parse ( line ) , reps , targets )
                print ( 'Case #%d: %s\n' % ( ti , ans and 'YES' or 'NO' ) )
    def parse ( line ) :
        res = [ ]
        for i in range ( len ( line ) ) :
            res.append ( line [ i ] - 'i' + I )
        return res
    def possible ( line , reps , targets ) :
        i = 0
        t = targets [ 0 ]
        x = 1
        for r in range ( int ( min ( reps , 4 * 3 ) ) ) :
            for q in line :
                x = mult ( x , q )
                if x == t :
                    i += 1
                    t = mult ( t , targets [ i ] )
                    if i == len ( targets ) - 1 :
                        return exp ( prod ( line ) , reps ) == t
        return False
    def prod ( line ) :
        p = 1
        for x in line :
            p = mult ( p , x )
        return p
    def exp ( x , n ) :
        p = 1
        for i in range ( n % 4 ) :
            p = mult ( p , x )
        return p
return Main
