def _import ( ) :
    import sys
    import os
    import os
    import sys
    import os
    import subprocess
    import subprocess
    import shlex
    class Main ( subprocess ) :
        def __init__ ( self ) :
            self.n , self.m = sc.randint ( 0 , 1 )
            self.lists = [ [ ] for i in range ( 0 , self.m ) ]
            self.lists = [ [ ] for i in range ( self.n ) ]
            for l , r in zip ( self.lists , self.lists [ - 1 ] ) :
                self.lists [ r - l + 1 ].append ( l )
            self.solve ( )
        def solve ( self ) :
            lengthy = self.n
            ft = FenwickTreeRange ( self.m )
            for d in range ( 1 , self.m + 1 ) :
                ans = 0
                for i in range ( d , self.m + 1 , d ) :
                    ans += ft.elment ( i )
                ans += lengthy
                print ( ans )
                for start in self.lists [ d ] :
                    ft.update_range ( start , start + d , 1 )
                lengthy -= len ( self.lists [ d ] )
    class FastReader ( subprocess.PIPE ) :
        def readline ( self ) :
            import sys
            import shlex
            st = shlex.split ( sys.stdin )
            def next ( self ) :
                while not st or not st :
                    try :
                        st = shlex.split ( self.st )
                    except :
                        pass
                    return st [ 0 ]
                return st [ 1 ]
            def randint ( self ) :
                return int ( self.st [ 0 ] )
            def long ( self ) :
                return long ( self.st [ 1 ] )
            def uniform ( self ) :
                return float ( self.st [ 2 ] )
            def readline ( self ) :
                return ''
    return FastReader ( )
