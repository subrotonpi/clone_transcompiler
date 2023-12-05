def test_bad ( dists , start_node ) :
    import random
    import sys
    class Lost ( object ) :
        def __init__ ( self ) :
            self.stdin = open ( 'lost.stdin' , 'w' )
            self.stdout = open ( 'lost.stdout' , 'w' )
            self.stdout.write ( '\n' )
            self.stdin.close ( )
            self.stdout = open ( 'lost.stdout' , 'w' )
            self.stdout.write ( '\n' )
            self.stdin.close ( )
            self.stdout.close ( )
        def readline ( self ) :
            return int ( self.stdin.readline ( ) )
        def readline ( self ) :
            return next ( self.stdin.readline ( ) )
        def readline ( self ) :
            return next ( self.stdin.readline ( ) )
        def readline ( self ) :
            return next ( self.stdin.readline ( ) )
        def readline ( self ) :
            return next ( self.stdin.readline ( ) )
        def readline ( self ) :
            return next ( self.stdin.readline ( ) )
        def readline ( self ) :
            return next ( self.stdin.readline ( ) )
        def readline ( self ) :
            return next ( self.stdin.readline ( ) )
        def readline ( self ) :
            return next ( self.stdin.readline ( ) )
        def readline ( self ) :
            return next ( self.stdin.readline ( ) )
        def readline ( self ) :
            return next ( self.stdin.readline ( ) )
        def readline ( self ) :
            return next ( self.stdin.readline ( ) )
        def readline ( self ) :
            return next ( self.stdin.readline ( ) )
        def readline ( self ) :
            return next ( self.stdin.readline ( ) )
        def readline ( self ) :
            return next ( self.stdin.readline ( ) )
    return Lost
