def _ import _ , os , sys , fname , verbose = False ) :
    import os , os , sys
    import os , sys
    import os , sys
    import os , sys
    import os , sys
    import subprocess , subprocess , subprocess , sys
    class C ( object ) :
        fname = 'C-large'
        DEBUG = False
        LEFT = [ 1 << 20 ]
        RIGHT = [ 1 << 20 ]
        def solution ( self ) :
            for i in range ( 1 , len ( self.left ) ) :
                self.left = self.left [ i ]
                self.right = self.right [ i ]
        def next ( self ) :
            self.next ( )
            return self.left [ i ]
        def win ( self , a ) :
            self.next ( )
            return self.right [ i ]
        def eval ( self ) :
            return self.eval ( )
        def eval ( self ) :
            return self.eval ( )
        def readline ( self ) :
            return self.readline ( )
        def main ( self ) :
            subprocess.call ( [ None , C ( ) , '' , 1 << 28 ] )
    def solve ( self ) :
        a1 = stdin.readline ( )
        a2 = stdin.readline ( )
        b1 = stdin.readline ( )
        b2 = stdin.readline ( )
        res = fast ( a1 , a2 , b1 , b2 )
        if verbose :
            if slow ( a1 , a2 , b1 , b2 ) != res :
                print ( 'too bad' )
        return repr ( res )
    def fast ( a1 , a2 , b1 , b2 ) :
        if a2 - a1 > b2 - b1 :
            tmp = a1
            a1 = b1
            b1 = tmp
            tmp = a2
            a2 = b2
            b2 = tmp
        res = 0
        for a in range ( a1 , a2 + 1 ) :
            l = LEFT [ a ]
            r = RIGHT [ a ]
            cur = b2 - b1 + 1 - sum ( b1 , b2 , l , r )
            if verbose :
                if cur != slow ( a , a , b1 , b2 ) :
                    print ( 'bad' )
            res += cur
        return res
    return C ( )
