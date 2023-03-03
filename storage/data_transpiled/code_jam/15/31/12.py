def _import ( ) :
    from os import getenv
    from os.path import join
    from os import sep
    from os.path import join
    class A ( object ) :
        def __init__ ( self ) :
            super ( A , self ).__init__ ( )
        def readline ( self ) :
            while not self.readline or not self.readline :
                self.readline = join ( self.readline , '' )
            return self.readline
        def readline ( self ) :
            return join ( self.readline , '' )
        def readline ( self ) :
            return join ( self.readline , '' )
        def solve ( self ) :
            r , c , w = select ( [ 'r' , 'c' , 'w' ] , [ ] , [ ] )
            cc = ( ( c + w - 1 ) / w ) * r
            cc += w - 1
            print ( cc , file = sys.stderr )
        def solve ( self ) :
            with open ( 'input.txt' , 'r' ) as f :
                with open ( 'output.txt' , 'w' ) as f :
                    t = select ( [ ] , [ ] , [ ] )
                    for i in range ( t ) :
                        f.write ( 'Case #%d: ' % ( i + 1 ) )
                        solve ( )
    return A
