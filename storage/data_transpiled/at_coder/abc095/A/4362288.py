def main ( ) :
    import os
    from numpy.linalg import solve
    from numpy.random import choice
    class A ( object ) :
        def __init__ ( self ) :
            self.solveA ( )
        def solveA ( self ) :
            with open ( self.topping , 'r' ) as f :
                topping = f.read ( )
            res = 700
            for char in topping :
                if char == 'o' :
                    res += 100
                elif char == 'x' :
                    break
            print ( res )
    def solveB ( self ) :
        with open ( self.topping , 'r' ) as f :
            num_n = f.read ( )
            num_x = f.read ( )
            wk = [ ]
            res = 0
            for i in range ( num_n ) :
                wk.append ( f.read ( ) )
                res += 1
                num_x -= wk [ i ]
            wk.sort ( )
            is_exit = False
            while not is_exit :
                if num_x >= wk [ 0 ] :
                    num_x -= wk [ 0 ]
                    res += 1
                else :
                    is_exit = True
            print ( res )
    def solveC ( self ) :
        with open ( self.topping , 'r' ) as f :
            num_n = f.read ( )
            num_x = f.read ( )
        wk = [ ]
        res = 0
        for i in range ( num_n ) :
            wk.append ( f.read ( ) )
            res += 1
            num_x -= wk [ i ]
        wk.sort ( )
        is_exit = False
        while not is_exit :
            if num_x >= wk [ 0 ] :
                num_x -= wk [ 0 ]
                res += 1
            else :
                is_exit = True
        print ( res )
return A , solveB , solveC , solveD
