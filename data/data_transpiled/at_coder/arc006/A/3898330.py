def _import ( ) :
    import sys
    import os
    import sys
    import os
    import __builtin__ as builtins
    import __builtin__ as builtins
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = SC ( sys.stdin )
            self.combo = 0
            self.bonus = False
            self.age = [ [ 0 for i in range ( 10 ) ] for j in range ( 2 ) ]
            for i in range ( 6 ) :
                self.age [ self.sc.randint ( 0 , 1 ) ] += 1
            B = self.sc.randint ( 1 , 1 )
            for i in range ( 6 ) :
                self.age [ self.sc.randint ( 1 , 1 ) ] += 1
            for i in range ( 10 ) :
                if self.age [ i ] [ 1 ] > 0 and i == B :
                    self.bonus = True
            for i in range ( 10 ) :
                self.combo += self.age [ i ] [ 0 ] * self.age [ i ] [ 1 ]
            if self.combo == 6 :
                self.pl ( 1 )
            elif self.combo == 5 and self.bonus :
                self.pl ( 2 )
            elif self.combo == 5 and not self.bonus :
                self.pl ( 3 )
            elif self.combo == 4 :
                self.pl ( 4 )
            elif self.combo == 3 :
                self.pl ( 5 )
            else :
                self.pl ( 0 )
    class SC ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            self.tokens = None
        def readline ( self ) :
            if not self.tokens or not self.tokens [ 0 ] :
                try :
                    self.tokens = self.tokens [ 0 ]
                except IndexError :
                    raise __builtin__.ArgumentError ( 'No tokens in file %r' % self.tokens [ 0 ] )
            return self.tokens [ 0 ]
    return Main
