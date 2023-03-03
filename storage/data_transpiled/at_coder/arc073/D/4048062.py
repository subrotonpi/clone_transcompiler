def main ( ) :
    import sys
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            sc = random.choice ( [ '-' , '-' , '-' ] )
            n , q = sc.randint ( 0 , 10 )
            a , b = sc.randint ( 0 , 10 ) , sc.randint ( 0 , 10 )
            x = [ ]
            for i in range ( q ) :
                x.append ( sc.randint ( 0 , 10 ) )
            self.pop ( )
        def propagate ( self ) :
            k = 0
            while ( self.pop ( ) >> k ) :
                k += 1
                k -= 1
            for i in range ( 0 , q ) :
                v = self.pop ( )
                self.pop ( )
                self.pop ( )
            self.pop ( )
    def propagate ( self ) :
        for i in range ( 0 , q ) :
            if self.pop ( ) == 1 :
                self.pop ( )
            self.pop ( )
    def pop_up ( self ) :
        for i in range ( 0 , q ) :
            self.pop ( )
    def propagate ( self ) :
        for i in range ( 0 , q ) :
            self.pop ( )
    def propagate ( self ) :
        for i in range ( 0 , q ) :
            self.pop ( )
    def propagate ( self ) :
        for i in range ( 0 , q ) :
            self.pop ( )
    def propagate ( self ) :
        for i in range ( 0 , q ) :
            self.pop ( )
    def propagate ( self ) :
        for i in range ( 0 , q ) :
            self.pop ( )
    return propagate , ( )
