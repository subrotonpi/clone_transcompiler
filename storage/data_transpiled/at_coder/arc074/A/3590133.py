def _import ( ) :
    from StringIO import StringIO
    from random import randint
    from random import randint
    from random import randint
    from random import choice
    from random import random
    from random import choice
    from random import random
    from random import random
    from random import choice
    from random import random
    from random import random
    from random import choice
    from random import random
    from random import random
    from random import randrange
    from random import random
    from random import choice
    from random import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.input_file = sys.stdin
            self.output_file = sys.stdout
            self.inp = FasterScanner ( self.input_file )
            self.output_file = sys.stdout
            self.solver = TaskC ( )
            self.solve ( 1 , self.inp , self.output_file )
            self.output_file.close ( )
    class TaskC ( object ) :
        def solve ( self , test_number , f , g ) :
            w , h = next ( self.input_file ) , next ( self.output_file )
            ans = int ( test_number )
            if w % 3 == 0 or h % 3 == 0 :
                ans = 0
            elif w % 2 == 0 and h % 2 == 0 :
                ans = min ( w , h ) / 2
            elif w % 2 == 0 :
                ans = w / 2
            elif h % 2 == 0 :
                ans = h / 2
            elif h == w :
                ans = ( w / 2 ) * ( h / 2 )
            if w < ans :
                ans = w
            if h < ans :
                ans = h
            self.output_file.write ( ans )
    class FasterScanner ( object ) :
        def __init__ ( self , f ) :
            self.input_file = f
            self.output_file = f
            self.bufpointer = self.buflength
            self.buflength = self.buflength
        def has_next_byte ( self ) :
            if self.bufpointer < self.buflength :
                return True
            self.bufpointer = 0
            try :
                self.buflength = self.buflength
            except AttributeError :
                pass
            return ( self.buflength > 0 )
        def read ( self ) :
            return self.input_file
            