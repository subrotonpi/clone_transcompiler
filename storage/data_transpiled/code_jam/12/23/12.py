def _main ( ) :
    import os
    import imp
    import random
    import sys
    import time
    class C1 ( object ) :
        def __init__ ( self ) :
            self.n , self.P , self.cnt = 0 , 0 , 0
            self.a = [ ]
            self.rng = random.Random ( 0 )
            self.found = False
            self.stdout = open ( 'c.out' , 'w' )
            self.stdout.write ( '%d %d\n' % ( self.cnt , self.cnt ) )
            self.stdout.write ( '%d %d\n' % ( self.cnt , self.cnt ) )
            self.stdout.write ( '%d %d\n' % ( self.cnt , self.cnt ) )
            self.stdout.write ( '%d %d\n' % ( self.cnt , self.cnt ) )
            self.stdout.write ( '%d %d\n' % ( self.cnt , self.cnt ) )
            self.stdout.write ( '%d %d\n' % ( self.cnt , self.cnt ) )
            self.stdout.write ( '%d %d\n' % ( self.cnt , self.cnt ) )
            self.stdout.write ( '%d %d\n' % ( self.cnt , self.cnt ) )
            self.stdout.write ( '%d %d\n' % ( self.cnt , self.cnt ) )
            self.stdout.write ( '%d %d\n' % ( self.cnt , self.cnt ) )
            self.stdout.write ( '%d %d\n' % ( self.cnt , self.cnt ) )
            self.stdout.write ( '%d %d\n' % ( self.cnt , self.cnt ) )
            self.stdout.write ( '%d %d\n' % ( self.cnt , self.cnt ) )
